package ch04.sec03;

public class SwitchExpressionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 스위치문 예제
		 * Java12 이후부투 사용하는 Expressions(표현식)
		 * break를 없애는 대신에 화살표와 중괄호를 사용해 가독성 좋아짐
		 * 그래도 중괄호를 사용하는 것이 더 낫다는 의견
		 */
		
		
			char grade = 'B';
			
			switch(grade) {
			case 'A' , 'a' -> {
				System.out.println("우수 회원입니다.");
			}
			case 'B' , 'b' -> {
				System.out.println("일반 회원입니다.");
			}
			default -> {
				System.out.println("손님 입니다.");
			}
		}			
			
			
			switch(grade) {
			case 'A' , 'a' -> System.out.println("우수 회원입니다.");
			case 'B' , 'b' -> System.out.println("일반 회원입니다.");
			default -> System.out.println("손님 입니다.");
			
 			}
			

			
	}

}
