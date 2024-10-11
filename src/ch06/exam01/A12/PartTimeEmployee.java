package ch06.exam01.A12;

public class PartTimeEmployee extends Employee{
	private double hourlyRate; //시간당 급여
    private int hoursWorked; //일한 시간
    
    //생성자 생성
    public PartTimeEmployee(String name, double hourlyRate, int hoursWorked) {
    	super(name);
    	this.hourlyRate = hourlyRate;
    	this.hoursWorked = hoursWorked;
    }
    
    // 급여 계산: 시간당 급여 × 일한 시간
    @Override
    public double calculateSalary() {
    	return hourlyRate * hoursWorked;
    }
    
    
}
