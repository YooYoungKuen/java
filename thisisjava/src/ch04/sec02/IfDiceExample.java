package ch04.sec02;

public class IfDiceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * if dice 예제
		 * 
		 * 임의의 정수를 뽑기 위해 Math.random() 을 활용
		 */
		
		
		int num = (int)(Math.random()*6) + 1; // 숫자 1은 주사위 번호 하나 뽑기
		
		if(num==1) {
			System.out.println("1번이 나왔습니다.");
		} else if(num==2) {
			System.out.println("2번이 나왔습니다.");
		} else if(num==3 ) {
			System.out.println("3번이 나왔습니다.");
		} else if(num==4) {
			System.out.println("4번이 나왔습니다.");
		} else if(num==5) {
			System.out.println("5번이 나왔습니다.");
		} else {
			System.out.println("6번이 나왔습니다.");
		}
				
	}

}
