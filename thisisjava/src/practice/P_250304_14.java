package practice;

import java.util.Scanner;

public class P_250304_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 /*세로와 가로를 입력 받아 사각형의 넓이를 만드는 순서도와 프로그램 만들어 주세요
		  *  사각형의 넓이는 가로 x 세로
		  */
		
		 Scanner scanner = new Scanner(System.in);
		
		 System.out.print("세로 값 입력: ");
		 String strY = scanner.nextLine();
		 int y = Integer.parseInt(strY);
		 
		 System.out.print("가로 값 입력: ");
		 String strX = scanner.nextLine();
		 int x = Integer.parseInt(strX);
		 
		 int result = y * x ;
		 System.out.println("y * x: " + result);
		 System.out.println();
		
	}

}
