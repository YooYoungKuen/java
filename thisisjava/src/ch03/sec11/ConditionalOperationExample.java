package ch03.sec11;

public class ConditionalOperationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * 삼항 (조건) 연산자 예제
		 */
		
		
		int score = 85;
		char grade = (score > 90) ? 'A' : ( (score> 80) ? 'B' : 'C' );
		System.out.println(score + "점은 " + grade + "등급입니다.");
	}

}
