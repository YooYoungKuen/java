package ch04.sec03;

public class SwitchCharExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * char 타입 변수를 이용해서 영어 대소문자에 관계없이
		 * 똑같이 처리하는 예제
		 */

//		char grade = 'B';
		char grade = 'b';
		
		switch(grade) {
		case 'A':
		case 'a':
			System.out.println("우수 회원입니다.");
			break;
		case 'B':
		case 'b':
			System.out.println("일반 회원입니다.");
			break;
			default:
				System.out.println("손님입니다.");
		}
	}
}
