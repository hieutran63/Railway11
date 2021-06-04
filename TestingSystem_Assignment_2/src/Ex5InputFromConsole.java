import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Ex5InputFromConsole {
	public static void main(String[] args) {
		
	// Exercise 5: Input from console
	// Question 1: Viết lệnh cho phép người dùng nhập 3 số nguyên vào chương trình

		/*Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập số nguyên x: ");
		int x = scanner.nextInt();
		System.out.println("x là : " + x);
		
		System.out.println("Nhập số nguyên y: ");
		int y = scanner.nextInt();
		System.out.println("y là : " + y);
		
		System.out.println("Nhập số nguyên z: ");
		int z = scanner.nextInt();
		System.out.println("z là : " + z);
		
		System.out.println("\n");/*
		
	// ---------------------------------------------------------------------------
		 
	// Question 2: Viết lệnh cho phép người dùng nhập 2 số thực vào chương trình*/

		/*Scanner scanner1 = new Scanner(System.in);

		System.out.println("Nhập số thực d: ");
		float d = scanner1.nextInt();
		System.out.println("d là : " + d);
		
		System.out.println("Nhập số thực e: ");
		float e = scanner1.nextInt();
		System.out.println("e là : " + e);
		
		System.out.println("\n");*/

	// ----------------------------------------------------------------------------
	// Question 3: Viết lệnh cho phép người dùng nhập họ và tên

		/*Scanner sc = new Scanner(System.in);

		System.out.println("Nhập họ và tên");
		String ht = sc.nextLine();
		System.out.println("Họ và tên là: " + ht);
		sc.close();

		System.out.println("\n");*/
		
//---------------------------------------------------------------------------
	// Hàm main	
		//question4();
		question5();
		question6();
		//question7();
		question8();
	}
	
//Question 4: Viết lệnh cho phép người dùng nhập vào ngày sinh nhật của họ
	
	/* static void question4() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Moi nhap vao nam sinh: ");
		int year = scanner.nextInt();
		System.out.println("Moi nhap vao thang sinh: ");
		int month = scanner.nextInt();
		System.out.println("Moi nhap vao ngay sinh: ");
		int day = scanner.nextInt();
		
		LocalDate dateOfBirth = LocalDate.of(year, month, day);
		System.out.println("Ngày sinh nhật của bạn là: " + dateOfBirth);
	}
//---------------------------------------------------------------------------
	/*Question 5 Viết lệnh cho phép người dùng tạo account (viết thành method)
		 Đối với property Position, Người dùng nhập vào 1 2 3 4 5 và vào 
		 chương trình sẽ chuyển thành Position.Dev, Position.Test, 
		 Position.ScrumMaster, Position.PM */
	 	public static void question5() {
	 		Scanner scanner = new Scanner(System.in);
	 		Account acc1 = new Account();
	 		
	 		System.out.println("Mời bạn nhập vào tên người dùng");
	 		acc1.fullName = scanner.nextLine();
	 		System.out.println("Mời bạn nhập vào email người dùng");
	 		acc1.email = scanner.nextLine();
	 		
	 		System.out.println("Người dùng nhập vào 1 2 3 4 và vào " +
	 				 	" chương trình sẽ chuyển thành Position.Dev, Position.Test, " +
	 				 	" Position.ScrumMaster, Position.PM");
	 			
	 		Position pos1 = new Position();
 			pos1.positonId = 1;
 			
 			String position = scanner.nextLine();
	 			if(position.equals("1")) {
	 				pos1.positionName = PositionName.DEV;
	 			}else if (position.equals("2")) {
	 				pos1.positionName = PositionName.TEST;
	 			}else if (position.equals("3")) {
	 				pos1.positionName = PositionName.SCRUM_MASTER;
	 			}else {
	 				pos1.positionName = PositionName.PM;
	 			}
	 			acc1.position = pos1;
	 			System.out.println(acc1.toString());
	 	}
	 
	 
// --------------------------------------------------------------------------	 
//Question 6: Viết lệnh cho phép người dùng tạo department (viết thành method)
	 public static void question6() {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Nhập vào thông tin Department cần tạo: ");
			Department department = new Department();
			
			System.out.println("Nhập ID: ");
			department.departmentId = scanner.nextInt();
			
			System.out.println("Nhập tên phòng ban: ");
			department.departmentnName = scanner.next();
			
			System.out.println("Thông tin Dapertment: ID: " + department.departmentId + " " +"Name: " + department.departmentnName);
	 }
	 
// --------------------------------------------------------------------------
//Question 7: Nhập số chẵn từ console
	
	public static void question7() {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("Hãy nhập vào số chắn: ");
			int a = scanner.nextInt();
			if(a % 2 == 0) {
				System.out.println("Bạn vừa nhập vào: " + a);
			}else {
				System.out.println("Nhập sai, đây không phải số chắn");
			}
		}
	}
// -------------------------------------------------------------------------
	
	/*Question 8: Viết chương trình thực hiện theo flow sau:
		Bước 1: 
			Chương trình in ra text "mời bạn nhập vào chức năng muốn sử 
			dụng"
		Bước 2: 
			Nếu người dùng nhập vào 1 thì sẽ thực hiện tạo account
			Nếu người dùng nhập vào 2 thì sẽ thực hiện chức năng tạo 
			department
			Nếu người dùng nhập vào số khác thì in ra text "Mời bạn nhập 
			lại" và quay trở lại bước 1 */
	public static void question8() {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("Mời bạn nhập vào chức năng sử dụng");
			int input = scanner.nextInt();
			if (input == 1 || input == 2) {
				switch (input) {
					case 1:
						question5();
						break;
					case 2:
						question6();
						break;
				}
				return;
			}else {
				System.out.println("Mời bạn nhập lại");
			}
		}
	}
}
