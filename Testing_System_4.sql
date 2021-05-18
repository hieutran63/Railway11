USE Testing_System_Assignment_3;

-- Ex 1: JOIN

-- Question 1: Viết lệnh để lấy ra danh sách nhân viên và thông tin phòng ban của họ
	SELECT		FullName, DepartmentName
    FROM		`Account`
    JOIN 		Department USING(DepartmentID);
    
-- Question 2: Viết lệnh để lấy ra thông tin các account được tạo sau ngày 20/12/2010
	SELECT	*
    FROM		`Account`
    WHERE		CreateDate > '2010-12-20';
    
-- Question 3: Viết lệnh để lấy ra tất cả các developer 
	SELECT		*
    FROM		`Account` 
    JOIN		`Position` USING(PositionID)
	WHERE		PositionName = 'Dev';
    
-- Question 4: Viết lệnh để lấy ra danh sách các phòng ban có >3 nhân viên
	SELECT 		DepartmentName, COUNT(DepartmentID)
    FROM		Department 
    JOIN		`Account` USING(DepartmentID)
	GROUP BY	DepartmentName
    HAVING		COUNT(DepartmentID) >= 2;
    
--  Question 5: Viết lệnh để lấy ra danh sách câu hỏi được sử dụng trong đề thi nhiều nhất
	SELECT		*, COUNT(QuestionID)
    FROM		Question
    JOIN		ExamQuestion USING(QuestionID)
    GROUP BY	QuestionID
    HAVING		COUNT(QuestionID) = (SELECT 	COUNT(QuestionID)
									FROM		Question
                                    JOIN		ExamQuestion USING(QuestionID)
                                    GROUP BY	QuestionID
                                    ORDER BY    COUNT(QuestionID) DESC
                                    LIMIT		1
                                    );
                                    
-- Cách khác 
	SELECT		*, COUNT(QuestionID)
    FROM		Question
    JOIN		ExamQuestion USING(QuestionID)
    GROUP BY	QuestionID
    HAVING		COUNT(QuestionID) = (SELECT Max(CountQ)
									 FROM (
											SELECT COUNT(QuestionID) AS CountQ
                                            FROM		Question
											JOIN		ExamQuestion USING(QuestionID)
											GROUP BY	QuestionID) AS MaxCountQ);

--  Question 6: Thông kê mỗi category Question được sử dụng trong bao nhiêu Question
	SELECT		CategoryID, CategoryName, COUNT(CategoryID)
    FROM		CategoryQuestion
    JOIN		Question USING(CategoryID)
    GROUP BY	CategoryID;

-- Question 7: Thông kê mỗi Question được sử dụng trong bao nhiêu Exam
	SELECT  	QuestionID, Content, COUNT(QuestionID)
    FROM		Question
    JOIN		ExamQuestion USING(QuestionID)
    GROUP BY	QuestionID;
    
-- Question 8: Lấy ra Question có nhiều câu trả lời nhất
	SELECT		*, COUNT(QuestionID)
    FROM		Question
    JOIN		Answer USING(QuestionID)
    GROUP BY	QuestionID
    HAVING		COUNT(QuestionID) = (SELECT 	COUNT(QuestionID)
									FROM		Question
                                    JOIN		Answer USING(QuestionID)
                                    GROUP BY	QuestionID
                                    ORDER BY    COUNT(QuestionID) DESC
                                    LIMIT		1
                                    );
                                    
-- Cách khác 
	SELECT		*, COUNT(QuestionID) AS So_luong
    FROM		Question
    JOIN		Answer USING(QuestionID)
    GROUP BY	QuestionID
    HAVING		COUNT(QuestionID) = (SELECT MAX(CountQ)
									 FROM
										(SELECT 	COUNT(QuestionID) AS CountQ
                                         FROM		Question
										 JOIN		Answer USING(QuestionID)
										 GROUP BY	QuestionID) AS MAXCountQ);

-- Question 9: Thống kê số lượng account trong mỗi group 
	SELECT		GroupID, GroupName, COUNT(AccountID) AS So_luong
    FROM		GroupAccount
    LEFT JOIN	`Group` USING(GroupID)
    GROUP BY	GroupID;
    
