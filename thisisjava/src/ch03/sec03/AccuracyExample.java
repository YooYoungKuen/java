package ch03.sec03;

public class AccuracyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * 정확한 계산은 정수 연산으로
		 * 
		 * 산술 연산을 정확하게 계산하고 싶다면 실수 타입을 사용하지 않는 것이 좋다.
		 * 
		 * 
		 * 밑에 예제는 사과 1개를 0.1단위의 10조각으로 보고, 그 중 7조각(0.7)을 뺀 3조각(0.3)을 result 변수에 저장한다.
		 */
		
		
		
//		int apple = 1;
//		double pieceUnit = 0.1;
//		int number = 7;
//		
//		double result = apple -number*pieceUnit;
//		System.out.println("사과 1개에서 남은 양:" +  result);
		
		/*출력된 결과를 보면 result 변수의 값이 정확히 0.3이 아니다.
		 * 부동 소수점 방식을 사용하는 실수 타입에서 흔히 일어나는 일이기 때문에 정확한 계산이 필요하다면
		 * 정수 연산으로 변경해서 아래와 같이 계산하는 것이 좋다.
		 */
		
		
		System.out.println("------------------------------------------");
		
		int apple = 1;
		int totalPieces = apple * 10;
		int number = 7;
		
		int result = totalPieces - number;
		System.out.println("10조각에서 남은 조각:" +  result);
		System.out.println("사과 1개에서 남은 양:" +  result/10.0);
		
		
		
	}

}
