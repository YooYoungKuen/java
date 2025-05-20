package practice;

import java.util.Scanner;

public class P_250305_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * 세로와 가로를 입력받아 사각형의 넓이를 만드는 순서도와 프로그램을 만들어 주세요
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		/*  Scanner의 역할
		 *  키보드로부터 입력받은 값들을 엔터칠때까지 문자로 받는다.
		 */
		
		// 1. 가로값을 입력 받는다.
		System.out.print("가로 값 입력 하세요: ");  
		String strX = scanner.nextLine(); //스캐너로 받는 숫자나 문자는 모두 문자로 인식된다.
		int X = Integer.parseInt(strX); 	//문자로 인식되기때문에 숫자로 형변환 하여 사용한다.
		System.out.println("입력받은 가로 값 : " +X+ " 입니다" );
		System.out.println();
		
		// 2. 세로값을 입력 받는다.
		System.out.print("세로 값 입력 하세요: ");
		String strY = scanner.nextLine();
		int Y = Integer.parseInt(strY);
		System.out.println("입력받은 세로 값 : " +Y+ " 입니다" );
		System.out.println();
		
		
		// 3. 사각형의 넓이를 구한다.
		int result = X * Y;
		
		// 4. 사각형의 넓이를 출력한다.
		System.out.println("result:" + result);
		
		
	}

}
