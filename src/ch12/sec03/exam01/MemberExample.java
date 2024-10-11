package ch12.sec03.exam01;

public class MemberExample {
	public static void main(String[] args) {
		Member m1 = new Member("blue");
		Member m2 = new Member("blue");
		Member m3 = new Member("red");
		
		System.out.println(m1 == m2); //메모리 주소값에 연결된 해시코드를 비교 -> False 나옴
//		System.out.println(m)
	}
}
