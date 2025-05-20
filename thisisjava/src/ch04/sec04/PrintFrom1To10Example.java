package ch04.sec04;

public class PrintFrom1To10Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * for문 반복문 예제
		 * 
		 * 1. 초기식 제일 먼저 실행
		 * 2. 조건식을 평가한 후 true인지 false인지 판단  ture면 
		 * 3. 실행문을 실행시키고 flase면 for문을 종료하고 블록을 건너뛴다.
		 * 		2번의 조건식이 true가 되어 3번 실행문을 다시 실행할때 4번. 증감식이 실행된다.
		 *    그리고 다시 2번 조건식을 평가하게되고 평가 결과가 true면 (실행문,증감식,조건식)으로 진행하고
		 *    flase면 for 문이 끝나게 된다.
		 */
		
		for(int i =1; i<=10; i++) {
			System.out.print(i + " ");
		}
		
	}

}
