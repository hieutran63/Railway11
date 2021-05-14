-- Question 1: Thêm ít nhất 10 record vào mỗi table

USE Testing_System_Assignment_3;

INSERT INTO Department	(DepartmentName  )
VALUES 					( N'TEST'		 ),
						( N'SALE'		 ),
						( N'BẢO VỆ'		 ),
						( N'NHÂN SỰ'	 ),
						( N'KỸ THUẬT'	 ),
						( N'TÀI CHÍNH'	 ),
						( N'PHÓ GIÁM ĐỐC'),
						( N'GIÁM ĐỐC'  	 ),
						( N'THƯ KÍ'		 ),
						( N'BÁN HÀNG'	 );
         
INSERT INTO `Position`(PositionName  )
VALUES  			  ('Dev'         ),
					  ('Test'        ),
					  ('Scrum Master'),
					  ('PM'          );
        
INSERT INTO `Account`(     Email				,  UserName ,    FullName      , DepartmentID, PositionID  , CreateDate)   
VALUES    			 ('nguyenngocanh@gmail.com' ,  'ngocanh','Nguyễn Ngọc Ánh' ,    '4'      ,  '2'        , '2020-03-18'),
					 ('nguyenxuanhoa@gmail.com' ,  'xuanhoa','Nguyễn Xuân Hòa' ,    '5'      ,  '1'        , '2018-07-19'),
                     ('tranphuongthao@gmail.com',  'thaozo' ,'Trần Phương Thảo',    '9'      ,  '2'        , '2018-02-25'),
                     ('nguyentuanminh@gmai.com' , 'tuanminh','Nguyễn Tuấn Minh',    '2'	   	 ,  '4'    	   , '2017-09-15'),
                     ('nguyenlanhuong@gmail.com', 'lanhuong','Nguyễn Lan Hương',    '9'      ,  '3'        , '2019-12-14'),
                     ('trantronghieu@gmail.com' , 'hieutran','Trần Trọng Hiếu' ,    '4'		 ,  '4' 	   ,  Null		 ),
                     ('doanmanhdo@gmail.com' 	, 'manhdo'  ,'Doãn Mạnh Do'    ,    '2'		 ,  '3' 	   , '2020-09-15'),
                     ('nguyenvananh@gmail.com'  , 'vananh'  ,'Nguyễn Vân Anh'  ,    '7'		 ,  '1' 	   , '2019-07-25'),
                     ('vuonggialinh@gmail.com'  , 'gialinh' ,'Vuong Gia Linh ' ,    '2'	 	 ,  '2' 	   , '2018-12-27'),
                     ('phamdoankhoa@gmail.com'  , 'khoadoan','Phạm Đoàn Khoa'  ,    '3'		 ,  '3' 	   , '2020-08-12');

INSERT INTO `Group` (GroupName  		, CreatorID , CreateDate )
VALUES				('Deverloper'		,    5      ,'2020-03-18'), 
					('Testing'   		,    5      ,'2018-07-19'),
                    ('Management'		,    4      ,'2020-09-15'),
                    ('Security'  		,    3      ,'2019-12-14'),
                    (N'VTI Creator'		,    6		,'2020-04-06'),
                    (N'VTI Marketing_1'	,    7		,'2020-04-07'),
                    (N'VTI Marketing_2'	,    8		,'2020-09-15'),
                    ('VTI_Sales_01'     ,    2      ,'2018-12-27'),
                    ('VTI_Sales_02'     ,    2      ,'2019-12-19'),
                    ('VTI_Sales_03'     ,    2      ,'2020-08-12');
                    
INSERT INTO GroupAccount (GroupID   ,  AccountID   , JoinDate    )
VALUES				     (   1  	,    	5      , '2020-03-18'),
						 (   2  	,   	8      , '2018-07-19'),
						 (	 3	 	,   	2	   , '2020-09-15'),
						 (   4  	,   	4      , '2019-12-14'),
						 (   5   	,   	3      , '2020-04-06'),
						 (	 7		,   	5	   , '2020-04-07'),
						 (	 1		,    	3	   , '2020-09-15'),
						 (	 3		,    	7	   , '2018-12-27'),
						 (	 8		,    	6	   , '2019-12-19'),
						 (	 10		,   	9      , '2020-08-12');
                         
INSERT INTO TypeQuestion (TypeName)  
VALUES					 ('Essay'),
						 ('Multiple-Choice');
                         
