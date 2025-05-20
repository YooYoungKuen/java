package practice;

public class P_250304_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * 예상결과를 주석으로 기재한 후 실행 해 보세요
		 */
		
		System.out.println(100);
		//예상결과 100 , 결과 ==> 100
		System.out.println("=====================");
		System.out.println(20+30);
		//예상결과 50 , 결과 ==> 50
		System.out.println("=====================");
		System.out.println("20+30");
		//예상결과 2030 , 결과 ==> 20+30  문자열안에 +도 표현됨
		System.out.println("=====================");
		
		/*아래와 같이 출력이 나오도록 코딩해 주세요
		 * 15.4
		 */		
		System.out.println(15.4d);
		System.out.println("=====================");

		/*
		 * 예상결과를 주석으로 기재한 후 실행 해 보세요
		 */
		
		System.out.println("10"+10+20);
		//예상결과 1030 , 결과 ==>  101020
		//앞에서부터 숫자가오면 계산 먼저 후 문자열을 합치고 앞에서부터 문자열이 나오면 나머지도 문자열로 변환된다
		System.out.println("=====================");
		System.out.println(10+10+ "20");
		//예상결과 2020 , 결과 ==>2020
		System.out.println("=====================");
		System.out.println(2+6*(4*2));
		//예상결과 (4*2)*6+2    50 , 결과 ==> 50
		System.out.println("=====================");
		System.out.println("2*(4+3+2)+(4+1*2)");
		//예상결과 2*(4+3+2)(4+1*2) ==> 결과 2*(4+3+2)+(4+1*2) . 문자열안에 +도 표현됨
		System.out.println("=====================");
		System.out.println("(5+3)");
		//예상결과 (5+3) , 결과 ==> (5+3)
		System.out.println("=====================");
		System.out.println("7+3="+7+3);
		//예상결과 7+3=10 , 결과 ==> 7+3=73 . 
		//앞에서부터 숫자가오면 계산 먼저 후 문자열을 합치고 앞에서부터 문자열이 나오면 나머지도 문자열로 변환된다
		
		System.out.println("=====================");
		
		//문장을 기술해서 예상 결과를 주석으로 기재한 후 실행

		byte a1=10;
		byte a2;
		a2=11;
		
		System.out.println(a1);
		//예상결과 10 , 결과 10
		System.out.println("=====================");
		System.out.println(a2);
		//예상결과 11 , 결과 11
		System.out.println("=====================");
		System.out.println(a1+a2);
		//예상결과 21 , 결과 21
		System.out.println("=====================");
		System.out.println(a1+1);
		//예상결과 11 , 결과 11
		
		System.out.println("=====================");
		
		short b1=10;
		short b2;
		b2=11;
		
		System.out.println(b1);
		//예상결과 10 , 결과 10
		System.out.println("=====================");
		System.out.println(b2);
		//예상결과 11 , 결과 11
		System.out.println("=====================");
		System.out.println(b1+b2);
		//예상결과 21 , 결과 21
		System.out.println("=====================");
		System.out.println(b1+1);
		//예상결과 11 , 결과 11
		
		System.out.println("=====================");
		
		int c1=10;
		int c2;
		c2=11;
		
		System.out.println(c1);
		//예상결과 10 , 결과 10
		System.out.println("=====================");
		System.out.println(c2);
		//예상결과 11 , 결과 11
		System.out.println("=====================");
		System.out.println(c1+c2);
		//예상결과 21 , 결과 21
		System.out.println("=====================");
		System.out.println(c1+1);
		//예상결과 11 , 결과 11
		
		System.out.println("=====================");
		
		long d1=10L;
		long d2;
		d2=11l;
		
		System.out.println(d1);
		//예상결과 10 , 결과 10
		System.out.println("=====================");
		System.out.println(d2);
		//예상결과 11 , 결과 11
		System.out.println("=====================");
		System.out.println(d1+d2);
		//예상결과 21 , 결과 21
		System.out.println("=====================");
		System.out.println(d1+1);
		//예상결과 11 , 결과 11
		
		System.out.println("=====================");
		
		float e1=10.23f;
		float e2;
		e2=11.f;
		
		System.out.println(e1);
		//예상결과 10.23 , 결과 ==> 10.23 
		System.out.println("=====================");
		System.out.println(e2);
		//예상결과 11.0 , 결과 ==> 11.0
		System.out.println("=====================");
		System.out.println(e1+e2);
		//예상결과 21.23 , 결과 ==> 21.23
		System.out.println("=====================");
		System.out.println(e1+1.4f);
		//예상결과 11.63 , 결과 ==> 11.629999 소수점 7자리까지 근사값으로 출력
		
		System.out.println("=====================");
		
		double f1=10.23;
		double f2;
		f2=11.94;
		
		System.out.println(f1);
		//예상결과 10.23 , 결과 ==> 10.23
		System.out.println("=====================");
		System.out.println(f2);
		//예상결과 11.94 , 결과 ==> 11.94
		System.out.println("=====================");
		System.out.println(f1+f2);
		//예상결과 22.17 , 결과 ==> 22.17
		System.out.println("=====================");
		System.out.println(f1+10.4);
		//예상결과 20.63 , 결과 ==> 20.630000000000003 소수점 15자리까지 근사값으로 출력
		
		System.out.println("=====================");
		
		String st1="Hello";
		String st2="World";
		
		System.out.println(st1);
		//예상결과 Hello , 결과 ==> Hello
//		System.out.println(st1+"World);
		//예상결과 오류 떠블쿼테이션이 하나 있으므로 오류
		System.out.println("=====================");
		System.out.println(st1+st2);
		//예상결과 HelloWorld , 결과 ==> HelloWorld
		System.out.println("=====================");
		
		st1= "new Word";
		String str3=st1+st2;
		System.out.println(str3);
		//예상결과 new WordWorld , 결과 ==> new WordWorld
	
		//
	
	}
	
	

}
