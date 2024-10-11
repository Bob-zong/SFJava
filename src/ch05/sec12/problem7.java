package ch05.sec12;
import java.util.Scanner;

public class problem7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		
//		System.out.println(arr[0].length);
//		System.out.println(arr[2].length);\
		
//		int[] array = {1,5,3,8,2};
//		int max = array[0];
//		for(int i = 0; i < array.length; i++) {
//			if(array[i] > max) {
//				max = array[i];
//			}
//		}
//		System.out.print(max);
//		int sum = 0;
		
//		for(int[] e : arr) {
//			for(int item : e)
//				sum += item;
//		}
//		System.out.print("총 합: " + sum + " 평균: " + sum / 10);
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("-------------------------------------------------");
		System.out.println("1.학생수 |2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
		System.out.println("-------------------------------------------------");
		int selectNum = 0;
		int studentNum = 0;
		
		int arr1[] = null;
		
		while(selectNum != 5) {
			System.out.print("선택> ");
			selectNum = sc.nextInt();
			
			switch(selectNum) {
			case 1:
				System.out.print("학생수> ");
				studentNum = sc.nextInt();
				 arr1 = new int[studentNum];
				break;
			case 2:
				int scoreArr[] = new int[studentNum];
				for(int i = 0; i < studentNum; i++) {
					scoreArr[i] = sc.nextInt();
				}
				System.arraycopy(scoreArr, 0, arr1, 0, scoreArr.length);
				break;
			case 3:
				for(int i = 0 ; i< studentNum; i++) {
					System.out.print(arr1[i] + ", ");
				}
				System.out.println();
				break;
			case 4:
				int sum = 0;
				for(int i = 0; i < arr1.length; i++) {
					sum += arr1[i];
				}
				System.out.println("총 합: " + sum + " 평균: " + sum / arr1.length);
				break;
			case 5:
				break;
			}
			
			
		}
	}

}
