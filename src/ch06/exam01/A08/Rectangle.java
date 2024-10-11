package ch06.exam01.A08;

public class Rectangle {
	private double width;
	private double height;
	private String color;
	
	
	public Rectangle(double rectangleWidth, double rectangleHeight) {
		this.width = rectangleWidth;
		this.height = rectangleHeight;
	}
	
	public double getArea() {
		return (width * height);
	}
	
	public double getPerimeter() {
		return (2 * (width + height));
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
}