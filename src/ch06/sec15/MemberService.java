package ch06.sec15;

public class MemberService {
	public boolean login(String id, String password) {
		if(id == "hong" && password == "12345") {
			System.out.println("로그인 되었습니다");
			return true;
		}
		else {
			System.out.println("id 또는 password가 올바르지 않습니다");
			return false;
		}
	}
	
	public void logout(String id) {
		System.out.println(id + "님이 로그아웃 되었습니다.");
	}
}
