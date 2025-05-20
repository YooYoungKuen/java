package ch04.sec02;

public class IfElseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * if else 예제
		 * 
		 * if문의 조건식이 true이면 if문 블록이 실행
		 * if문의 조건식이 false이면 esle문 블록 실행
		 */

		
		int score = 85;
		
		
		if(score>=90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		} else {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");
		}
		
	}

}
