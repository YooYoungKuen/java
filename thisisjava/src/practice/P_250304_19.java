package practice;

import java.util.Scanner;

public class P_250304_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * 키를 m로 소수점 2째 자리까지 입력 받아 cm로 바꿔주는 프로그램을 구현
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		
		// m 값 입력
		System.out.print("원하시는 m를 입력하세요 : ");
		String strA = scanner.nextLine();  // 스캐너에서 입력받는 값은 문자열
		double meter = Double.parseDouble(strA);  //문자열을 실수타입 double로 변환
		double cm = meter / 100d;  // 입력값의 1/00 을 cm에 대입

		
		
		// 출력
		System.out.println( cm +"cm");
		
		
	}

}
