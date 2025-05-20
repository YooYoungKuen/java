package ch02.sec02;

public class ByteExample {

	public static void main(String[] args) {
		
		/*
		 * byte 타입 변수 허용 범위 초과 컴파일 오류 예제
		 * byte 허용범위는 -127 ~ 128  / 256개의 갯수를 가지고 있다.
		 */
		
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = 127;
//		byte var6 = 128;  //허용 범위 초과로 컴파일 자체가 안된다.
	
		
		
		System.out.println("var1:"+var1);
		System.out.println("var2:"+var2);
		System.out.println("var3:"+var3);
		System.out.println("var4:"+var4);
		System.out.println("var5:"+var5);
//		System.out.println("var6:"+var6); //허용 범위 초과로 컴파일 자체가 안된다.
		
	}

}
