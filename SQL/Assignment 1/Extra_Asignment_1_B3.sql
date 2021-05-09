-- Bài 3
DROP DATABASE IF EXISTS Data_Type_2;
CREATE DATABASE Data_Type_2;
USE Data_Type_2;

CREATE TABLE Data_Type_2(
ID MEDIUMINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
Name VARCHAR(50) NOT NULL,
BirthDate DATE NOT NULL,
Gender ENUM('0', '1','null'),   -- (0 là Male, 1 là Female, null là unknow)
IsDeleteFlag Bit NOT NULL 		-- (0 là đang hoạt động, 1 là đã xóa) 
);