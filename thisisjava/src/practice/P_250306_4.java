package practice;

public class P_250306_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * 배열 a[]={12,1,5,3,6,8,5,3}를 만든 다음에 
		 * 배열의 모든 내용을 더한 값을 sum에 저장하여 출력하는 코드
		 */
		
		
		int[] a = {12,1,5,3,6,8,5,3};
		int sum = 0;
		
		for(int i=0; i < a.length; i++) {
			sum += i;
		}
		System.out.println("총합은 :" +sum);
		
	}

}
