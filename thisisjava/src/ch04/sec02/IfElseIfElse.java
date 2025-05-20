package ch04.sec02;

public class IfElseIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * if else if else 예제
		 * 
		 * 조건문이 여러개인 if문
		 * else if가 true면 해당 블록 실행됨. else if 의 갯수 제한은 없다.
		 * 여러개의 조건식 중 해당 else if 블록만 실행하고 전체 if문을 벗어남.
		 */
		
		int score = 75;
		
		if(score>=90) {
			System.out.println("점수가 100~90 입니다.");
			System.out.println("등급은 A입니다.");
		} else if(score>=80) {
			System.out.println("점수가 80~90 입니다.");		//80<= score <90일 경우
			System.out.println("등급은 B입니다.");
		} else if(score>=70) {
			System.out.println("점수가 70~90 입니다.");		//70<= score <80일 경우
			System.out.println("등급은 C입니다.");
		} else {
			System.out.println("점수가 70 미만입니다..");		//score <70일 경우
			System.out.println("등급은 D입니다.");
		}
		
		
	}

}
