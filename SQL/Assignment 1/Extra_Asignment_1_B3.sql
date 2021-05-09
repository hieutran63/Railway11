-- Bài 3
DROP DATABASE IF EXISTS Data_Types_2;
CREATE DATABASE Data_Types_2;
USE Data_Types_2;

CREATE TABLE Data_Types_2(
	ID 				INT AUTO_INCREMENT PRIMARY KEY,
	`Name` 			VARCHAR(50),
	BirthDate		DATE,
	Gender 			BIT, 				  -- (0 là Male, 1 là Female, null là unknow)
	IsDeleteFlag 	BIT  			   	-- (0 là đang hoạt động, 1 là đã xóa) 
);