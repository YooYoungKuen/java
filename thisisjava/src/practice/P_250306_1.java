package practice;

public class P_250306_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 배열 a에 1,2,3 을 넣은 후 배열 내의 모든 값에 2를 더한 값인 3,4,5로 변경한 다음에 
		// 배열의 내용을 화면에 출력하는 순서도와 코드를 구현
		
		int[] a = {1,2,3};
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		for(int i=0; i < a.length; i++) {
			System.out.println("a["+i+"]:" + a[i] );
		}
		
		int[] a1 = new int[3];
		a1[0] = 3;
		a1[1] = 4;
		a1[2] = 5;
		for(int i=0; i < a1.length; i++) {
			System.out.println("a1["+i+"]:" +a1[i]) ;
		}
		
	}

}
