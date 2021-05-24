USE Testing_System_Assignment_3;

-- Question 1: Tạo store để người dùng nhập vào tên phòng ban và in ra tất cả các account thuộc phòng ban đó
DROP PROCEDURE IF EXISTS Account_Of_Department;

DELIMITER $$
	CREATE PROCEDURE Account_Of_Department(IN in_DepartmentName	NVARCHAR(50))
		BEGIN	
			SELECT		*
            FROM		Department 
			JOIN		`Account` USING(DepartmentID)
            WHERE 		DepartmentName = in_DepartmentName;
		END$$
DELIMITER ;

	CALL Account_Of_Department ('SALE');
    
--  Question 2: Tạo store để in ra số lượng account trong mỗi group  
DROP PROCEDURE IF EXISTS Account_Of_Group;

DELIMITER $$
	CREATE PROCEDURE Account_Of_Group()
		BEGIN
			SELECT		GroupID, COUNT(AccountID)
            FROM		GroupAccount
			GROUP BY	GroupID;
        END$$
DELIMITER ;

	CALL	Account_Of_Group();	
    
-- Question 3: Tạo store để thống kê mỗi type question có bao nhiêu question được tạo trong tháng hiện tại
DROP PROCEDURE IF EXISTS TypeQuestion_Month;

DELIMITER $$
	CREATE PROCEDURE TypeQuestion_Month()
	BEGIN
		SELECT	*, COUNT(TypeID)
		FROM	Question
		WHERE	MONTH(CreateDate) = MONTH(NOW())
		AND		YEAR(CreateDate) = YEAR(NOW());
	END$$
DELIMITER ;

		CALL	TypeQuestion_Month();
    
-- Question 4: Tạo store để trả ra id của type question có nhiều câu hỏi nhất
DROP PROCEDURE IF EXISTS get_typeID_question;
DELIMITER $$
CREATE PROCEDURE get_typeID_question( OUT out_typeID_of_question TINYINT UNSIGNED)
	BEGIN
		SELECT 		Q.TypeID INTO out_typeID_of_question
		FROM		Question Q
		JOIN 		TypeQuestion TQ ON TQ.TypeID=Q.TypeID
		GROUP BY 	Q.TypeID
		HAVING COUNT(Q.QuestionID) = (SELECT 	 COUNT(Q1.QuestionID)
										FROM 	 Question Q1
										JOIN 	 TypeQuestion TQ1 ON TQ1.TypeID=Q1.TypeID
										GROUP BY Q1.TypeID
										ORDER BY COUNT(Q1.QuestionID) DESC
										LIMIT 1 )
		ORDER BY 	Q.TypeID DESC
		LIMIT 1;
	END $$
DELIMITER $$;
 
		SET 		@TypeID = 0;
		CALL		get_typeID_question(@TypeID);
		SELECT		@TypeID;
    
--  Question 5: Sử dụng store ở question 4 để tìm ra tên của type question
-- Chữa bài 5
-- C1: tạo store producer có 1 input là IN typeID Unsigned
DROP PROCEDURE IF EXISTS get_typeID_question_5;

DELIMITER $$
	CREATE PROCEDURE get_typeID_question_5(IN in_typeID TINYINT UNSIGNED)
    BEGIN
		SELECT  *
        FROM	TypeQuestion
        WHERE	TypeName = in_typeID;
    END $$
DELIMITER ;

	CALL get_typeID_question_5('2');

-- C2: tạo hàm thủ tục không có input, sử dụng hàm thủ tục bài 4
DROP PROCEDURE IF EXISTS get_typeID_question_5a;

DELIMITER $$
	CREATE PROCEDURE get_typeID_question_5a()
		BEGIN
			DECLARE	type_ID TINYINT;
            SET		type_ID = 0;
			CALL	get_typeID_question(type_ID);
			SELECT	*
            FROM	TypeQuestion t
            WHERE	t.typeID = typeID;
		END $$
DELIMITER ;	

	CALL Testing_System_Assignment_3.get_typeID_question_5('2');
    
/* Question 6: Viết 1 store cho phép người dùng nhập vào 1 chuỗi và trả về group có tên 
 chứa chuỗi của người dùng nhập vào hoặc trả về user có username chứa 
 chuỗi của người dùng nhập vào */

-- C1
DROP PROCEDURE IF EXISTS NameOfGroupOrUser;
DELIMITER $$
	CREATE PROCEDURE NameOfGroupOrUser(IN in_string VARCHAR(50))
		BEGIN
			SELECT 	G.GroupName
			FROM	`Group` G
            WHERE	G.GroupName LIKE CONCAT('%', in_string, '%');
            
            SELECT  A.UserName
			FROM	`Account` A
			WHERE   A.UserName  LIKE CONCAT('%', in_string, '%');
		END $$    
DELIMITER ; 
	CALL NameOfGroupOrUser('a');

