package ch12.sec05;

import java.util.Arrays;

public class SplitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "apple123, orange; banana. kiwi:grape banana42@orange90";
		
		String[] tokens = data.split("[,;.:\\s@]+");
		String strAge = "10";
		
		int age = Integer.parseInt(strAge);
		
		String strWeight = "45.67";
		double weight = Double.parseDouble(strWeight);
		//결과출력
		System.out.println(Arrays.toString(tokens));
		
		
	}

}
