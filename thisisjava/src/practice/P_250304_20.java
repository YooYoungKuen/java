package practice;

import java.util.Scanner;

public class P_250304_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * 한 박스에 12자루의 연필이 들어 있고 연필 1자루는 1000원이다.
		 * 소비자가 몇 박스와 연필 몇자루를 구매할 것인지 입력 받아 지불해야 할 돈을 
		 * 계산해 주는 프로그램을 구현
		 */
		
		 Scanner scanner = new Scanner(System.in);
			
		 System.out.print("구매할 연필 박스 수: ");
		 String strA = scanner.nextLine();
		 int a = Integer.parseInt(strA);
		 
		 System.out.print("구매할 연필 자루 수: ");
		 String strB = scanner.nextLine();
		 int b = Integer.parseInt(strB);
	
		 int result = 1000*(a*12+b);
		 
		 System.out.println("지불해야 할 금액: " + result);
		 System.out.println();
		
		
	}

}
