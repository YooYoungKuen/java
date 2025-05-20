package ch02.sec05;

public class BooleanExample {

	public static void main(String[] args) {
		boolean stop = true;
	/*
	 * 논리 타입 예제
	 * boolean 타입 변수는 두가지 상태값을 저장할 필요가 있을 경우 사용	
	 */
		if (stop) {
			System.out.println("중지");
		} else {
			System.out.println("시작");
		}
		
		int x = 10;
		boolean result1 = (x == 20);
		boolean result2 = (x != 20);
		System.out.println("result1:"+result1);
		System.out.println("result2:"+result2);
	}

}
