package ch04.sec04;

public class FloatCounterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * for문 작성시 부동 소수점을 쓰는 float타입을 사용하면 안된다
		 * 
		 * 연산 과정에서 정확히 0.1을 표현하지 못하기 때문에 증감식에서 x에 더해지는 실제 값은 0.1보다
		 * 약간 클 수 있다. 따라서 최종 반복 횟수는 9번이 된다.
		 */
		
		for (float x=0.1f; x<=1.0f; x+=0.1f) {
			System.out.println(x);
		}
	}

}
