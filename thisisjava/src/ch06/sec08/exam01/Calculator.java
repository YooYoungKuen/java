package ch06.sec08.exam01;

public class Calculator {

	/*
	 * 필드 없고 생성자 없고 메소드만 선언
	 * 
	 * 각각의 메소드 안에서 내부호출은 없다
	 */

	// 리턴값이 없는 메소드 선언
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}

	// 리턴값이 없는 메소드 선언
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}

	// 호출 시 두 정수 값을 전달받고,
	// 호출한 곳으로 결과값 int를 리턴하는 메소드 선언
	// 호출한 메소드에서 값을 가져와서 아래 x,y에 저장을 하고 아래 실행문을 실행시켜 그 값을
	// 호출한 메소드에게 리턴시킨다.
	int plus(int x, int y) {
		int result = x + y;
		return result; // 리턴값 지정;
	}

	// 호출 시 두 정수 값을 전달받고,
	// 호출한 곳으로 결과값 double을 리턴하는 메소드 선언
	double divide(int x, int y) {
		double result = (double) x / (double) y;
		return result;

	}
}
