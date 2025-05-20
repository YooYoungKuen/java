package ch05.sec04;

public class NullPointerExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/* 예외 Exception
		 * NullPointerException
		 */
		
		
		//아래 코드를 실행하면 intArray가 참조하는 배열 객체가 없으므로 10을 저장할 수 없기 때문에
		//NullPointerException 이 발생한다.
//		int [] intArray = null;
//		intArray[0] = 10;   //NullPointerException

		
		
		//문자열의 길이를 얻기위해 length() 메소드를 호출하면 NullPointerException발생
		//str 변수가 참조하는 String 객체가 없으므로 문자열의 길이를 구할 수 없다
		String str = null;
		
		System.out.println("총 문자 수: " + str.length() );//NullPointerException
	}

}