INSERT INTO CategoryQuestion(CategoryName ) 
VALUES						('PHP' 		  ),
							('JAVA'		  ),
                            ('ASP.NET'	  ),
                            ('PYTHON'	  ),
                            ('ADO.NET'	  ),
                            ('C#'		  ),
                            ('C++'	      ),
                            ('REACT_JS'	  ),
                            ('MYSQL'      ),
                            ('JAVA_SCRIPT');
                            
                            
INSERT INTO Question(Content     	 	 ,CategoryID ,TypeID ,CreatorID , CreateDate )
VALUES		 		('Hỏi về PHP'		 ,    1		 ,	 1	 , 	2		,'2018-07-18'),
					('Câu hỏi về JAVA'	 ,    2		 ,	 2	 , 	2		,'2019-11-07'),
					('Hỏi về ADO.NET'	 ,    5		 ,	 2	 , 	5		,'2018-08-13'),
                    ('Hỏi về PYTHON' 	 ,    4		 ,	 1	 , 	3		,'2017-07-05'),
                    ('Hỏi về ASP.NET'	 ,    3		 ,	 2	 , 	4		,'2018-06-27'),
                    ('Hỏi về C#'	 	 ,    6		 ,	 2	 , 	7		,'2019-06-14'),
                    ('Hỏi về REACT_JS'	 ,    5		 ,	 1	 , 	9		,'2020-08-11'),
                    ('Hỏi về JAVE_SCRIPT',    8		 ,	 1	 , 	10		,'2019-01-29'),
                    ('Câu hỏi về MYSQL'	,    10		 ,	 2	 , 	4		,'2019-10-17'),
                    ('Hỏi về C++' 		 ,    3		 ,	 2	 , 	8		,'2020-03-24');
                    
                    
INSERT INTO Answer  (Content	  , QuestionID,  isCorrect  )
VALUES				(N'Trả lời 1' ,     1	  , 	 false 	),
				    (N'Trả lời 2' ,     3     , 	 true 	),
				    (N'Trả lời 3' ,     2	  , 	 true 	),
				    (N'Trả lời 4' ,     3	  , 	 false	),
				    (N'Trả lời 5' ,     2	  , 	 false 	),
                    (N'Trả lời 6' ,     6	  , 	 true 	),
                    (N'Trả lời 7' ,     9	  , 	 true 	),
                    (N'Trả lời 9' ,     4	  , 	 false 	),
                    (N'Trả lời 8' ,     2	  , 	 false 	),
                    (N'Trả lời 10',     2	  , 	 true 	);
                    
INSERT INTO Exam (`Code`   , Title	       		 , CategoryID  , Duration, CreatorID	, CreateDate)
VALUES			 ('VTI001' , 'Đề thi JAVA'     	 , 		2    ,  60	   ,     2		,'2018-07-18'),
				 ('VTI002' , 'Đề thi PYTHON'	 , 		4    ,  60	   ,     3		,'2019-11-07'),
				 ('VTI003' , 'Đề thi PHP'   	 , 		1    ,  120	   ,     2		,'2018-08-13'),
                 ('VTI004' , 'Đề thi ASP.NET'	 , 		3    ,  120	   ,     4		,'2019-07-05'),
                 ('VTI005' , 'Đề thi ADO.NET'	 , 		5    ,  60	   ,     5		,'2018-06-27'),
                 ('VTI006' , 'Đề thi C++'		 , 		9    ,  120	   ,     4		,'2020-09-30'),
                 ('VTI007' , 'Đề thi JAVA_SCRIPT', 		3    ,  60	   ,     7		,'2019-07-04'),
                 ('VTI008' , 'Đề thi C#'		 , 		8    ,  60	   ,     2		,'2019-12-14'),
                 ('VTI009' , 'Đề thi REACT_JS'	 , 		10   ,  120	   ,     9		,'2020-04-15'),
                 ('VTI0010', 'Đề thi MYSQL'		 , 		7    ,  60	   ,     1		,'2019-11-22');
                 
INSERT INTO ExamQuestion(ExamID , QuestionID)
VALUES					(   1   ,    1      ),
						(	2	, 	 4		),
                        (	3	,	 5      ),
                        (	4	,	 2		),
                        (	5	,	 8		),
                        (	6	,	 6		),
                        (	7	,	 10		),
                        (	8	,	 8		),
                        (	9	,	 3		),
                        (	10	,	 9		);