package com.vti.backend;

import com.vti.etity.polymorphism.MyMath;

public class Exercise2_4 {
	public void question4() {
		MyMath math = new MyMath();
		int result = math.sum(1, 2);
		System.out.println(result);
		
		float result1 = math.sum(3.5f, 4.6f);
		System.out.println(result1);
		
		byte result2 = (byte) math.sum(5, 7);
		System.out.println(result2);
		
		float result3 = (float) math.sum(5.7f, 9);
		System.out.println(result3);
	}
}
