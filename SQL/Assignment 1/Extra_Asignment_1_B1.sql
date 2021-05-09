 -- Bài 1
 DROP DATABASE IF EXISTS Trainee_Table;
 CREATE DATABASE Trainee_Table;
 USE Trainee_Table;
 
 -- Question 1: Tạo table với các ràng buộc và kiểu dữ liệu
CREATE TABLE Trainee(
	TraineeID 		SMALLINT UNSIGNED PRIMARY KEY  , 
	Full_Name 		VARCHAR(50),
	Birth_Date 		DATE,
	Gender 			ENUM('Male','Famale','Unknow') NOT NULL,
	ET_IQ 			TINYINT UNSIGNED, CHECK(ET_IQ <= 20),
	ET_Gmath 		TINYINT UNSIGNED, CHECK(ET_IQ <= 20),
	ET_English		TINYINT UNSIGNED, CHECK(ET_IQ <= 50),
	Training_Class 	VARCHAR(50),
	Evalution_Notes VARCHAR(100)
);

  -- Question 2: thêm trường VTI_Account với điều kiện not null & unique
  ALTER TABLE Trainee
  ADD COLUMN VTI_Account SMALLINT UNSIGNED UNIQUE NOT NULL
  
  
