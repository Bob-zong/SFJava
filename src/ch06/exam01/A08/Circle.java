package ch06.exam01.A08;

public class Circle {
	private double radius;
	public static final double PI = 3.14159;
	private String color;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return (radius * radius * PI);
	}
	
	public double getPerimeter() {
		return (2 * PI * radius);
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	
	
	
}
