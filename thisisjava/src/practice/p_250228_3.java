package practice;

public class p_250228_3 {

	public static void main(String[] args) {

		
//		// 주석으로 설명 해 주세요

//		double d = 85.4; // 실수 85.4 를 실수형 변수 double d 에다가 저장했다
//		int score = (int) d; // 실수형 변수 d를 정수형 변수 score에 강제 변환하여 대입 (int 변환 후 소수점은 버림)
//		System.out.println("score=" + score); //문자열 score=score(score의값) 출력.출력 후 줄바꿈
//		System.out.println("d=" + d); //문자열 d=d(d의 값) 출력. 출력 후 줄바꿈
//		System.out.println("=========================") // 문자열 =====================출력 출력 후 줄바꿈

		
		//주석으로 설명 해 주세요

		byte a = 10; // 10을 정수형 변수 byte a 에 저장했다
		byte b = 30; //30을 정수형 변수 byte b 에 저장했다
		byte c =(byte)(a * b); // 정수형 byte a 와 b 의 값을 곱하여 정수형 변수 byte c에 저장했다
		System.out.println(c); // byte c 의 값을 출력 . 출력 후 줄바꿈
		//출력 값은 44. 원래 출력값은 300이지만 byte 허용 범위초과로 300-256 으로 출력 값 44
		System.out.println("========================="); // 문자열 ================출력. 출력 후 줄바꿈
		
		//주석으로 설명 해 주세요
		
		double num1 = 1.2345; //실수 1.2345 를 실수형 변수 num1 에 저장
		int num2 = 6; // 정수 6을 정수형 변수 num2 에 저장
		System.out.println(num1 + num2); //실수형 num1 , 정수형 num2 를 더한값을 출력. 출력 후 줄바꿈
										// 출력값 = 7.2345
				//double이 int보다 허용범위가 크기 때문에 출력값으로 double 로 출력
	}

}
