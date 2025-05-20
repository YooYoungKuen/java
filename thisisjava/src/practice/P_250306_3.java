package practice;

public class P_250306_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 *  배열 a[100]에 1부터 100까지의 숫자를 순서대로 넣은 다음
		 *  배열의 인덱스가 짝수인 배열에 들어 있는 값만 출력하는 코드
		 */
		
		
		int[] a = new int[100];
		
		for(int i=0; i < a.length; i++) {			
			 	a[i] = i+1;			//a[인덱스] = 인덱스[99]+1 해서 값이 100이 됨
		 	if(a[i] % 2 == 1)		//인덱스번호를 2로 나눠서 나머지가 1이되는 애들만 출력해라. 
			 	System.out.println("a["+i+"] = " +a[i]);
		 }
		
		}
	}

