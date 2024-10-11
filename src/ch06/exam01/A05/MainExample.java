package ch06.exam01.A05;

public class MainExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person();
		
		person.setAge(26);
		person.setName("박준용");
		
		int age = person.getAge();
		String name = person.getName();
		
		person.printPerson();
	}	

}
