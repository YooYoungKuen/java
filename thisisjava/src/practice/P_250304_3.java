package practice;

public class P_250304_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 사각형 박스 안에 있는 내용을 그대로 출력해주세요
		 */
		
	for (int i = 1; i < 6; i++) {
		for (int j = 1; j < 6; j++ ) {
			System.out.print('*');
		}
		System.out.println();
	}
	
	System.out.println("============================");
	
	for (int i = 1; i < 6; i++) {
		for (int j = 0; j < i; j++) {
			System.out.print("*");
		}	
			System.out.println();
	}
	
	System.out.println("============================");

	for (int i = 1 ; i < 6; i++) {
		for (int j = 5; j > i; j--) {
			System.out.print(" ");
		}
		for (int j = 0; j < i; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	}

}
