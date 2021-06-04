import java.util.Arrays;

public class Ex5ObjectMethod1 {

	public static void main(String[] args) {
		Department department1 = new Department();
		department1.id = 1;
		department1.name = "Accounting";
		
		Department department2 = new Department();
		department2.id = 2;
		department2.name = "Waiting room";
		
		Department department3 = new Department();
		department3.id = 3;
		department3.name = "Marketing";
		
		Department department4 = new Department();
		department4.id = 4;
		department4.name = "Waiting room";
		
		Department department5 = new Department();
		department5.id = 5;
		department5.name = "Waiting room";
		
  /*Question 5:  So sánh 2 phòng ban thứ 1 và phòng ban thứ 2 xem có bằng nhau 
		không (bằng nhau khi tên của 2 phòng ban đó bằng nhau)*/

		System.out.println("Question 5");
		System.out.println(department1.equals(department2));
		
		System.out.println("\n");
 //--------------------------------------------------------------------------		
 //Question 6:
		System.out.println("Question 6");
		String[] listPhongBan = {"Waiting room", "Boss of director", "Sale", "Marketing", "Accounting"};
		
		Arrays.sort(listPhongBan);
		System.out.println(listPhongBan[0]);
		System.out.println(listPhongBan[1]);
		System.out.println(listPhongBan[2]);
		System.out.println(listPhongBan[3]);
		System.out.println(listPhongBan[4]);
	}
//---------------------------------------------------------------------------
	//Question 7:
}
