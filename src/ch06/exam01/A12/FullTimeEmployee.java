package ch06.exam01.A12;

public class FullTimeEmployee extends Employee {
	
	public FullTimeEmployee(String name) {
        super(name);
    }
	
	public double calculateSalary() {
		 return BASE_SALARY + (BASE_SALARY * BONUS_RATE);
	}
	
}
