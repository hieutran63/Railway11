import java.time.LocalDate;
import java.util.Random;

public class Ex4RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// Exercise 4: Random Number
			Random random = new Random();
	// Question 1: In ngẫu nhiên ra 1 số nguyên
			System.out.println("Question 1");
			
			int w = random.nextInt();
			System.out.println("số nguyên ngẫu nhiên: " + w);
			
			System.out.println("\n");
	// Question 2: In ngẫu nhiên ra 1 số thực
			System.out.println("Question 2");
			
			double t = random.nextDouble();
			System.out.println("số thực ngẫu nhiên: " + t);
			
			System.out.println("\n");
	// Question 3: Khai báo 1 array bao gồm các tên của các bạn trong lớp, sau đó in ngẫu nhiên ra tên của 1 bạ
			
			System.out.println("Question 3");
			String[] studenList = {"Trần Phương Thảo", "Nguyễn Tuấn Anh", "Nguyễn Thúy Anh", "Trần Trọng Hiếu", "Ngô Đức Dương"};
			int index = random.nextInt(studenList.length);
			System.out.println(studenList[index]);
			
			System.out.println("\n");
	//Question 4: Lấy ngẫu nhiên 1 ngày trong khoảng thời gian 24-07-1995 tới ngày 20-12-1995
			System.out.println("Question 4");
			
			int minDate = (int) LocalDate.of(1995,07,24).toEpochDay();
			int maxDate = (int) LocalDate.of(1995,12,20).toEpochDay();
			
			long randomInt = minDate + random.nextInt(maxDate - minDate);
			
			LocalDate randomDate = LocalDate.ofEpochDay(randomInt);
			System.out.println(randomDate);
			
			System.out.println("\n");
	// Question 5: Lấy ngẫu nhiên 1 ngày trong khoảng thời gian 1 năm trở lại đây
			System.out.println("Question 5");
			
			int today = (int) LocalDate.now().toEpochDay();

			long randomLong = today - (int) (Math.random() * (364 - 1 + 1) + 1);

			randomDate = LocalDate.ofEpochDay(randomLong);
			System.out.println(randomDate);
			
			System.out.println("\n");
	// Question 7: Lấy ngẫu nhiên 1 số có 3 chữ số
			
			System.out.println("Question 7");
			
			int k = random.nextInt(999 - 100 + 1) + 100;
			System.out.println(k);
	}

}
