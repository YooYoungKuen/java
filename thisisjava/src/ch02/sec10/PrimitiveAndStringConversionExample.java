package ch02.sec10;

public class PrimitiveAndStringConversionExample {

	public static void main(String[] args) {

		
		/*
		 * 문자열을 기본 타입으로 변환 예제
		 * Integer.parseInt
		 * Double.parseDouble
		 * Boolean.parseBoolean
		 * 변환하고 싶은 기본형을 앞글자 대문자로 써서 변환
		 * Int 만  Integer 로 기재
		 */
		
		
		int value1 = Integer.parseInt("10"); //정수형 int를 문자열 String 으로 변환
		double value2 = Double.parseDouble("3.141592"); //실수형 double을 문자열 String으로 변환
		boolean value3 = Boolean.parseBoolean("true"); //논리형 boolean을 문자열 String으로 변환
		
		System.out.println("value1: " + value1);
		System.out.println("value2: " + value2);
		System.out.println("value3: " + value3);
		
		String str1 = String.valueOf(10);  //기본타입의 값을 문자열로 변경하는 경우
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(false);
		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);
		System.out.println("str3: " + str3);
	
	}

}
