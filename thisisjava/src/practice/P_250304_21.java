package practice;

public class P_250304_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * 반지름이 20cm인 피자 2개와 30cm 인 피자 1개의 면적을 비교해서
		 * 어떤 사이즈의 피자를 주문하는 것이 좋은지 알려주세요
		 * 
		 * 원주율 : 3.141592
		 * 삼항 연산자 사용
		 * 실행결과
		 * 20cm 피자 2개의 면적은 2513.2736
		 * 30cm 피자 2개의 면적은 2827.4328
		 * 30cm 피자 1개를 주문 하는 게 더 좋아요~
		 */
		
		double big = 30*30*3.141592;
		double small = 20*20*2*3.141592;
		
		String pizza=(big > small) ? "big피자먹기" : "small피자먹기";
		
		System.out.println(pizza);
		System.out.println("20cm 피자 2개의 면적: " + small);
		System.out.println("30cm 피자 2개의 면적: " + big);
		
		
		
	}

}
