package ch06.exam01.A12;

public class MainExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("홍길동");
	     PartTimeEmployee partTimeEmployee = new PartTimeEmployee("김철수", 15.0, 120);
	     
	     // 각 직원의 이름과 급여 출력
	        System.out.println(fullTimeEmployee.getName() + "의 급여: " + fullTimeEmployee.calculateSalary());
	        // 출력: 홍길동의 급여: 3600.0

	        System.out.println(partTimeEmployee.getName() + "의 급여: " + partTimeEmployee.calculateSalary());
	        // 출력: 김철수의 급여: 1800.0
	}

}