-- C2 UNION
DROP PROCEDURE IF EXISTS NameOfGroupOrUser;
DELIMITER $$
	CREATE PROCEDURE NameOfGroupOrUser(IN in_string VARCHAR(50))
		BEGIN
			SELECT 	GroupID, GroupName, 'Group'
			FROM	`Group` 
            WHERE	GroupName LIKE CONCAT('%', in_string, '%')
            UNION
            SELECT  AccountID, UserName, 'Account'
			FROM	`Account` 
			WHERE   UserName  LIKE CONCAT('%', in_string, '%');
		END $$    
DELIMITER ; 
	CALL NameOfGroupOrUser('a');
 
 /* Question 7: Viết 1 store cho phép người dùng nhập vào thông tin fullName, email và 
 trong store sẽ tự động gán:
			username sẽ giống email nhưng bỏ phần @..mail đi
			positionID: sẽ có default là developer
			departmentID: sẽ được cho vào 1 phòng chờ
	 Sau đó in ra kết quả tạo thành công*/ 

-- input: fullname - email
-- viết 1 hàm thủ tục truyền vào 2 input như trên
-- insert 1 account vào table account gồm 5 trường: Email,UserName, FullName, DepartmentID,	PositionID

-- Cách 1
 DROP PROCEDURE IF EXISTS Question7;
 
 DELIMITER $$
	CREATE PROCEDURE Question7(IN in_fullName NVARCHAR(50), IN in_email VARCHAR(50))
		BEGIN
			INSERT INTO `Account`(  Email  ,  		UserName 			   , FullName   , DepartmentID, PositionID  , CreateDate)   
			VALUES    			 (in_email ,SUBSTRING_INDEX(in_email,"@",1),in_fullName ,      '1'    ,    '1'      ,    NOW()  );
            
            SELECT 	*
            FROM	`Account`;
        END $$
 DELIMITER ;
	CALL Question7(N'Trần Trọng Hiếu','hieu@gmail.com');
     
/*  Question 8: Viết 1 store cho phép người dùng nhập vào Essay hoặc Multiple-Choice
 để thống kê câu hỏi essay hoặc multiple-choice nào có content dài nhất */   
 -- C1
DROP PROCEDURE IF EXISTS ContentDainhat;

DELIMITER $$
	CREATE PROCEDURE ContentDainhat(IN LoaiCauHoi ENUM('Multiple-choice', 'Eassy'))
        BEGIN
			 SELECT  * , length(Q.Content) 
             FROM 	 Question Q
			 JOIN 	 TypeQuestion TQ ON TQ.TypeID = Q.TypeID
			 WHERE 	 (LoaiCauHoi = 'Multiple-choice' and Q.TypeID = 2 )
				OR 	 (LoaiCauHoi = 'Eassy' and Q.TypeID = 1)
			ORDER BY length(Q.Content) DESC 
            LIMIT 	 1;
		END $$
DELIMITER ;

	Call ContainDainhat('Eassy');
 
-- C2 
DROP PROCEDURE IF EXISTS  Max_Contnet_With_TypeName;
 
DELIMITER $$
	CREATE PROCEDURE Max_Contnet_With_TypeName (IN in_typename VARCHAR(20))
		BEGIN
			IF (in_TypeName = 'Essay') THEN
				SELECT	Content, MAX(LENGTH(Content))
				FROM	Question
				WHERE	TypeID = 1;
			ELSEIF (in_TypeName = 'Multiple-Choice') THEN
				SELECT	Content, MAX(LENGTH(Content))
				FROM	Question
				WHERE	TypeID = 2;
			END IF;
        END$$
DELIMITER ;  
 
		CALL Max_Contnet_With_TypeName('Essay');
        
 -- Question 9: Viết 1 store cho phép người dùng xóa exam dựa vào ID
 DROP PROCEDURE IF EXISTS  DeleteExamWithID;
 
 DELIMITER $$
	CREATE PROCEDURE DeleteExamWithID (IN in_ExamID TINYINT UNSIGNED)
		BEGIN
			DELETE
            FROM	Exam
            WHERE	ExamID = in_ExamID;
        END$$
DELIMITER ;       

		SET 	FOREIGN_KEY_CHECKS = 0;
		CALL 	DeleteExamWithID('1');
        
        SELECT 	* FROM exam;

/* Question 10: Tìm ra các exam được tạo từ 3 năm trước và xóa các exam đó đi (sử 
dụng store ở câu 9 để xóa)
		Sau đó in số lượng record đã remove từ các table liên quan trong khi removing*/
DROP PROCEDURE IF EXISTS DeleteExamWithID1;

DELIMITER $$
	CREATE PROCEDURE DeleteExamWithID1 ()
		BEGIN
			DECLARE ExamID_1 INT;
			WITH ExamID3Year
            AS	(
				SELECT 	ExamID
                FROM	Exam
                WHERE	(YEAR(NOW()) - YEAR(CreateDate)) >= 3
				)
                SELECT 	ExamID INTO ExamID_1
                FROM	ExamID3Year
				LIMIT	1;
                CALL DeleteExamWithID(ExamID_1);
		END $$
