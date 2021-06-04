import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Ex3DateFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account account1 = new Account();
		account1.accountId = 1;
		account1.email = "trantronghieu@gmail.com";
		account1.userName = "trong hieu";
		account1.fullName = "Trần Trọng Hiếu";
		account1.createDate = LocalDate.of(2020, 03, 24);
		
		Exam exam1 = new Exam();
		exam1.examId = 1;
		exam1.code = "VTI001";
		exam1.title = "Đề thi JAVA";
		exam1.Duration = 60;
		exam1.creator = account1;
		exam1.createDate = LocalDate.of (2019, 10, 20);
		
		Exam exam2 = new Exam();
		exam2.examId = 2;
		exam2.code = "VTI002";
		exam2.title = "Đề thi PHP";
		exam2.Duration = 120;
		exam2.creator = account1;
		exam2.createDate = LocalDate.of(2020, 03, 22);
		
	/*Question 1: In ra thông tin Exam thứ 1 và property create date sẽ được format theo định 
		dạng vietnamese*/

		Locale locale = new Locale("vi", "VI");
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
		String date = dateFormat.format(exam1.createDate);
		
		System.out.println(exam1.code + ": " + date);
	
	//LocalDate 
		LocalDate localDate = LocalDate.now();//For reference
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd LLLL yyyy");
		String formattedString = localDate.format(formatter);
		System.out.println(formattedString);
		
		System.out.println('\n');
		
	/*Question 2: In ra thông tin: Exam đã tạo ngày nào theo định dạng 
			Năm – tháng – ngày – giờ – phút – giây*/
		
		String pattern = "yyyy-MM-dd-HH-mm-ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

		Exam[] exams = { exam1, exam2 };
		for (Exam exam : exams) {
			date = simpleDateFormat.format(exam.createDate);
			System.out.println(exam.code + ": " + date);
		}
		
		System.out.println('\n');
		
	//Question 3: Chỉ in ra năm của create date property trong Question  2
		pattern = "yyyy";
		simpleDateFormat = new SimpleDateFormat(pattern);
		for (Exam exam : exams) {
			date = simpleDateFormat.format(exam.createDate);
			System.out.println(exam.code + ": " + date);
		}
		System.out.println('\n');
		
	//Question 4: Chỉ in ra tháng và năm của create date property trong Question 2
		pattern = "MM-yyyy";
		 simpleDateFormat = new SimpleDateFormat(pattern);
		for (Exam exam : exams) {
			date = simpleDateFormat.format(exam.createDate);
			System.out.println(exam.code + ": " + date);
		}
	
		System.out.println('\n');
		
	// Question 5: Chỉ in ra "MM-DD" của create date trong Question 2
		pattern = "MM-dd";
		simpleDateFormat = new SimpleDateFormat(pattern);
		for (Exam exam : exams) {
			date = simpleDateFormat.format(exam.createDate);
			System.out.println(exam.code + ": " + date);
		}
	}

}
