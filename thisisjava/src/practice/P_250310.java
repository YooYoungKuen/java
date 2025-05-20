package practice;

import java.util.Scanner;

public class P_250310 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 배열에 5개의 숫자를 입력받아 넣은 다음에
		 * 숫자 하나를 입력받아 그 숫자가 배열에 있는 값이면
		 * 몇 번째 인덱스에 들어 있는지 출력하고
		 * 없으면 배열에 없는 값이라고 출력해 주세요
		 * 인덱스는 0부터 시작합니다.
		 */
		
		
		
		
		
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[5];
		
		System.out.println("숫자 5개를 입력해 주세요");

		
		
		
		for(int i=0; i<arr.length; i++) {
		
			String strA = scanner.nextLine();
			int arr1 = Integer.parseInt(strA);
				 arr[i]= arr1;
		}
		
		
		
		for(int i=0; i<arr.length; i++) {
			
		
			System.out.println("arr ["+i+"]:" + arr[i]);
		
		}
		
		

		System.out.println("숫자 1개를 입력해 주세요");
		
			String strB = scanner.nextLine();
			int input = Integer.parseInt(strB);
			if (input == arr[0]) {
				System.out.println("input은 [0]번째 배열입니다.");
			} else if (input == arr[1]) {
				System.out.println("input은 [1]번째 배열입니다.");
			} else if (input == arr[2]) {
				System.out.println("input은 [2]번째 배열입니다.");
			} else if (input == arr[3]) {
				System.out.println("input은 [3]번째 배열입니다.");
			} else if (input == arr[4]) {
				System.out.println("input은 [4]번째 배열입니다.");
			} else {
				System.out.println("배열에 없는 값입니다.");
			}
		
		
	}			
}
