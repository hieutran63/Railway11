
public class Ex5ObjectMethod {
	public static void main(String[] args) {
		Department[] departments = new Department[5];
		
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
		
		departments[0] = department1;
		departments[1] = department2;
		departments[2] = department3;
		departments[3] = department4;
		departments[4] = department5;
		
		question1(department1);
		question2(departments);
		question3(department1);
		question4(department1);
	}

//Bài tập
	//Question 1: In ra thông tin của phòng ban thứ 1 (sử dụng toString())
		public static void question1(Department department) {
			System.out.println(department);
			System.out.println("\n");
		}
			
//--------------------------------------------------------------------------
	//Question 2: In ra thông tin của tất cả phòng ban (sử dụng toString())
		public static void question2(Department[] departments) {
			for (Department department : departments) {
				System.out.println(department);
			}
			System.out.println("\n");
		}
//--------------------------------------------------------------------------
	//Question 3: In ra địa chỉ của phòng ban thứ 1	
		public static void question3(Department department) {
			System.out.println("Địa chỉ phòng ban 1: " + department.hashCode());
			System.out.println("\n");
		}
//--------------------------------------------------------------------------
	//Question 4: Kiểm tra xem phòng ban thứ 1 có tên là "Phòng A" không?
		public static void question4(Department department) {
			if(department.name.equals("Phòng A")) {
				System.out.println("Có tên là phòng A");
			}else {
				System.out.println("Không có tên phòng a");
			}
		}
//----------------------------------------------------------------------------
}
