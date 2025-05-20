package ch03.sec03;

public class OverflowUnderflowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 오버플로우와 언더플로우 예제
		 * 
		 * 오버플로우: 타입이 허용하는 최대값을 벗어나는 것
		 * 언더플로우: 타입이 허용하는 최소값을 벗어나는 것
		 */

		byte var1 = 125;
		for(int i=0; i<5; i++ ) {	//{}를 5번 반복 실행
			var1++;					//++ 연산은 var1의 값을 1증가시킨다.
			System.out.println("var1:"+var1);
		}
		
		System.out.println("=====================");
		
		byte var2 = -125;
		for(int i=0; i<5; i++) {	//{}를 5번 반복 실행
			var2--;					//-- 연산은 var2의 값을 1 감소시킨다.
			System.out.println("var2"+var2);
		}
		
	}

}
