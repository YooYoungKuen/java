package ch04.sec08;

public class ContinueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * continue 문
		 * 컨티뉴를 만나면 나를 감싸고 있는 반복문으로 돌아가라
		 */
		
		for(int i =1; i<=10; i++) {
			if(i%2 != 0) {				//2로 나눈 나머지가 0이 아닐 경우, 즉 홀수인 경우
				continue; //--↑
			}
			System.out.print(i + " ");		//홀수는 실행되지 않는다
		}
	}

}
