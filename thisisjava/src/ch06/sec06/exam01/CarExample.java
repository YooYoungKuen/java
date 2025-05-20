package ch06.sec06.exam01;

public class CarExample {

	public static void main(String[] args) {  //실행을 해야하므로 메인메소드 선언
	
	
	// Car 객체 생성
	
	Car myCar = new Car();  //myCar 변수 안에는 Car()의 번지가 저장되었다
	
	// Car 객체의 필드값 읽기
	System.out.println("모델명: " + myCar.model); //myCar . 은 myCar가 참조하는 그 객체의 번지가 가지고있는 ~~
	System.out.println("시동여부: " + myCar.start);
	System.out.println("현재속도: " + myCar.speed);
	

	}

}
