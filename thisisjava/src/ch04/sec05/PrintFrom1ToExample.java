package ch04.sec05;

public class PrintFrom1ToExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * While문 반복문 예제
		 * 
		 * 1. 조건식 평가.평가 결과가 true면
		 * 2. 실행문 실행. 실행문이 모두 실행되면 조건식으로 되돌아가서 1 조건식 다시 평가
		 * 다시 조건식이 true라면 2 -> 1로 진행하고 false면 while문을 종료한다.
		 */
		
		int i = 1;
		while (i<=10) {
			System.out.print(i + " ");
			i++;
		}
		
	}

}
