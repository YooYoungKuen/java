package ch09.sec02.exam01;

public class AExample {

	public static void main(String[] args) {

		
		//A 객체 생성
		A a = new A();
		
		System.out.println("1----------------------");
		
		//B 객체 생성
		A.B b = a.new B();
		System.out.println("2----------------------");
	}

}
