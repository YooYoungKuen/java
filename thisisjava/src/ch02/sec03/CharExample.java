package ch02.sec03;

public class CharExample {

	public static void main(String[] args) {
//		char 타입 변수 예제
		
		char c1 = 'A';   // 대문자 'A' 는 65
		char c2 = 65;
		
		char c3 = '가';
		char c4 = 44032;
		
		char c5 = ' '; //초기화 목적으로 작은 따옴표 두개 연달아붙인 빈문자를 대입하면 컴파일 에러가뜬다.
							//이 경우에는 공백을 하나 넣어라
		
		System.out.println("c1:"+c1);
		System.out.println("c2:"+c2); //문자형이므로 문자로 출력
		System.out.println("c2+1:"+(c2+1));
		System.out.println("c2+1:"+(char)(c2+1));
		System.out.println("c3:"+c3);
		System.out.println("c4:"+c4);
		System.out.println("c4:"+(c4+1));
		System.out.println("c4+1:"+(char)(c4+1));
		System.out.println("c5:"+c5);

		
	}

}
