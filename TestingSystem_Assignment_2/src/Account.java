import java.sql.Date;
import java.time.LocalDate;
import java.util.Arrays;

public class Account {
	int accountId;
	String email;
	String userName;
	String fullName;
	Department department;
	Position position;
	LocalDate createDate;

	Group[] groups;

	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", email=" + email + ", userName=" + userName + ", fullName="
				+ fullName + ", department=" + department + ", position= " + position + ", createDate=" + createDate
				+ ", groups=" + Arrays.toString(groups) + "]";
	}
	
}
