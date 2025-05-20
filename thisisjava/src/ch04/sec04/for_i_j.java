package ch04.sec04;

public class for_i_j {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//초기화식,증감식이 둘이상 있을시 ,로 구분
		//i는 0부터 50까지 1씩 증가하면서 반복
		//j는 100부터 50까지 1씩 감소하면서 반복
		for(int i=0,j=100; i<=50 && j>=50; i++,j--) {
			System.out.println("최종 i값: "+ i );
			System.out.println("최종 j값: "+ j );
		}
	}

}
