import java.text.DateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Ex1FlowControl {
	public static void main(String[] args) {
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
		// account1.createDate = LocalDate.of(2020, 03, 18);

		Account account2 = new Account();
		account2.accountId = 2;
		account2.email = "tranphuongthao@gmail.com";
		account2.userName = "phuong thao";
		account2.fullName = "Trần Phương Thảo";
		account2.department = department2;
		account2.position = position2;
		// account2.createDate = LocalDate.of(2018, 07, 19);

		Account account3 = new Account();
		account3.accountId = 3;
		account3.email = "nguyenxuanhoa@gmail.com";
		account3.userName = "xuan hoa";
		account3.fullName = "Nguyễn Xuân Hòa";
		account3.department = department3;
		account3.position = position3;
		// account3.createDate = LocalDate.of(2018, 02, 25);

		// GROUP
		Group group1 = new Group();
		group1.groupId = 1;
		group1.groupName = "Java Fresher";
		group1.creator = account1;
		group1.createDate = LocalDate.of(2020, 03, 18);

		Group group2 = new Group();
		group2.groupId = 3;
		group2.groupName = "C# Fresher";
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
		exam1.createDate = LocalDate.of(2019, 10, 20);

		Exam exam2 = new Exam();
		exam2.examId = 2;
		exam2.code = "VTI002";
		exam2.title = "Đề thi PHP";
		exam2.Category = categoryQuestion2;
		exam2.Duration = 120;
		exam2.creator = account1;
		exam2.createDate = LocalDate.of(2020, 03, 22);

		Exam exam3 = new Exam();
		exam3.examId = 3;
		exam3.code = "VTI003";
		exam3.title = "Đề thi C#";
		exam3.Category = categoryQuestion3;
		exam3.Duration = 45;
		exam3.creator = account3;
		exam3.createDate = LocalDate.of(2019, 07, 22);

		// EXAMQUESTION
		Question[] questionOfExam1 = { question1, question2 };
		exam1.questions = questionOfExam1;

		Question[] questionOfExam2 = { question2, question3 };
		exam2.questions = questionOfExam2;

		Question[] questionOfExam3 = { question1, question3 };
		exam3.questions = questionOfExam3;

		/*------------------------------------------------------------------------------------------------------------------------*//*
																																	 * //
																																	 * (IF)
																																	 * Question
																																	 * 1:
																																	 * Kiểm
																																	 * tra
																																	 * account
																																	 * thứ
																																	 * 2
																																	 * Nếu
																																	 * không
																																	 * có
																																	 * phòng
																																	 * ban
																																	 * (tức
																																	 * là
																																	 * department
																																	 * =
																																	 * =
																																	 * null)
																																	 * thì
																																	 * sẽ
																																	 * in
																																	 * ra
																																	 * text
																																	 * "Nhân viên này chưa có phòng ban"
																																	 * Nếu
																																	 * không
																																	 * thì
																																	 * sẽ
																																	 * in
																																	 * ra
																																	 * text
																																	 * "Phòng ban của nhân viên này là …"
																																	 */

		System.out.println("Question 1");

		if (account2.department == null) {
			System.out.println("Nhân viên này chưa có phòng ban");
		} else {
			System.out.println("Phòng ban của nhân viên này là " + account2.department.departmentnName);
		}

		System.out.println("\n");

		/*-------------------------------------------------------------------------------------------------------------------------*/

		/*
		 * Question 2: Kiểm tra account thứ 2 Nếu không có group thì sẽ in ra text
		 * "Nhân viên này chưa có group"
		 * 
		 * Nếu có mặt trong 1 hoặc 2 group thì sẽ in ra text
		 * "Group của nhân viên này là Java Fresher, C# Fresher"
		 * 
		 * Nếu có mặt trong 3 Group thì sẽ in ra text "Nhân viên này là người quan
		 * trọng, tham gia nhiều group"
		 * 
		 * Nếu có mặt trong 4 group trở lên thì sẽ in ra text "Nhân viên này là người
		 * hóng chuyện, tham gia tất cả các group
		 */

		System.out.println("Question 2");

		if (account1.groups == null) {
			System.out.println("Nhân viên này không có group");
		} else if (account1.groups.length == 1 || account1.groups.length == 2) {
			System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");

//			for (Group group : groupOfAccount1) {
//				System.out.println(group.groupName);
//			}
		} else if (account1.groups.length == 3) {
			System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
		} else {
			System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
		}
		System.out.println("\n");

//Chữa question 2: 
		System.out.println("Chữa Question 2");

		if (account1.groups == null) {
			System.out.println("Nhân viên này không có group");
		} else if (account1.groups.length == 1) {
			System.out.println(account1.groups[0].groupName);
		} else if (account1.groups.length == 2) {
			System.out.println(account1.groups[0].groupName);
			System.out.println(account1.groups[1].groupName);
		} else if (account1.groups.length == 3) {
			System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
		} else {
			System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
		}

		System.out.println("\n");
		/*--------------------------------------------------------------------------------------------------------------------------*/

		// Question 3: Sử dụng toán tử ternary để làm Question 1

		System.out.println("Question 3");

		System.out.println(account2.department == null ? "Nhân viên này chưa có phòng ban"
				: "Phòng ban của nhân viên này là " + account2.department.departmentnName);

		System.out.println("\n");

		/*--------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

		// Question 4: Sử dụng toán tử ternary để làm yêu cầu sau: Kiểm tra Position của
		/*
		 * account thứ 1 Nếu Position = Dev thì in ra text "Đây là Developer" Nếu không
		 * phải thì in ra text "Người này không phải là Developer"
		 */

		System.out.println("Question4");

		System.out.println(account1.position.positionName == PositionName.DEV ? "Đây là Developer"
				: "Người này không phải là Developer");
		System.out.println("\n");

		/*----------------------------------------------------------------------------- ---------------*/
//(SWITCH CASE)
		/*
		 * Question 5:Lấy ra số lượng account trong nhóm thứ 1 và in ra theo format sau:
		 * Nếu số lượng account = 1 thì in ra "Nhóm có một thành viên" Nếu số lượng
		 * account = 2 thì in ra "Nhóm có hai thành viên" Nếu số lượng account = 3 thì
		 * in ra "Nhóm có ba thành viên" Còn lại in ra "Nhóm có nhiều thành viên"
		 */

		System.out.println("Question 5");

		switch (group1.accounts.length) {
		case 1:
			System.out.println("Nhóm có một thành viên");
			break;
		case 2:
			System.out.println("Nhóm có hai thành viên");
			break;
		case 31:
			System.out.println("Nhóm có ba thành viên");
			break;
		default:
			System.out.println("Nhóm có nhiều thành viên");
			break;
		}

		System.out.println("\n");
//-----------------------------------------------------------------------------
		// Question 6: Sử dụng switch case để làm lại Question 2

		System.out.println("Question 6");

		switch (account2.groups.length) {
		case 1:
			System.out.println("Nhân viên này chưa có group");
			break;
		case 2:
			System.out.println("Group của nhân viên này là ");
			for (Group group : groupOfAccount2) {
				System.out.println(group.groupName);
			}
			break;
		case 3:
			System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
			break;
		default:
			System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
			break;
		}

		System.out.println("\n");
//-----------------------------------------------------------------------------
		// Question 7: Sử dụng switch case để làm lại Question 4
		System.out.println("Question 7");

		switch (account2.position.positionName) {
		case DEV:
			System.out.println("Đây là Developer");
			break;
		default:
			System.out.println("Người này không phải là Developer");
			break;
		}

		System.out.println("\n");
//------------------------------------------------------------------------------		
//FOREACH
		// Question 8: In ra thông tin các account bao gồm: Email, FullName và tên phòng
		// ban của họ
		System.out.println("Question 8");

		Account[] dsAccount = { account1, account2, account3 };

		int i = 1;
		for (Account account : dsAccount) {
			System.out.println("Email: " + account.email);
			System.out.println("Full Name: " + account.fullName);
			System.out.println("Phòng ban: " + account.department.departmentnName);
			i++;
		}
		System.out.println("\n");

// C2: 
		System.out.println("Question 8_C2");
		System.out.println(account1.toString());

		System.out.println("\n");
//------------------------------------------------------------------------------		
		// Question 9: In ra thông tin các phòng ban bao gồm: id và name
		System.out.println("Question 9");

		Department[] dsDepartments = { department1, department2, department3 };

		int y = 1;
		for (Department department : dsDepartments) {
			System.out.println("Id: " + department.departmentId);
			System.out.println("Name: " + department.departmentnName);
			System.out.println("\n");
			i++;
		}
		System.out.println("\n");
// -------------------------------------------------------------------------------
//FOR
		// Question 10:
		System.out.println("Question 10");

		for (int j = 0; j < dsAccount.length; j++) {
			System.out.println("Thông tin account thứ " + (j + 1) + " là:");
			System.out.println("Email: " + dsAccount[j].email);
			System.out.println("Fullname: " + dsAccount[j].fullName);
			System.out.println("Department: " + dsAccount[j].department.departmentnName);
		}

		System.out.println("\n");

//C2
		System.out.println("Question 10_C2");
		for (int j = 0; j < dsAccount.length; j++) {
			System.out.println("Thông tin account thứ " + (j + 1) + " là:");
			System.out.println(dsAccount[j].toString());
		}

		System.out.println("\n");
//----------------------------------------------------------------------------------
		// Question 11:
		System.out.println("Question 11");

		for (int k = 0; k < dsDepartments.length; k++) {
			System.out.println("Id: " + dsDepartments[k].departmentId);
			System.out.println("Name: " + dsDepartments[k].departmentnName);
		}

		System.out.println("\n");
// ---------------------------------------------------------------------------------
		// Question 12: Chỉ in ra thông tin 2 department đầu tiên theo định dạng như
		// Question 10
		System.out.println("Question 12");

		for (int k = 0; k < 2; k++) {
			System.out.println("Id: " + dsDepartments[k].departmentId);
			System.out.println("Name: " + dsDepartments[k].departmentnName);
		}

		System.out.println("\n");
// --------------------------------------------------------------------------------		
		// Question 13: In ra thông tin tất cả các account ngoại trừ account thứ 2
		System.out.println("Question 13");

		for (int j = 0; j < dsAccount.length; j++) {
			if (j != 1) {
				System.out.println("Email: " + dsAccount[j].email);
				System.out.println("Fullname: " + dsAccount[j].fullName);
				System.out.println("Department: " + dsAccount[j].department.departmentnName);
			}
		}

		System.out.println("\n");
//----------------------------------------------------------------------------------
		// Question 14: In ra thông tin tất cả các account có id < 4
		System.out.println("Question 14");

		for (int j = 0; j < dsAccount.length; j++) {
			if (dsAccount[j].accountId < 4) {
				System.out.println("Email: " + dsAccount[j].email);
				System.out.println("Fullname: " + dsAccount[j].fullName);
				System.out.println("Department: " + dsAccount[j].department.departmentnName);
			}
		}

		System.out.println("\n");
//----------------------------------------------------------------------------------	
		// Question 15: In ra các số chắn nhỏ hơn hoặc bằng 20
		System.out.println("Question 15");
		for (int k = 2; k <= 20; k = k + 2) {
			System.out.println(k);
		}

		System.out.println("\n");

//----------------------------------------------------------------------------------	
		// WHILE
		// Question 16: Làm lại các Question ở phần FOR bằng cách sử dụng WHILE kết hợp
		// với lệnh break, continue
		// Question 10 (while)
		System.out.println("Question 16_10");

		i = 0;
		while (i < dsAccount.length) {
			System.out.println("Email: " + dsAccount[i].email);
			System.out.println("Fullname: " + dsAccount[i].fullName);
			System.out.println("Department: " + dsAccount[i].department.departmentnName);
			i++;
		}

		System.out.println("\n");
//----------------------------------------------------------------------------------		
		// Question 16
		// Question 13
		System.out.println("Question 16_13");

		int j = 0;
		while (j < dsAccount.length) {

			if (j == 1) {
				j++;
				continue;
			}
			System.out.println("Email: " + dsAccount[j].email);
			System.out.println("Fullname: " + dsAccount[j].fullName);
			System.out.println("Department: " + dsAccount[j].department.departmentnName);
			j++;
		}
		System.out.println("\n");
//----------------------------------------------------------------------------------
		// Question 16
		// Question 14
		System.out.println("Question 16_14");

		i = 0;
		while (i < dsAccount.length) {
			if (dsAccount[i].accountId >= 4) {
				i++;
				continue;
			}
			System.out.println("Email: " + dsAccount[i].email);
			System.out.println("Fullname: " + dsAccount[i].fullName);
			System.out.println("Department: " + dsAccount[i].department.departmentnName);
			i++;
		}

		System.out.println("\n");
//----------------------------------------------------------------------------------		 
		// DO - WHILE
		// Question 17: (Question 11 do - while)
		System.out.println("Question 17_11");

		int t = 0;
		do {
			System.out.println("Id: " + dsDepartments[t].departmentId);
			System.out.println("Name: " + dsDepartments[t].departmentnName);
			t++;
		} while (t < dsDepartments.length);

		System.out.println("\n");
//------------------------------------------------------------------------------
		// Question 17_12
		System.out.println("Question 17_12");
		int m = 0;
		do {
			System.out.println("Id: " + dsDepartments[m].departmentId);
			System.out.println("Name: " + dsDepartments[m].departmentnName);
			m++;
		} while (m < 2);

		System.out.println("\n");
//------------------------------------------------------------------------------	
		// Question 17_15
		System.out.println("Question 17_15");
		int x = 2;
		do {
			System.out.println(x);
			x += 2;
		} while (x <= 20);
	}
}
