import java.time.LocalDate;

public class Question {
	byte			 questionId;
	String			 content;
	CategoryQuestion category;
	TypeQuestion	 type;
	Account			 creator;
	LocalDate		 createDate;
	
	Exam[]			 exams;
}
