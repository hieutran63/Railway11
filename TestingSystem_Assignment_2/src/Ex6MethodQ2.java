import java.time.LocalDate;

public class Ex6MethodQ2 {

	public static void main(String[] args) {
		System.out.println("Question 2");
		// TODO Auto-generated method stub
	// Question 2:Tạo method để in thông tin các account
		Account account1 = new Account();
		account1.accountId = 1;
		account1.email = "trantronghieu@gmail.com";
		account1.userName = "trong hieu";
		account1.fullName = "Trần Trọng Hiếu";			
		account1.createDate = LocalDate.of(2020, 03, 18);

		Account account2 = new Account();
		account2.accountId = 2;
		account2.email = "tranphuongthao@gmail.com";
		account2.userName = "phuong thao";
		account2.fullName = "Trần Phương Thảo";
		account2.createDate = LocalDate.of(2018, 07, 19);

		Account[] dsAccount = new Account[] { account1, account2 };
		question2(dsAccount);
	}

	static void question2(Account[] listAccount) {
		for (Account account : listAccount) {
			System.out.println(account.toString());

		}
	}

}
