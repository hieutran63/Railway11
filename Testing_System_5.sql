USE Testing_System_Assignment_3;

-- Question 1: Tạo view có chứa danh sách nhân viên thuộc phòng ban sale
-- (Subquery)
	CREATE OR REPLACE VIEW Staff_Of_Sale AS
		SELECT 	AccountID, FullName, DepartmentName
        FROM	Department 
        JOIN	`Account`  USING(DepartmentID)
        WHERE	DepartmentName = 'Sale';
        
        SELECT 	*
        FROM	Staff_Of_Sale;
    
-- (CTE)
   WITH	 Staff_Of_Sale
   AS(
		SELECT	A.*, D.DepartmentName
        FROM	Department D
        JOIN	`Account` A ON A.DepartmentID = D.DepartmentID
        WHERE	DepartmentName = 'Sale'
	 )
        SELECT 	*
        FROM	Staff_Of_Sale;
        
-- Question 2: Tạo view có chứa thông tin các account tham gia vào nhiều group nhất
-- (Subquery)
	CREATE VIEW Accounts_Join_Groups 
    AS
		SELECT		*, COUNT(AccountID)
        FROM		`Account`
        JOIN		GroupAccount USING(AccountID)
        GROUP BY 	AccountID
        HAVING		COUNT(AccountID) = (SELECT		 COUNT(AccountID)
										FROM		`Account`
										JOIN		GroupAccount USING(AccountID)
										GROUP BY 	AccountID
                                        ORDER BY	COUNT(AccountID) DESC
                                        LIMIT		1
                                        );
                                        
		SELECT 	*
        FROM	Accounts_Join_Groups;
        
-- (CTE)
	WITH Accounts_Join_Groups 
    AS(
		SELECT		COUNT(AccountID)
		FROM		`Account`
		JOIN		GroupAccount USING(AccountID)
		GROUP BY 	AccountID
		ORDER BY	COUNT(AccountID) DESC
		LIMIT		1
	)
		SELECT		*,COUNT(AccountID)
		FROM		`Account`
		JOIN		GroupAccount USING(AccountID)
		GROUP BY 	AccountID
		HAVING		 COUNT(AccountID) = (SELECT * FROM Accounts_Join_Groups);
        
/* Question 3: Tạo view có chứa câu hỏi có những content quá dài (content quá 300 từ 
 được coi là quá dài) và xóa nó đi */
 -- (SubQuery)
	CREATE OR REPLACE VIEW Question_MaxContent AS
		SELECT	Length(Content)
		FROM	Question
		WHERE	Length(Content) > 20;
        
        SELECT 	*
        FROM	Question_MaxContent;
 
-- (CTE)
    WITH	Question_MaxContent
	AS(
		SELECT	Length(Content)
		FROM	Question
		WHERE	Length(Content) > 20
	   )
       SELECT 	*
        FROM	Question_MaxContent;
        
 -- Question 4: Tạo view có chứa danh sách các phòng ban có nhiều nhân viên nhất
-- (Subquery)
	
	CREATE OR REPLACE  VIEW	Staffs_Of_Department 
    AS
		SELECT		*, COUNT(DepartmentID)
        FROM		Department
        JOIN		`Account` USING(DepartmentID)
        GROUP BY 	DepartmentID
        HAVING		COUNT(DepartmentID) = (	SELECT 		COUNT(DepartmentID)
											FROM		Department
											JOIN		`Account` USING(DepartmentID)
                                            GROUP BY	DepartmentID
                                            ORDER BY	COUNT(DepartmentID) DESC
                                            LIMIT		1
                                            );
		SELECT 		*
        FROM		Staffs_Of_Department;
        
-- (CTE)
		WITH List_Staffs_Of_Department
        AS (
			SELECT 		COUNT(DepartmentID)
			FROM		Department
			JOIN		`Account` USING(DepartmentID)
			GROUP BY	DepartmentID
			ORDER BY	COUNT(DepartmentID) DESC
			LIMIT		1
		)
			SELECT		*, COUNT(DepartmentID)
			FROM		Department
			JOIN		`Account` USING(DepartmentID)
			GROUP BY 	DepartmentID
            HAVING		COUNT(DepartmentID) = (SELECT * FROM List_Staffs_Of_Department);
			
-- Question 5: Tạo view có chứa tất các các câu hỏi do user họ Nguyễn tạo
-- (Subquery)
	CREATE OR REPLACE VIEW	QuesHoNguyen
    AS
		SELECT		Q.*, A.FullName
        FROM		Question Q
        JOIN		`Account` A ON A.AccountID = Q.CreatorID
        WHERE		SUBSTRING_INDEX(FullName,' ',1) = 'Nguyen';
        
        SELECT 		*
        FROM		QuesHoNguyen;
        
-- (CTE)
	WITH  QuesHoNguyen  
    AS(
		SELECT		Q.*, A.FullName
        FROM		Question Q
        JOIN		`Account` A ON A.AccountID = Q.CreatorID
        WHERE		SUBSTRING_INDEX(FullName,' ',1) = 'Nguyen'
       ) 
        SELECT 		*
        FROM		QuesHoNguyen;
       
        
        
        
       
        
		