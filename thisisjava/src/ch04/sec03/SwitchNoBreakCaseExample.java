package ch04.sec03;

public class SwitchNoBreakCaseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * break 없는 switch문 예제
		 */
		
		int time = (int)(Math.random()*4) + 8;  //8보다 크거나 같고 11보다 작거나 같은 정수 랜덤뽑기
												// 8부터 시작하는 4개의 숫자
		System.out.println("[현재 시간: " + time + "시]");
		
		switch(time) {
		case 8:
			System.out.println("출근합니다.");
		case 9:
			System.out.println("회의를 합니다.");
		case 10:
			System.out.println("업무를 봅니다.");
		case 11:
			System.out.println("외근을 나갑니다.");
		}
		
	}

}
