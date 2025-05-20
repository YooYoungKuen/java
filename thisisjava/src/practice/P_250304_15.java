package practice;

import java.util.Scanner;

public class P_250304_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 /*세로와 가로 , 높이 를 입력 받아 사각형의 부피를 만드는 순서도와 프로그램 만들어 주세요
		  *  사각형의 부피는 가로x세로x높이 
		  */
		
		 Scanner scanner = new Scanner(System.in);
		
		 System.out.print("세로 값 입력: ");
		 String strY = scanner.nextLine();
		 int y = Integer.parseInt(strY);
		 
		 System.out.print("가로 값 입력: ");
		 String strX = scanner.nextLine();
		 int x = Integer.parseInt(strX);
	
		 System.out.print("높이 값 입력: ");
		 String strH = scanner.nextLine();
		 int h = Integer.parseInt(strH);
		 
		 
		 int result = y * x * h;
		 System.out.println("y * x * h : " + result);
		 System.out.println();
		
	}

}
