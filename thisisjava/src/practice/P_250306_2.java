package practice;

public class P_250306_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		/*
		 * 배열 a[10]에 3의 배수를 넣은 다음에 배열의 내용을 출력하는 순서도와 코드 구현
		 */
		
		
		int[] a = new int[10];
		
//		a[0] = 3;
//		a[1] = 6;
//		a[2] = 9;
//		a[3] = 12;
//		a[4] = 15;
//		a[5] = 18;
//		a[6] = 21;
//		a[7] = 24;
//		a[8] = 27;
//		a[9] = 30;
		
		for(int i=0; i < a.length; i++) {
			
			if(a[i] % 3 == 0)
			System.out.println("a["+i+"]:" +a[i]);
			
		}
	}

}
