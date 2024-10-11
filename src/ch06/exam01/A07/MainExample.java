package ch06.exam01.A07;

public class MainExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Student student1 = new Student("Kim", "20231234", 85);
		  
		// 학생 1 정보 출력
	        System.out.println("Student 1 Info:");
	        System.out.println("Name: " + student1.getName());
	        System.out.println("Student ID: " + student1.getId());
	        System.out.println("Score: " + student1.getScore());
	        System.out.println("Grade: " + student1.getGrade());
	        
	        student1.setScore(78);  // 점수를 수정
	        System.out.println("\nStudent 1 Updated Info:");
	        System.out.println("Name: " + student1.getName());
	        System.out.println("Student ID: " + student1.getId());
	        System.out.println("Score: " + student1.getScore());
	        System.out.println("Grade: " + student1.getGrade());
	}

}