DELIMITER ;

	CALL DeleteExamWithID1();
    
/* Question 11: Viết store cho phép người dùng xóa phòng ban bằng cách người dùng 
 nhập vào tên phòng ban và các account thuộc phòng ban đó sẽ được 
 chuyển về phòng ban default là phòng ban chờ việc*/       
DROP PROCEDURE IF EXISTS DeleteDepartment;

DELIMITER $$
CREATE PROCEDURE DeleteDepartment(IN in_DepartmentName VARCHAR(50))
BEGIN
	UPDATE 	`Account`
    SET		DepartmentID = 10
    WHERE	DepartmentID = (SELECT 	DepartmentID	
							FROM	Department
							WHERE 	DepartmentName = in_DepartmentName);
	DELETE 
    FROM	Department
    WHERE	DepartmentName = in_DepartmentName;
END$$
DELIMITER ;

-- Chữa Q11
DROP PROCEDURE IF EXISTS DeleteDaprtment1;

DELIMITER $$
CREATE PROCEDURE DeleteDaprtment1 (IN in_departmentName NVARCHAR(50))
	BEGIN
		-- khai báo biến in_departmentName để lưu lại id của phòng ban bạn muốn xóa
        DECLARE in_department_id INT;
        SET		FOREIGN_KEY_CHECKS = 0;
        
        SELECT	DepartmentID INTO in_department_id
        FROM	Department
        WHERE	DepartmentName = in_departmentName;
	
		DELETE
        FROM	Department
        WHERE	DepartmentName = in_departmentName;
        
        -- update lại DepartmentID = 10 các account thuộc in_DepartmentName
        UPDATE	`Account`
        SET		DepartmentID = 10
        WHERE	DepartmentID = in_department_id;
        
        SELECT  *
        FROM	`Account`;
    END $$
DELIMITER ;

	CALL DeleteDaprtment1('BẢO VỆ');
    
-- Question 12: Viết store để in ra mỗi tháng có bao nhiêu câu hỏi được tạo trong năm  nay
DROP PROCEDURE IF EXISTS CountQuestionInMonth;

DELIMITER $$
	CREATE PROCEDURE CountQuestionInMonth()
		BEGIN
			SELECT EachMonthInYear.MONTH, COUNT(QuestionID) AS COUNT
			FROM
			(
				 SELECT 1 AS MONTH
				 UNION SELECT 2 AS MONTH
				 UNION SELECT 3 AS MONTH
                 UNION SELECT 4 AS MONTH
				 UNION SELECT 5 AS MONTH
                 UNION SELECT 6 AS MONTH
				 UNION SELECT 7 AS MONTH
                 UNION SELECT 8 AS MONTH
				 UNION SELECT 9 AS MONTH
                 UNION SELECT 10 AS MONTH
				 UNION SELECT 11 AS MONTH
                 UNION SELECT 12 AS MONTH
			  ) AS EachMonthInYear 
              LEFT JOIN Question ON EachMonthInYear.MONTH = MONTH(CreateDate)
              GROUP BY 	EachMonthInYear.MONTH
			  ORDER BY 	EachMonthInYear.MONTH ASC;
        END $$
 DELIMITER ;       
 
	CALL CountQuestionInMonth();
 
 -- Question 13: Viết store để in ra mỗi tháng có bao nhiêu câu hỏi được tạo trong 6 tháng gần đây nhất
 -- (Nếu tháng nào không có thì sẽ in ra là "không có câu hỏi nào trong tháng")
 DROP PROCEDURE IF EXISTS Count_Ques_Previous_6_Month;
 
 DELIMITER $$
	CREATE PROCEDURE Count_Ques_Previous_6_Month()
		BEGIN
			SELECT Previous_6_Month.MONTH, COUNT(QuestionID) AS COUNT
            FROM
				(SELECT MONTH(CURRENT_DATE - INTERVAL 5 MONTH) AS MONTH
                UNION
                SELECT MONTH(CURRENT_DATE - INTERVAL 4 MONTH) AS MONTH
                UNION
                SELECT MONTH(CURRENT_DATE - INTERVAL 3 MONTH) AS MONTH
                UNION
                SELECT MONTH(CURRENT_DATE - INTERVAL 2 MONTH) AS MONTH
                UNION
                SELECT MONTH(CURRENT_DATE - INTERVAL 1 MONTH) AS MONTH
                UNION
                SELECT MONTH(CURRENT_DATE - INTERVAL 0 MONTH) AS MONTH
                
                ) AS Previous_6_Month
                LEFT JOIN Question ON Previous_6_Month.MONTH = MONTH(CreateDate)
                GROUP BY	Previous_6_Month.MONTH
                ORDER BY 	Previous_6_Month.MONTH ASC;
		END$$
DELIMITER ;
 
 

