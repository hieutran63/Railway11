
public class Ex3BoxingUnboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*Question 1: Khởi tạo lương có datatype là Integer có giá trị bằng 5000.
			Sau đó convert lương ra float và hiển thị lương lên màn hình 
			(với số float có 2 số sau dấu thập phân)*/
		System.out.println("Question 1");
		Integer salary = 5000;
		
		System.out.printf("%.2f", (float) salary);
		System.out.println('\n');	
//----------------------------------------------------------------------------
	/* Question 2: Khai báo 1 String có value = "1234567"
				   Hãy convert String đó ra số int*/
		System.out.println("Question 2");
		String a = "1234567";
		int b = Integer.parseInt(a);
		
		System.out.println(b);
		System.out.println('\n');
//----------------------------------------------------------------------------
	/* Question 3: Khởi tạo 1 số Integer có value là chữ "1234567"
				   Sau đó convert số trên thành datatype int */
		System.out.println("Question 3");
		Integer i = 1234567;
		int k = i.intValue();
		
		System.out.println(k);
		System.out.println('\n');
		
	}

}
