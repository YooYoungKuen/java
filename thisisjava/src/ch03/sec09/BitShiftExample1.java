package ch03.sec09;

public class BitShiftExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 비트 이동 연산자 예제 1
		 */
		
		
		int num1 = 1;
		int result1 = num1 <<3;
		int result2 = num1 * (int) Math.pow(2, 3); //Math.pow(2,3)은 2의3승을 연산하고, double 값을 산출한다.
		System.out.println("result1:" + result1);	//int값으로 얻고 싶다면 (int)로 캐스팅해야 한다.
		System.out.println("result2:" + result2);
		
		int num2 = -8;
		int result3 = num2 >>3;
		int result4 = num2 / (int) Math.pow(2, 3);
		System.out.println("result3:" + result3);
		System.out.println("result4:" + result4);
		
	}

}
