package ch05.sec12;
import java.util.Scanner;

public class Example02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열입력: ");
		String strBuffer = sc.nextLine();
		System.out.print("당신이 입력하신 값은 "+ strBuffer +"입니다");
		
		System.out.print("숫자입력: ");
		int intBuffer1 = sc.nextInt();
		System.out.print("두번째 숫자입력: ");
		int intBuffer2 = sc.nextInt();
		System.out.println("당신이 입력하신 숫자의 합은 [" + (intBuffer1 + intBuffer2) +"] 입니다.");
	}

}
