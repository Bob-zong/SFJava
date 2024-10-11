package ch06.exam01.A07;

public class Student {
	private String name;
	private String id;
	private int score;
	private String grade;
	
	public Student(String name, String id, int score) {
        this.name = name;
        this.id = id;
        this.score = score;
        this.grade = calculateGrade();  // 점수에 따라 성적 자동 계산
    }
	
	public String getName() {
		return this.name;
	}
	
	public String getId() {
		return this.id;
	}
	
	public int getScore() {
		return this.score;
	}
	
	public String getGrade() {
		return this.grade;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setScore(int score) {
		this.score = score;
		this.grade = calculateGrade();  // 점수가 바뀌면 성적도 다시 계산
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	 private String calculateGrade() {
	        if (score >= 90) {
	            return "A";
	        } else if (score >= 80) {
	            return "B";
	        } else if (score >= 70) {
	            return "C";
	        } else if (score >= 60) {
	            return "D";
	        } else {
	            return "F";
	        }
	    }

	
}
