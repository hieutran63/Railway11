package com.vti.etity.encapsulation;

public class Circle {
	private double radius;
	private String color;
	
	public static final Double PI = 3.14;
	
	public Circle() {
		
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public Circle(double radius, String color) {
		super();
		this.radius = radius;
		this.color = color;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public Double getArea() {
		return PI * Math.pow(this.radius, 2.0);
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + "]";
	}
	
	
}