--  Question 10: Tìm chức vụ có ít người nhất
-- (C1)
	SELECT		*, COUNT(PositionID)
    FROM		`Position`
    JOIN	    `Account` USING(PositionID)
    GROUP BY	PositionID
    HAVING		COUNT(PositionID) = (SELECT 	COUNT(PositionID)
									 FROM		`Position`
                                     JOIN		`Account` USING(PositionID)
                                     GROUP BY	PositionID
                                     ORDER BY	COUNT(PositionID) ASC
                                     LIMIT		1
                                     );
    
-- (C2)   
	SELECT		*, COUNT(PositionID)
    FROM		`Position`
    JOIN	    `Account` USING(PositionID)
    GROUP BY	PositionID
    HAVING		COUNT(PositionID) = (SELECT MIN(CountP)
									 FROM
										(SELECT 	COUNT(PositionID) AS CountP
										 FROM		`Position`
										 JOIN		`Account` USING(PositionID)
										 GROUP BY	PositionID) AS MINCountP);
 
--  Question 11: Thống kê mỗi phòng ban có bao nhiêu dev, test, scrum master, PM
	SELECT		PositionID, AccountID, DepartmentID, GROUP_CONCAT(PositionName), count(DepartmentID) AS ' So Luong Nhan Vien'
	FROM		`Account`
	JOIN		`Position` USING (PositionID)
	WHERE 		PositionName IN ('Dev', 'Test', 'Scrum Master', 'PM')			
	GROUP BY	DepartmentID;
    
/* Question 12: Lấy thông tin chi tiết của câu hỏi bao gồm: thông tin cơ bản của 
question, loại câu hỏi, ai là người tạo ra câu hỏi, câu trả lời là gì, … */
	SELECT		Q.Content AS 'Cau hoi', TQ.TypeName AS 'Loai cau hoi', Acc.FullName AS 'Nguoi tao cau hoi', A.Content AS 'Cau tra loi'
	FROM		Question Q
	LEFT JOIN	Answer A ON A.QuestionID = Q.QuestionID
	JOIN		Typequestion TQ ON TQ.TypeID = Q.TypeID
	JOIN		`Account` Acc ON Acc.AccountID = Q.CreatorID
	ORDER BY 	Q.Content ASC;
    
--  Question 13: Lấy ra số lượng câu hỏi của mỗi loại tự luận hay trắc nghiệm  
	SELECT  	TypeName, COUNT(Q.TypeID)
    FROM		Question Q
    JOIN		TypeQuestion TQ ON Q.TypeID = TQ.TypeID
    GROUP BY	Q.TypeID;
    
--  Question 14:Lấy ra group không có account nào
	SELECT		*
    FROM		`Group` 
    LEFT JOIN	GroupAccount USING(GroupID) 
    WHERE		AccountID IS NULL;
    
-- Question 15: Lấy ra group không có account nào
	SELECT		*
    FROM		`Group`
    WHERE		GroupID NOT IN (SELECT  GroupID
								FROM	GroupAccount
								);
  
-- Question 16: Question 16: Lấy ra question không có answer nào 
	SELECT		*
    FROM		Question 
    LEFT JOIN	Answer USING(QuestionID)
    WHERE		AnswerID IS NULL;
    
-- Ex 2: UNION

/* Question 17: 
	a) Lấy các account thuộc nhóm thứ 1
	b) Lấy các account thuộc nhóm thứ 2
	c) Ghép 2 kết quả từ câu a) và câu b) sao cho không có record nào trùng nhau */	
    
    SELECT 		FullName, GroupID
	FROM 		`Account` A
	JOIN 		GroupAccount GA ON A.AccountID = GA.AccountID
	WHERE 		GA.GroupID = 1
    
	UNION
    
	SELECT 		FullName, GroupID
	FROM 		`Account` A
	JOIN 		GroupAccount GA ON A.AccountID = GA.AccountID
	WHERE 		GA.GroupID = 2;
    
/*  Question 18: 
		a) Lấy các group có lớn hơn 5 thành viên
		b) Lấy các group có nhỏ hơn 7 thành viên
		c) Ghép 2 kết quả từ câu a) và câu b)  */
    
		SELECT 		G.GroupName, COUNT(1) AS so_luong
		FROM 		`Group` G
		JOIN 		GroupAccount GA ON G.GroupID = GA.GroupID
		GROUP BY	GA.GroupID
		HAVING 		so_luong >= 2 

		UNION

		SELECT 		G.GroupName, COUNT(1) AS so_luong
		FROM 		`Group` G
		JOIN 		GroupAccount GA ON G.GroupID = GA.GroupID
		GROUP BY	GA.GroupID
		HAVING 		so_luong < 7; 
    