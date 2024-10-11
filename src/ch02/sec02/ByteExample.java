package ch02.sec02;

public class ByteExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		byte var1 = -128;
//		byte var2 = -30;
//		byte var3 = 0;
//		byte var4 = 30;
//		byte var5 = 127;
////		byte var6 = 128;
//		
//		System.out.println(var1);
//		System.out.println(var2);
//		System.out.println(var3);
//		System.out.println(var4);
//		System.out.println(var5);
		
//		
//		int a = -10;
//		int b = a >>> 1;
//		System.out.print(b);
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		
		String substring = subject.substring(location);
		System.out.println(substring);
		
		location = subject.indexOf("자바");
		if(location!= -1) {
			System.out.println("자바와 관련된 책이군요.");
		}
		else {
			System.out.println("자바와 관련 없는 책이군요.");
		}
	
		boolean result = subject.contains("자바");

		if(result) {
			System.out.println("자바와 관련된 책이군요.");
		}
		else {
			System.out.println("자바와 관련 없는 책이군요.");
		}
	
		
	}

}
