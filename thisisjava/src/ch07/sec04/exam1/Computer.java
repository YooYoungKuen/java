package ch07.sec04.exam1;

public class Computer extends Calculator {

	// 메소드 오버라이딩
	@Override // <--컴파일시 정확히 오버라이딩이 되었는지 체크해줌 (생략가능)
	public double areaCircle(double r) {
		System.out.println("Computer 객체의 arearCircle() 실행");
		return Math.PI * r * r;
	}
}