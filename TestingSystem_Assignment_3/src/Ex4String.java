import java.util.Scanner;

public class Ex4String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 question1();
		// question2();
		// question3();
		// question4();
		// question5();
		// question6();
		// question7();
		// question8();
		// question9();
		// question10();
		// question11();
		// question12();
		// question13();
		// question14();
		// question15();
		// question16();
	}

/*  Question 1:Nhập một xâu kí tự, đếm số lượng các từ trong xâu kí tự đó (các từ
	 có thể cách nhau bằng nhiều khoảng trắng ); */
	
	public static void question1() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Question 1");
		System.out.println("Nhập vào 1 xâu kí tự: ");
		String a = scanner.nextLine();
		System.out.println(a.length());
		
		//String[] words = a.split(" ");
		//System.out.println("Số kí tự: " + words.length);
		scanner.close();
	}
// -----------------------------------------------------------------------------

/* Question 2: Nhập hai xâu kí tự s1, s2 nối xâu kí tự s2 vào sau xâu s1; */
	
	/*public static void question2() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Question 2");
		System.out.println("Nhập xâu kí tự 1: ");
		String s1 = scanner.next();
		System.out.println("Nhập xâu kí tự 2: ");
		String s2 = scanner.next();

		System.out.println("Sau khi nối 2 xâu là: " + s1 + " " + s2);
		scanner.close();
	}
	// ----------------------------------------------------------------------------

/* Question 3: Viết chương trình để người dùng nhập vào tên và kiểm tra, nếu tên
	 chư viết hoa chữ cái đầu thì viết hoa lên*/
	
	/*public static void question3() {	
					Scanner scanner = new Scanner(System.in);
					
					System.out.println("Question 3");
					System.out.println("Nhập tên người dùng: ");
					String ten = scanner.nextLine();
					String firstCharacter = ten.substring(0,1).toUpperCase();
					String leftCharacter = ten.substring(1);
					
					ten = firstCharacter + leftCharacter;
					System.out.println("Tên viết hoa: " + ten);
					scanner.close();
				}
	// ----------------------------------------------------------------------------

	/*Question 4: *Viết chương trình để người dùng nhập vào tên in từng ký tự trong
	  tên của người dùng ra VD: Người dùng nhập vào "Nam", hệ thống sẽ in ra
	  "Ký tự thứ 1 là: N" "Ký tự thứ 1 là: A" "Ký tự thứ 1 là: M" */
	
	/*public static void question4() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Question 4");
		System.out.println("Nhập tên: ");
		String ten = scanner.nextLine();

		ten = ten.toUpperCase();
		for (int i = 0; i < ten.length(); i++) {
			System.out.println("Kí tự thứ " + i + " là: " + ten.charAt(i));
			;
		}
		scanner.close();
	}

	// ----------------------------------------------------------------------------

	/* Question 5:Viết chương trình để người dùng nhập vào họ, sau đó yêu cầu người
	  dùng nhập vào tên và hệ thống sẽ in ra họ và tên đầy đủ */
	
	/*public static void question5() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập họ người dùng: ");
		String ho = scanner.nextLine();
		System.out.println("Nhập tên người dùng");
		String ten = scanner.nextLine();

		System.out.println("Họ và tên người dùng: " + ho + " " + ten);
		scanner.close();
	}
// ----------------------------------------------------------------------------

	/*Question 6: Viết chương trình yêu cầu người dùng nhập vào họ và tên đầy đủ và
	 sau đó hệ thống sẽ tách ra họ, tên , tên đệm VD: Người dùng nhập vào
	 "Nguyễn Văn Nam" Hệ thống sẽ in ra "Họ là: Nguyễn" "Tên đệm là: Văn"
	 "Tên là: Nam" */
	
	/*public static void question6() {
		String firstName = "", middleName = "", lastName = "";
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập họ và tên người dùng: ");
		String fullName = scanner.nextLine();

		fullName = fullName.trim();
		String[] words = fullName.split(" ");
		firstName = words[0];
		lastName = words[words.length - 1];
		for (int i = 1; i <= words.length - 2; i++) {
			middleName += words[i] + "";
		}
		System.out.println("Họ là: " + firstName);
		System.out.println("Tên đệm là: " + middleName);
		System.out.println("Tên là: " + lastName);
		scanner.close();
	}
// ----------------------------------------------------------------------

	/* Question 7: Viết chương trình yêu cầu người dùng nhập vào họ và tên đầy đủ và
	  chuẩn hóa họ và tên của họ như sau: a) Xóa dấu cách ở đầu và cuối và giữa của
	  chuỗi người dùng nhập vào VD: Nếu người dùng nhập vào " nguyễn văn nam " thì
	  sẽ chuẩn hóa thành "nguyễn văn nam" b) Viết hoa chữ cái mỗi từ của người dùng
	  VD: Nếu người dùng nhập vào " nguyễn văn nam " thì sẽ chuẩn hóa thành
	  "Nguyễn Văn Nam"
	 */
	/*public static void question7() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập vào họ và tên người dùng: ");
		String fullName = scanner.nextLine();
		scanner.close();

		// xóa dấu cách đầu, cuối và giữa
		fullName = fullName.trim();
		fullName = fullName.replaceAll("\\s+", " ");
		System.out.println("Họ và tên sau chuẩn hóa 1: " + fullName);

		// Viết hoa chữ cái đầu
		String[] words = fullName.split(" ");
		fullName = " ";
		for (String word : words) {
			String firstCharacter = word.substring(0, 1).toUpperCase();
			String lestCharacter = word.substring(1);
			word = firstCharacter + lestCharacter;
			fullName += word + " ";
		}
		System.out.println("Họ và tên sau chuẩn hóa 2: " + fullName);
	}
	// --------------------------------------------------------------------------

	// Question 8: In ra tất cả các group có chứa chữ "Java"
	 
	public static void question8() {
		String[] groupNames = { "Lập trình Java", "Làm thế nào học Java hiệu quả", "Ngôn ngữ gia va như thế nào" };
		for (String groupName : groupNames) {
			if (groupName.contains("Java")) {
				System.out.println(groupName);
			}
		}
	}

	// --------------------------------------------------------------------------
	// Question 9: In ra tất cả các group "Java"
	  
	/*public static void question9() {
		String[] groupNames = { "Lập trình Java", "Làm thế nào học Java hiệu quả", "Ngôn ngữ gia va như thế nào" };
		for (String groupName : groupNames) {
			if (groupName.equals("Java"))
				;
			System.out.println(groupName);
		}
	}

	// -------------------------------------------------------------------------
	/*Question 10 (Optional): (Resever: đảo ngược chuỗi) Kiểm tra 2 chuỗi có là đảo
	  ngược của nhau hay không. Nếu có xuất ra “OK” ngược lại “KO”. Ví dụ “word” và
	  “drow” là 2 chuỗi đảo ngược nhau*/
	
	/*public static void question10() {
		Scanner scanner = new Scanner(System.in);
		String s1, s2, reseverS1 = "";

		System.out.println("Nhập chuỗi 1: ");
		s1 = scanner.nextLine();
		System.out.println("Nhập chuỗi 2: ");
		s2 = scanner.nextLine();
		scanner.close();

		for (int i = s1.length() - 1; i >= 0; i--) {
			reseverS1 += s1.substring(i, i + 1);
		}
		if (s2.endsWith(reseverS1)) {
			System.out.println("Đây là chuỗi đảo ngược !");
		} else {
			System.out.println("Đây là chuỗi không đảo ngược");
		}
	}
	// --------------------------------------------------------------------------

	/* Question 11: Tìm số lần xuất hiện ký tự "a" trong chuỗi
	  sd: Count special Character*/
	
	/*public static void question11() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập chuỗi: ");
		String s = scanner.nextLine();
		scanner.close();

		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if ('a' == s.charAt(i)) {
				count++;
			}
		}
		System.out.println("Số lần xuất hiện kí tự 'a': " + count);
	}

// --------------------------------------------------------------------------
	/* Question 12 (Optional): Reverse String Đảo ngược chuỗi sử dụng vòng lặp */
	
	/*public static void question12() {
		Scanner scanner = new Scanner(System.in);
		String resever = "";

		System.out.println("Nhập chuỗi");
		String a = scanner.nextLine();
		scanner.close();

		for (int i = a.length() - 1; i >= 0; i--) {
			// resever += a.substring(i, i + 1);
			resever += a.charAt(i);
		}
		System.out.println(resever);
	}
// --------------------------------------------------------------------------

	/* Question 13 (Optional): String not contains digit Kiểm tra một chuỗi có chứa
	   chữ số hay không, nếu có in ra false ngược lại true. Ví dụ: "abc" => true
	  "1abc", "abc1", "123", "a1bc", null => false */
	
	/*public static void question13() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập chuỗi: ");
		String str = scanner.nextLine();
		scanner.close();

		for (int i = 0; i < str.length(); i++) {
			if (checkKeyNumber(str.charAt(i))) {
				System.out.println("False");
				return;
			}
		}
		System.out.println("True");
	}

	public static boolean checkKeyNumber(char ch) {
		if (ch >= '0' && ch <= '9') {
			return true;
		}
		return false;
	}
// -----------------------------------------------------------------------

	/* Question 14 (Optional): Replace character 
	  Cho một chuỗi str, chuyển các ký tự được chỉ định sang một ký tự khác cho trước.
	  
	   Ví dụ: "VTI Academy" chuyển ký
	         tự 'e' sang '*' kết quả " VTI Acad*my */
	/*public static void question14() {
		Scanner scanner = new Scanner(System.in);
		
	}*/
//-------------------------------------------------------------------------------------

	/*Question 15: Revert string by word
	Đảo ngược các ký tự của chuỗi cách nhau bởi dấu cách mà không dùng thư viện.
	 
		Ví dụ: " I am developer " => "developer am I". 
		Các ký tự bên trong chỉ cách nhau đúng một dấu khoảng cách.
		
		Gợi ý: Các bạn cần loại bỏ dấu cách ở đầu và cuối câu, thao tác cắt 
		chuỗi theo dấu các */
	
	public static void question15() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhập chuỗi: ");
		String str = scanner.nextLine();
		scanner.close();
		
		str = str.trim();
		str = str.replaceAll("\\s+", " ");
		
		String[] words = str.split(" ");
		
		for (int i = words.length - 1; i >= 0; i--) {
			System.out.println(words[i] + " ");;
		}
	}
//-----------------------------------------------------------
	
	/*Question 16:Cho một chuỗi str và số nguyên n >= 0. Chia chuỗi str ra làm các phần 
	bằng nhau với n ký tự. Nếu chuỗi không chia được thì xuất ra màn 
	hình “KO” */
	
}
