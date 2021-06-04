
public class Ex6Method {
	public static void main(String[] args) {

// Question 1: Tạo method để in ra các số chẵn nguyên dương nhỏ hơn 10
// Question 3: Tạo method để in ra các số nguyên dương nhỏ hơn 10
		question1();
		question3();
	}
	 static void question1(){
		for(int i = 0; i < 10; i++) {
			if(i%2 == 0) { 
				System.out.println(i);
			}
		}
	 }
	 
	 public static void question3 (){
			for (int i = 1; i < 10; i++) {
					System.out.println(i + "");
			}
		}
}
		
	
