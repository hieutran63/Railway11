DROP DATABASE IF EXISTS Testing_System_Assignment_3;
CREATE DATABASE IF NOT EXISTS Testing_System_Assignment_3;
USE Testing_System_Assignment_3;

-- Tạo bảng Department
CREATE TABLE Department(
	DepartmentID 		TINYINT AUTO_INCREMENT PRIMARY KEY,
	DepartmentName 		NVARCHAR(50) UNIQUE KEY NOT NULL 
);

-- Tạo bảng Position
CREATE TABLE `Position`(
	PositionID 			TINYINT AUTO_INCREMENT PRIMARY KEY, 
	PositionName		ENUM('Dev','Test', 'Scrum Master','PM')  
);

-- Tạo bảng Account
CREATE TABLE `Account`(
	AccountID 			SMALLINT AUTO_INCREMENT PRIMARY KEY,
	Email				VARCHAR(50) NOT NULL UNIQUE KEY,
	UserName 			VARCHAR(50) NOT NULL,
	FullName 			NVARCHAR(50) NOT NULL,
	DepartmentID 		TINYINT NOT NULL,
	PositionID 			TINYINT NOT NULL,
	CreateDate 			DATE,
    FOREIGN KEY (DepartmentID) REFERENCES Department(DepartmentID),
    FOREIGN KEY (PositionID) REFERENCES `Position`(PositionID)
);

-- Tạo bảng Group
CREATE TABLE `Group`(
	GroupID 			TINYINT AUTO_INCREMENT PRIMARY KEY,
	GroupName 			VARCHAR(50) NOT NULL UNIQUE KEY,
	CreatorID 			SMALLINT NOT NULL,
	CreateDate 			DATE,
    FOREIGN KEY (CreatorID) REFERENCES `Account`(AccountID)
);

-- Tạo bảng GroupAccount
CREATE TABLE GroupAccount(
	GroupID 			TINYINT NOT NULL,
	AccountID 			SMALLINT NOT NULL,
	JoinDate 			DATE,
    PRIMARY KEY(GroupID, AccountID),
    FOREIGN KEY (GroupID) REFERENCES `Group`(GroupID),
    FOREIGN KEY (AccountID) REFERENCES `Account`(AccountID)
);

-- Tạo bảng TypeQuestion
CREATE TABLE TypeQuestion(
	TypeID 				TINYINT AUTO_INCREMENT PRIMARY KEY,
	TypeName 			ENUM('Essay','Multiple-Choice')          -- Essay: bài luận, Multiple-Choice: trắc nghiệm
);

-- Tạo bảng CategoryQuestion
CREATE TABLE CategoryQuestion(
	CategoryID 			TINYINT AUTO_INCREMENT PRIMARY KEY,
	CategoryName 		NVARCHAR(50)
);

-- Tạo bảng Question
CREATE TABLE Question(
	QuestionID 			SMALLINT AUTO_INCREMENT PRIMARY KEY,
	Content 			TEXT,
	CategoryID			TINYINT NOT NULL,
	TypeID 				TINYINT NOT NULL,
	CreatorID 			SMALLINT NOT NULL,
	CreateDate 			DATE,
    FOREIGN KEY (CategoryID) REFERENCES CategoryQuestion(CategoryID),
    FOREIGN KEY (TypeID) REFERENCES TypeQuestion(TypeID),
    FOREIGN KEY (CreatorID) REFERENCES `Account`(AccountID)
);

-- Tạo bảng Answer
CREATE TABLE Answer(
	AnswerID 			SMALLINT AUTO_INCREMENT PRIMARY KEY,
	Content 			TEXT,
	QuestionID 			SMALLINT,
	isCorrect 			BOOLEAN,
    FOREIGN KEY (QuestionID) REFERENCES Question(QuestionID)
);

-- Tạo bảng Exam
CREATE TABLE Exam(
	ExamID 				SMALLINT AUTO_INCREMENT PRIMARY KEY,
	`Code` 				VARCHAR(50) NOT NULL,
	Title 				NVARCHAR(50),
	CategoryID 			TINYINT NULL,
	Duration			TINYINT UNSIGNED NOT NULL,
	CreatorID 			SMALLINT NOT NULL,
	CreateDate 			DATE,
    FOREIGN KEY (CategoryID) REFERENCES CategoryQuestion(CategoryID),
	FOREIGN KEY (CreatorID) REFERENCES `Account`(AccountID)
);

-- Tạo bảng ExamQuestion
CREATE TABLE ExamQuestion(
	ExamID		  		SMALLINT NOT NULL,
	QuestionID 			SMALLINT NOT NULL,
    PRIMARY KEY (ExamID, QuestionID),
    FOREIGN KEY (ExamID) REFERENCES Exam(ExamID),
	FOREIGN KEY (QuestionID) REFERENCES Question(QuestionID)
);

    