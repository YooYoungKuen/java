package ch02.sec11;

public class VariableScopeExample {

	public static void main(String[] args) {
		
		/*
		 * 변수 사용 범위
		 * 블록 내에서 선언된 변수는 해당 중괄호안에서만 사용할 수 있다
		 */
		
		int v1 = 15;
		if(v1 > 10) {
			int v2 = v1 - 10;
			System.out.println("v1:" + v1);
			System.out.println("v2:" + v1);
		}
		System.out.println("v1:" + v1);
		System.out.println("v1:" + v1);
		
//		int v3 = v1 + v2 + 5; // 해당 블록에서 v2 변수는 로컬변수로 사용할 수 없기 때문에 컴파일 에러
		int v3 = 100;
		System.out.println("v3:" + v3);
	
	}

}
