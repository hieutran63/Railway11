import java.time.LocalDate;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// DEPARTMENT
		Department department1 = new Department();
		department1.departmentId = 1;
		department1.departmentnName = "Sales";

		Department department2 = new Department();
		department2.departmentId = 2;
		department2.departmentnName = "Marketing";

		Department department3 = new Department();
		department3.departmentId = 3;
		department3.departmentnName = "Test";

	// POSITION
		Position position1 = new Position();
		position1.positonId = 1;
		position1.positionName = PositionName.DEV;

		Position position2 = new Position();
		position2.positonId = 2;
		position2.positionName = PositionName.TEST;

		Position position3 = new Position();
		position3.positonId = 3;
		position3.positionName = PositionName.PM;

	// ACCOUNT
		Account account1 = new Account();
		account1.accountId = 1;
		account1.email = "trantronghieu@gmail.com";
		account1.userName = "trong hieu";
		account1.fullName = "Trần Trọng Hiếu";
		account1.department = department1;
		account1.position = position1;
		account1.createDate = LocalDate.of(2020, 03, 18);

		Account account2 = new Account();
		account2.accountId = 2;
		account2.email = "tranphuongthao@gmail.com";
		account2.userName = "phuong thao";
		account2.fullName = "Trần Phương Thảo";
		account2.department = department2;
		account2.position = position2;
		account2.createDate = LocalDate.of(2018, 07, 19);

		Account account3 = new Account();
		account3.accountId = 3;
		account3.email = "nguyenxuanhoa@gmail.com";
		account3.userName = "xuan hoa";
		account3.fullName = "Nguyễn Xuân Hòa";
		account3.department = department3;
		account3.position = position3;
		account3.createDate = LocalDate.of(2018, 02, 25);

	// GROUP
		Group group1 = new Group();
		group1.groupId = 1;
		group1.groupName = "Deverloper";
		group1.creator = account1;
		group1.createDate = LocalDate.of(2020, 03, 18);

		Group group2 = new Group();
		group2.groupId = 3;
		group2.groupName = "VTI Marketing_1";
		group2.creator = account2;
		group2.createDate = LocalDate.of(2020, 10, 15);

		Group group3 = new Group();
		group3.groupId = 2;
		group3.groupName = "Testing";
		group3.creator = account3;
		group3.createDate = LocalDate.of(2019, 12, 14);

	// GROUPACCOUNT
		Group[] groupOfAccount1 = { group1, group2 };
		account1.groups = groupOfAccount1;

		Group[] groupOfAccount2 = { group2, group3 };
		account2.groups = groupOfAccount2;

		Group[] groupOfAccount3 = { group1, group3 };
		account3.groups = groupOfAccount3;

		Account[] accountOfGroup1 = { account1, account2 };
		group1.accounts = accountOfGroup1;

		Account[] accountOfGroup2 = { account2, account3 };
		group2.accounts = accountOfGroup2;

		Account[] accountOfGroup3 = { account1, account3 };
		group3.accounts = accountOfGroup3;

	// TYPEQUESTION
		TypeQuestion typeQuestion1 = new TypeQuestion();
		typeQuestion1.typeId = 1;
		typeQuestion1.typeName = TypeName.ESSAY;

		TypeQuestion typeQuestion2 = new TypeQuestion();
		typeQuestion2.typeId = 2;
		typeQuestion2.typeName = TypeName.MULTIPLE_CHOICE;

		TypeQuestion typeQuestion3 = new TypeQuestion();
		typeQuestion3.typeId = 3;
		typeQuestion3.typeName = TypeName.ESSAY;

		// CATEGORYQUESTION
		CategoryQuestion categoryQuestion1 = new CategoryQuestion();
		categoryQuestion1.categoryId = 1;
		categoryQuestion1.categoryName = "Java";

		CategoryQuestion categoryQuestion2 = new CategoryQuestion();
		categoryQuestion2.categoryId = 2;
		categoryQuestion2.categoryName = "PHP";

		CategoryQuestion categoryQuestion3 = new CategoryQuestion();
		categoryQuestion3.categoryId = 3;
		categoryQuestion3.categoryName = "C#";

	// QUESTION
		Question question1 = new Question();
		question1.questionId = 1;
		question1.content = "Câu hỏi về JAVA";
		question1.category = categoryQuestion1;
		question1.type = typeQuestion1;
		question1.creator = account1;
		question1.createDate = LocalDate.of(2019, 11, 23);

		Question question2 = new Question();
		question2.questionId = 2;
		question2.content = "Câu hỏi về PHP";
		question2.category = categoryQuestion2;
		question2.type = typeQuestion2;
		question2.creator = account2;
		question2.createDate = LocalDate.of(2020, 07, 11);

		Question question3 = new Question();
		question3.questionId = 3;
		question3.content = "Câu hỏi về C#";
		question3.category = categoryQuestion3;
		question3.type = typeQuestion3;
		question3.creator = account3;
		question3.createDate = LocalDate.of(2020, 10, 05);

	// ANSWER
		Answer answer1 = new Answer();
		answer1.answerId = 1;
		answer1.content = "Trả lời 1";
		answer1.question = question1;
		answer1.isCorrect = true;

		Answer answer2 = new Answer();
		answer2.answerId = 2;
		answer2.content = "Trả lời 2";
		answer2.question = question2;
		answer2.isCorrect = true;

		Answer answer3 = new Answer();
		answer3.answerId = 3;
		answer3.content = "Trả lời 3";
		answer3.question = question3;
		answer1.isCorrect = false;

	// EXAM
		Exam exam1 = new Exam();
		exam1.examId = 1;
		exam1.code = "VTI001";
		exam1.title = "Đề thi JAVA";
		exam1.Category = categoryQuestion1;
		exam1.Duration = 60;
		exam1.creator = account1;
		exam1.createDate = LocalDate.of(2019, 07, 18);

		Exam exam2 = new Exam();
		exam2.examId = 2;
		exam2.code = "VTI002";
		exam2.title = "Đề thi PHP";
		exam2.Category = categoryQuestion2;
		exam2.Duration = 120;
		exam2.creator = account1;
		exam2.createDate = LocalDate.of(2019, 12, 14);

		Exam exam3 = new Exam();
		exam3.examId = 3;
		exam3.code = "VTI003";
		exam3.title = "Đề thi C#";
		exam3.Category = categoryQuestion3;
		exam3.Duration = 45;
		exam3.creator = account3;
		exam3.createDate = LocalDate.of(2020, 04, 28);

	// EXAMQUESTION
		Question[] questionOfExam1 = { question1, question2 };
		exam1.questions = questionOfExam1;

		Question[] questionOfExam2 = { question2, question3 };
		exam2.questions = questionOfExam2;

		Question[] questionOfExam3 = { question1, question3 };
		exam3.questions = questionOfExam3;

	// PRINT
	// DEPARTMENT
		System.out.println("Department Id: " + department1.departmentId);
		System.out.println("Department Name: " + department1.departmentnName);
		System.out.println("\n");

		System.out.println("Department Id: " + department2.departmentId);
		System.out.println("Department Name: " + department2.departmentnName);
		System.out.println("\n");

		System.out.println("Department Id: " + department3.departmentId);
		System.out.println("Department Name: " + department3.departmentnName);
		System.out.println("\n");

	// POSITION
		System.out.println("Positon Id: " + position1.positonId);
		System.out.println("Positon Name: " + position1.positionName);
		System.out.println("\n");

		System.out.println("Positon Id: " + position2.positonId);
		System.out.println("Positon Name: " + position2.positionName);
		System.out.println("\n");

		System.out.println("Positon Id: " + position3.positonId);
		System.out.println("Positon Name: " + position3.positionName);
		System.out.println("\n");

	// ACOUNT
		System.out.println("Account Id: " + account1.accountId);
		System.out.println("Email: " + account1.email);
		System.out.println("User Name: " + account1.userName);
		System.out.println("Full Name: " + account1.fullName);
		System.out.println("Department Id: " + account1.department.departmentnName);
		System.out.println("Positon Id: " + account1.position.positionName);
		System.out.println("Create Date: " + account1.createDate);
		System.out.println("\n");

		System.out.println("Account Id: " + account2.accountId);
		System.out.println("Email: " + account2.email);
		System.out.println("User Name: " + account2.userName);
		System.out.println("Full Name: " + account2.fullName);
		System.out.println("Department Id: " + account2.department.departmentnName);
		System.out.println("Positon Id: " + account2.position.positionName);
		System.out.println("Create Date: " + account2.createDate);
		System.out.println("\n");

		System.out.println("Account Id: " + account3.accountId);
		System.out.println("Email: " + account3.email);
		System.out.println("User Name: " + account3.userName);
		System.out.println("Full Name: " + account3.fullName);
		System.out.println("Department Id: " + account3.department.departmentnName);
		System.out.println("Positon Id: " + account3.position.positionName);
		System.out.println("Create Date: " + account3.createDate);
		System.out.println("\n");
		System.out.println("List group Of Account1:");
		for (int i = 0; i <account1.groups.length; i++) {
			System.out.println(account1.groups[i].groupName);
		}
		System.out.println("List group Of Account2:");
		for (int i = 0; i <account2.groups.length; i++) {
			System.out.println(account2.groups[i].groupName);
		}
		System.out.println("List group Of Account3:");
		for (int i = 0; i <account3.groups.length; i++) {
			System.out.println(account3.groups[i].groupName);
		}
		System.out.println("\n");
		
	//GROUP
		System.out.println("Group Id: " + group1.groupId);
		System.out.println("Group Name: " + group1.groupName);
		System.out.println("Creator: " + group1.creator.fullName);
		System.out.println("Create Date: " + group1.createDate);
		System.out.println("\n");
		
		System.out.println("Group Id: " + group2.groupId);
		System.out.println("Group Name: " + group2.groupName);
		System.out.println("Creator: " + group2.creator.fullName);
		System.out.println("Create Date: " + group2.createDate);
		System.out.println("\n");
		
		System.out.println("Group Id: " + group3.groupId);
		System.out.println("Group Name: " + group3.groupName);
		System.out.println("Creator: " + group3.creator.fullName);
		System.out.println("Create Date: " + group3.createDate);
		System.out.println("\n");	
		
	// TYPEQUESTION
		System.out.println("Type Id: " + typeQuestion1.typeId);
		System.out.println("Type Name: " + typeQuestion1.typeName);
		System.out.println("\n");
		
		System.out.println("Type Id: " + typeQuestion2.typeId);
		System.out.println("Type Name: " + typeQuestion2.typeName);
		System.out.println("\n");
		
		System.out.println("Type Id: " + typeQuestion3.typeId);
		System.out.println("Type Name: " + typeQuestion3.typeName);
		System.out.println("\n");
		
	//CATEGORY QUESTION
		System.out.println("Category Id: " + categoryQuestion1.categoryId);
		System.out.println("Category Name: " + categoryQuestion1.categoryName);
		System.out.println("\n");
		
		System.out.println("Category Id: " + categoryQuestion2.categoryId);
		System.out.println("Category Name: " + categoryQuestion2.categoryName);
		System.out.println("\n");
		
		System.out.println("Category Id: " + categoryQuestion3.categoryId);
		System.out.println("Category Name: " + categoryQuestion3.categoryName);
		System.out.println("\n");
		
	//QUESTION
		System.out.println("Question Id: " + question1.questionId);
		System.out.println("Content: " + question1.content);
		System.out.println("CategoryID: " + question1.category.categoryId);
		System.out.println("TypeId: " + question1.type.typeId);
		System.out.println("Creator: " + question1.creator.fullName);
		System.out.println("CeateDate: " + question1.createDate);
		System.out.println("\n");
		
		System.out.println("Question Id: " + question2.questionId);
		System.out.println("Content: " + question2.content);
		System.out.println("CategoryID: " + question2.category.categoryId);
		System.out.println("TypeId: " + question2.type.typeId);
		System.out.println("Creator: " + question2.creator.fullName);
		System.out.println("CeateDate: " + question2.createDate);
		System.out.println("\n");
		
		System.out.println("Question Id: " + question3.questionId);
		System.out.println("Content: " + question3.content);
		System.out.println("CategoryID: " + question3.category.categoryId);
		System.out.println("TypeId: " + question3.type.typeId);
		System.out.println("Creator: " + question3.creator.fullName);
		System.out.println("CeateDate: " + question3.createDate);
		System.out.println("\n");
		
	//Answer
		System.out.println("AnswerId: " + answer1.answerId);
		System.out.println("Content: " + answer1.content);
		System.out.println("QuestionID: " + answer1.question.questionId);
		System.out.println("isCorrect: " + answer1.isCorrect);
		System.out.println("\n");
		
		System.out.println("AnswerId: " + answer2.answerId);
		System.out.println("Content: " + answer2.content);
		System.out.println("QuestionID: " + answer2.question.questionId);
		System.out.println("isCorrect: " + answer2.isCorrect);
		System.out.println("\n");
		
		System.out.println("AnswerId: " + answer3.answerId);
		System.out.println("Content: " + answer3.content);
		System.out.println("QuestionID: " + answer3.question.questionId);
		System.out.println("isCorrect: " + answer3.isCorrect);
		System.out.println("\n");
		
	//EXAM
		System.out.println("ExamId: " + exam1.examId);
		System.out.println("Code1: " + exam1.code );
		System.out.println("Title: " + exam1.title);
		System.out.println("CategoryID: " + exam1.Category.categoryId);
		System.out.println("Duration: " + exam1.Duration);
		System.out.println("Creator: " + exam1.creator.fullName);
		System.out.println("CreateDate: " + exam1.createDate);
		System.out.println("\n");
		
		System.out.println("ExamId: " + exam2.examId);
		System.out.println("Code1: " + exam2.code );
		System.out.println("Title: " + exam2.title);
		System.out.println("CategoryID: " + exam2.Category.categoryId);
		System.out.println("Duration: " + exam2.Duration);
		System.out.println("Creator: " + exam2.creator.fullName);
		System.out.println("CreateDate: " + exam2.createDate);
		System.out.println("\n");
		
		System.out.println("ExamId: " + exam3.examId);
		System.out.println("Code1: " + exam3.code );
		System.out.println("Title: " + exam3.title);
		System.out.println("CategoryID: " + exam3.Category.categoryId);
		System.out.println("Duration: " + exam3.Duration);
		System.out.println("Creator: " + exam3.creator.fullName);
		System.out.println("CreateDate: " + exam3.createDate);
		System.out.println("\n");
		
	//EXAM QUESTION
		System.out.println("List exam Of Question1:");
		for (int i = 0; i <exam1.questions.length; i++) {
			System.out.println(exam1.questions[i].content);
		}
		System.out.println("List exam Of Question2:");
		for (int i = 0; i <exam2.questions.length; i++) {
			System.out.println(exam2.questions[i].content);
		}
		System.out.println("List exam Of Question3:");
		for (int i = 0; i <exam3.questions.length; i++) {
			System.out.println(exam3.questions[i].content);
		}
		
	}

}
