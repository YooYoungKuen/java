package ch03.sec01;

public class SignOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 부호 연산자 예제
		 * 
		 * 부호 변경 후의 타입을 주의해야 함.
		 * 정수타입(byte,short,int) 연산의 결과는 int 타입.
		 * ex)
		 * byte b=100;
		 * byte result=-b;   //컴파일 에러
		 * 
		 * ex)
		 * byte b=100;
		 * int result=-b;     //타입변경
		 */
		
		
		int x = -100;
		x = -x;
		System.out.println("x:" + x);
		
		byte b= 100;
		int y = -b;
		System.out.println("y:" + y);

	}

}
