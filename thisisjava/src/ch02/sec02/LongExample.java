package ch02.sec02;

public class LongExample {

	public static void main(String[] args) {
		
/*
 * 	long 타입 변수 허용 범위 초과 컴파일 오류 예제
 *  숫자 뒤에 L or l 을 입력해줘야 한다	
 */
		
	
		long var1 = 10;
		long var2 = 20;
//		long var3 = 1000000000000; //int로 간주하기 때문에 컴파일 인식 에러 
		long var4 = 1000000000000L;		
		
		
		System.out.println(var1);
		System.out.println(var2);
//		System.out.println(var3);
		System.out.println(var4);
		
		
	}

}
