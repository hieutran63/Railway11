-- Bài 2
DROP DATABASE IF EXISTS Data_Types_1;
CREATE DATABASE Data_Types_1;
USE Data_Types_1;

CREATE TABLE Data_Type_1(
	ID 				INT AUTO_INCREMENT PRIMARY KEY,
	`Name` 			VARCHAR(50),
	`Code`  		CHAR(5),
	Modified_Date 	DATETIME
);