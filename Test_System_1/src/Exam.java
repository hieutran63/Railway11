import java.time.LocalDate;

public class Exam {
	byte				examId;
	String				code;
	String				title;
	CategoryQuestion	Category;
	short				Duration;
	Account				creator;
	LocalDate			createDate;
	
	Question[]			questions;
}
