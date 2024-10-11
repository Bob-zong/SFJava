package ch06.sec15;

public class MemberExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member user1 = new Member("홍길동", "hong");
		
		MemberService memberService = new MemberService();
		boolean result = memberService.login("hong", "12345");
		System.out.println(user1.name + " " + user1.id);
		
		
		
	}

}
