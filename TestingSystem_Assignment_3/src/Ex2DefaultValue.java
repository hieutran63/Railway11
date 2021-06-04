import java.util.Date;

public class Ex2DefaultValue {

	public static void main(String[] args) {
		Account[] accounts = new Account[5];

		for (int i = 0; i < accounts.length; i++) {
			accounts[i] = new Account();
			accounts[i].Email = "Email " + i;
			accounts[i].UserName = "User name " + i;
			accounts[i].FullName = "Full Name " + i;
			accounts[i].CreateDate = new Date();
		}
		for (Account account : accounts) {
			System.out.println("Email: " + account.Email);
			System.out.println("Username: " + account.UserName);
			System.out.println("Fullname: " + account.FullName);

			System.out.println("CreateDate: " + account.CreateDate);
		}
	}

}
