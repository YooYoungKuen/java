package ch04.sec05;

public class SumFrom1To100Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * 1부터 100까지 합을 구하는 while문
		 * 
		 * while 문 내에서 계속 누적되는 값을 갖는 sum 변수는 while문 시작 전에 미리 선언 한다.
		 */
		
		int sum = 0;
		
		int i = 1;
		
		while(i<=100) {
			sum += i;
			i++;
		}
		
		System.out.println("1~" + (i-1) + " 합 : " + sum);
	}

}
