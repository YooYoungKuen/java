package ch09.sec02.exam02;

public class AExample {

	public static void main(String[] args) {

		//A 객체 생성
		A a = new A();
		
		//A 인스턴스 메소드 호출
		a.useB();
		
		A.B b = a.new B ();
		
		A.B.method2();
		int f2 = A.B.field2;
		System.out.println(f2);

	}

}
