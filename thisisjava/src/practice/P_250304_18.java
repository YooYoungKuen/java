package practice;

import java.util.Scanner;

public class P_250304_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * 국어,영어,수학, 점수를 입력 받아 평균을 구하여
		 * 다음과 같이 출력하는 프로그램을 만들어보자.
		 * 출력결과:
		 * 국어:80 영어:70 수학:90 평균:80
		 */
	
		Scanner scanner = new Scanner(System.in);
		
		// 1. 국어점수 입력 80
		System.out.print("국어 점수를 입력해주세요: ");
		String strK = scanner.nextLine();
		int korScore = Integer.parseInt(strK);
		
		
		// 2. 영어점수 입력 70
		System.out.print("영어 점수를 입력해주세요: ");
		String strE = scanner.nextLine();
		int engScore = Integer.parseInt(strE);
		
		
		// 3. 수학점수 입력 90
		System.out.print("수학 점수를 입력해주세요: ");
		String strM = scanner.nextLine();
		int mathScore = Integer.parseInt(strM);
		
		
		// 4. 평균점수 구하기
		int result = (korScore + engScore + mathScore) / 3;
		
		// 5. 평균점수 출력
		System.out.println("평균점수는: " + result + " 입니다.");
		
	}

}
