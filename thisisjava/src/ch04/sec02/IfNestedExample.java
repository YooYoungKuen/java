package ch04.sec02;

public class IfNestedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * if nested 예제
		 * 
		 *중첩 if문 . if 문 내부에 또 다른 if 문을 사용할 수 있고. 중첩의 단계에는 횟수 제한이 없다.
		 */
		
		int score = (int)(Math.random()*20) + 81;
		System.out.println("점수:" + score);
		
		String grade;
		
		if(score>=90) {
			if(score>=95) {
				grade = "A+";
			} else {			//<----------------- 중첩 if문
				grade = "A";
			}
		} else {
			if(score>=85) {
				grade = "B+";
			} else {			//<----------------- 중첩 if문
				grade = "B";
			}
		}
		
		System.out.println("학점: " + grade);
		
	}

}
