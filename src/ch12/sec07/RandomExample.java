package ch12.sec07;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] selectNumber = new int[6];
		Random random = new Random(4);
		System.out.println("선택번호");
		for(int i = 0; i<6; i++) {
			selectNumber[i] = random.nextInt(45) +1;
			System.out.print(selectNumber[i] + ", ");
		}
	}

}
