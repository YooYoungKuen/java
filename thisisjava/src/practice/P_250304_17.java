package practice;

import java.util.Scanner;

public class P_250304_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/* 
		 * 두 수를 입력 받아 두 수의 차를 출력하는 프로그램을 작성
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("a의 값: ");
		String strA = scanner.nextLine();
		int a = Integer.parseInt(strA);
		
		System.out.print("b의 값: ");
		String strB = scanner.nextLine();
		int b = Integer.parseInt(strB);
		
		int result = a - b;
		
		if(result < 0) {
			result = result * -1;			// -1을 곱하면 양수가 된다
		}
		System.out.println("두수의 차는: " + result + "입니다." );
		
	}

}
