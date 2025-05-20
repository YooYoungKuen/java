package ch02.sec04;

public class FloatDoubleExample {

	public static void main(String[] args) {
//	실수타입 (소수점) 예제
		
		/*
		 * 정밀도 : float 소수점 7자리, double 소수점 15자리
		 * float은 F or f 를 붙여준다
		 */
	float var1 = 0.1234567890123456789f; //0.12345678로 나와야하지만 반올림해서 근사값으로 0.12345679로 출력
	double var2 = 0.1234567890123456789;	// 근사값으로 17자리까지 나옴
		
		System.out.println("var1:"+var1);
		System.out.println("var2:"+var2);
		
	double var3 = 3e6; //양수로 공이 여섯개 있는 자리
	float var4 = 3e6f;
	double var5 = 2e-3; //지수 .소수점으로 뒤에 공이 3개가 있는 자리
	
		System.out.println("var3:"+var3);
		System.out.println("var4:"+var4);
		System.out.println("var5:"+var5);
	}

}
