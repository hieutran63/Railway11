import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

	public class Ex2SystemOutPrintf {
		public static void main(String[] args) {
	
/* Exercise 2 (Optional): System out printf
    Question 1: Khai báo 1 số nguyên = 5 và sử dụng lệnh System out printf để in ra số nguyên đó*/
		System.out.println("Question 1");
		int a = 5;
		System.out.printf("%d%n", a);

		System.out.println("\n");

		/*----------------------------------------------------------------------------- ----------*/

	/*Question 2: Khai báo 1 số nguyên = 100 000 000 và sử dụng lệnh System out
		 printf để in ra số nguyên đó thành định dạng như sau: 100,000,00 */
		System.out.println("Question 2");
		int b = 1000000000;
		System.out.printf(Locale.US, "%,d %n", b);

		System.out.println("\n");

		/*------------------------------------------------------------------------------------*/
		
	/* Question 3: Khai báo 1 số thực = 5,567098 và sử dụng lệnh System out printf
		 để in ra số thực đó chỉ bao gồm 4 số đằng sau */
		System.out.println("Question 3");
		float c = 5.567098f;
		System.out.printf("'%.2f' %n", c);

		System.out.println("\n");

		/*-------------------------------------------------------------------------------------*/
		
	/*Question 4: Khai báo Họ và tên của 1 học sinh và in ra họ và tên học sinh đó
		 theo định dạng như sau: Họ và tên: "Nguyễn Văn A" thì sẽ in ra trên console
		 như sau: Tên tôi là "Nguyễn Văn A" và tôi đang độc thân.*/
		System.out.println("Question 4");
		String fullName = "Nguyễn Văn A";
		System.out.printf("Tên tôi là " + fullName + " và tôi đang độc thân");

		System.out.println("\n");
// ------------------------------------------------------------------------------
	// Question 5:Lấy thời gian bây giờ và in ra theo định dạng sau: 24/04/2020 11h:16p:20s
		System.out.println("Question 5");
		String pattern = "dd/MM/yyyy HH/mm/ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String date = simpleDateFormat.format(new Date());

		System.out.println(date);
//------------------------------------------------------------------------------------------
	//Question 6: In ra thông tin account (như Question 8 phần FOREACH) theo định dạng table (giống trong Database)
		System.out.println("Question 6");
		
	}

}
