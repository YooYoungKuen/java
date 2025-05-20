package ch03.sec10;

public class AssignmentOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * 대입 연산자 예제
		 * 우측 피연산자의 값을 좌측 변수에 대입.
		 * 우측 피연산자의는 리터럴 및 변수, 그리고 다른 연산식이 올 수 있다.
		 */
		
		int result = 0;
		result += 10;
		System.out.println("result=" + result);
		result -= 5;
		System.out.println("result=" + result);
		result *=3;
		System.out.println("result=" + result);
		result /=5;
		System.out.println("result=" + result);
		result %= 3;
		System.out.println("result=" + result);

	}

}
