package practice;

import java.util.Scanner;

public class P_250305_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 가로,세로,높이를 입력 받아 사각기둥의 부피를 만드는 순서도와
		 * 프로그램을 만들어 주세요
		 * 사각형 부피 = 가로x세로x높이
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		/*  Scanner의 역할
		 *  키보드로부터 입력받은 값들을 엔터칠때까지 문자로 받는다.
		 */
		
		
		
		
		//1.가로값 입력받는다
		System.out.print("가로 값을 입력 하세요: ");
		String strX = scanner.nextLine();
		int x = Integer.parseInt(strX);
		System.out.println("입력 받은 가로값:" +x+ "입니다.");
		System.out.println();
		
		//2.세로값 입력받는다
		System.out.print("세로 값을 입력 하세요: ");
		String strY = scanner.nextLine();
		int y = Integer.parseInt(strY);
		System.out.println("입력 받은 세로값:" +y+ "입니다.");
		System.out.println();
		
		//3.높이값 입력받는다
		System.out.print("높이 값을 입력 하세요: ");
		String strH = scanner.nextLine();
		int h = Integer.parseInt(strH);
		System.out.println("입력 받은 높이값:" +h+ "입니다.");
		System.out.println();
		
		//4.사각형 부피를 구한다
		int result = x * y * h;
		
		
		//5.사각형 부피를 출력한다.
		System.out.println("result:" + result);

	}

}
