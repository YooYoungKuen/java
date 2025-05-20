package ch04.sec05;

import java.util.Scanner;

public class KeyControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * 만약 조건식에서 true를 사용하면 while (true) {...}가 되어서 무한 반복하게된다.
		 * 이럴경우 while 문을 빠져나가기 위한 코드가 필요하다.
		 * 키보드에서 1,2를 입력했을 때 속도를 증속, 감속시키고, 3을 입력하면 프로그램을 종료시키는 예제
		 * 
		 */
		
		
		Scanner scanner = new Scanner(System.in);		//키보드로 조작하기위해 스캐너 생성
		
		boolean run = true;			//while 문의 조건식을 위한 변수 선언
		int speed = 0;
		
		while(run) {
			System.out.println("-----------------------");		//
			System.out.println("1. 증속 | 2. 감속 | 3. 중지");		//
			System.out.println("-----------------------");		// 메뉴생성
			System.out.println("선택:");							//
			
			String strNum = scanner.nextLine();			//입력받은 값은 문자열. 키보드에서 입력한 내용을 읽음
			
			if(strNum.equals("1")) {
				speed++;
				System.out.println("현재 속도 = " + speed);	
			} else if(strNum.equals("2")) {				
				speed++;				
				System.out.println("현재 속도 = " + speed);	
			} else if(strNum.equals("3")) {	
				run = false;			//while 문의 조건식을 false로 만듦
			}
		}
		
		System.out.println("프로그램 종료");
		
	}

}
