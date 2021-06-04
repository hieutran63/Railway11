import java.util.Random;
import java.util.Scanner;

public class Ex1DatatypeCasting {

	public static void main(String[] args) {
	// Question 1:
		/*Khai báo 2 số lương có kiểu dữ liệu là float.
		  Khởi tạo Lương của Account 1 là 5240.5 $
		  Khai báo 1 số int để làm tròn
		  Lương của Account 1 và in số int đó ra */
			
		System.out.println("Question 1");

		float salaryOfAccount1 = 5240.5f;
		int salaryOfAccount1Casting = (int) salaryOfAccount1;

		System.out.println(salaryOfAccount1Casting);

	 /*Khởi tạo Lương của Account 2 là 10970.055$ Khai báo 1 số int để làm tròn
		Lương của Account 2 và in số int đó ra */
			float salaryOfAccount2 = 10970.055f;
			int salaryOfAccount2Casting = (int) salaryOfAccount2;

			System.out.println(salaryOfAccount2Casting);
			System.out.println("\n");

	/* Question 2: Lấy ngẫu nhiên 1 số có 5 chữ số (những số dưới 5 chữ số thì sẽ
		thêm có số 0 ở đầu cho đủ 5 chữ số) */
			System.out.println("Question 2");

			int min = 0;
			int max = 99999;
			int a = (int) (Math.random() * max + min);
			while (a < 100000) {
				a = a * 10;
			}
			System.out.println("Số ngẫu nhiên: " + a);
			System.out.println("\n");
			
	// C2 Q2:
			/*Random random = new Random();
			 int x = random.nextInt(100000);
			 if (x <= 100000) {
				 System.out.println(x);
			 }else if (x >= 10000 && x < 100000) {
				 System.out.println('0' + x);
			 }else if (x >= 1000 && x < 10000) {
				 System.out.println('0' + x);
			 }else if (x >= 100 && x < 1000) {
				 System.out.println('0' + x);
			 }else if (x >= 10 && x < 100) {
				 System.out.println('0' + x);
			 }else
				 System.out.println('0' + x);
			 }*/
			
 /* Question 3: Lấy 2 số cuối của số ở Question 2 và in ra.
		Gợi ý: Cách 1: convert số có 5 chữ số ra String, sau đó lấy 2 số cuối Cách 2:
		chia lấy dư số đó cho 100 */
		System.out.println("Question 3");

		int min1 = 0;
		int max2 = 99999;
		int i = (int) (Math.random() * max + min);
			while (i < 10000) {
			i = i * 10;
			}
		System.out.println("Số ngẫu nhiên: " + i);

		String j = String.valueOf(i);
		System.out.println("Hai số cuối: " + j.substring(3));
		System.out.println("\n");

	// Question 4: Viết 1 method nhập vào 2 số nguyên a và b và trả về thương của chúng
		System.out.println("Question 4");

		// gọi hàm trong main
		question4();
		}

		public static void question4() {
			int a, b;
			Scanner scanner = new Scanner(System.in);
			System.out.printf("Nhập a: ");
			a = scanner.nextInt();
			do {
				System.out.printf("Nhập b: ");
				b = scanner.nextInt();
				if (b == 0) {
					System.out.println("Nhập b khác 0! ");
				}
			} while (b == 0);
			scanner.close();

			System.out.println("Thương: " + (float) a / (float) b);
		}
		
}


