package com.vti.etity.polymorphism;

public class MyMath {
	public int sum (int a, int b) {
		return (a + b);
	}
	
	public float sum (float a , float b) {
		return (a + b);
	}
	
	public byte sum (int a , byte b) {
		return (byte) (a + b);
	}
	
	public float sum (float a, int b) {
		return (a + b);
	}
}
