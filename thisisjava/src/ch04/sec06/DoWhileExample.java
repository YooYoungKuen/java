package ch04.sec06;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * do-while문
		 * 처음 실행 될때
		 * 1번.실행문을 무조건 한번 실행 .실행문이 모두 실행되면
		 * 2번.조건식 평가. 결과가 true면 1 -> 2 반복실행. 조건식 결과가 false면 do-while문 종료
		 *
		 */

		System.out.println("메시지를 입력하세요.");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
		
		Scanner scanner = new Scanner(System.in);		//scanner 실행
		String inputString;
		
		do {
			System.out.print(">");
			inputString = scanner.nextLine();			//키보드로부터 읽기
			System.out.println(inputString);
		} while( ! inputString.equals("q") );		//입력된 내용이 q가 아니라면 계속 반복
		
		System.out.println();
		System.out.println("프로그램 종료");
	}

}
