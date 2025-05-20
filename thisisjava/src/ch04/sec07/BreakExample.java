package ch04.sec07;

public class BreakExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		/*
		 * break 문
		 * fo문, while문, do-while문을 실행중지하거나 조건문인 switch문을 종료할 때 사용
		 * break를 만나면 나를 감싸고 있는 실행문(중괄호)을 나간다. 
		 */
		
		while(true) {
			int num = (int)(Math.random()*6) + 1;
			System.out.println(num);
			if(num == 6) {
				break; //-------↓
			}
		}
		System.out.println("프로그램 종료");
		
	}

}
