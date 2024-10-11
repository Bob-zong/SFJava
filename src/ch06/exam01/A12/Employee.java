package ch06.exam01.A12;

public class Employee {
	public static final int BASE_SALARY = 2000000;
	public static final double BONUS_RATE = 0.2;
	
	private String name;
	
	public Employee(String name) {
		this.name = name;
	}
	
	public double calculateSalary() {
		return 0;
	}
	
	public String getName() {
		return this.name;
	}
	
}
