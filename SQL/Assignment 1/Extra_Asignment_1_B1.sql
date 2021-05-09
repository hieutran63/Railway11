DROP DATABASE IF EXISTS Fresher;
CREATE DATABASE  IF NOT EXISTS Fresher;
USE Fresher;
 
 -- Question 1: Tạo table với các ràng buộc và kiểu dữ liệu
CREATE TABLE Trainee(
	TraineeID 			SMALLINT AUTO_INCREMENT PRIMARY KEY, 
	Full_Name 			NVARCHAR(50),
	Birth_Date 			DATE,
	Gender 				ENUM('Male','Famale','Unknow'),
	ET_IQ 				TINYINT CHECK(ET_IQ >= 0 && ET_IQ <= 20),
	ET_Gmath 			TINYINT CHECK(ET_Gmath >= 0 && ET_Gmath <= 20),
	ET_English			TINYINT CHECK(ET_English >= 0 && ET_English <= 50),
	Training_Class 		VARCHAR(50),
	Evalution_Notes 	TEXT
);

-- Question 2: thêm trường VTI_Account với điều kiện not null & unique
ALTER TABLE Trainee
ADD VTI_Account CHAR(50) UNIQUE KEY NOT NULL;