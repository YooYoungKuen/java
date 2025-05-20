package ch02.sec09;

public class OperationPromotionExample {

	public static void main(String[] args) {
		
/*
 * 연산식에서 자동 타입 변환
 * byte,shor,char,는 기본 int형으로 바뀌니까 int형으로 받아라
 * 최대 크기를 가지고 있는 변수타입으로 왼쪽에 선언을 해야한다
 */
		
		byte result1 = 10 + 20 ;
		System.out.println("result1:"+ result1);
		
		byte b1 = 10;
		byte b2 = 20;
		int result2 = b1 + b2;  //변수를 가지고 연산을 할때는 자동 타입 변환을 하는데 
		int result3 = b1 + b2;	//int는 byte보다 큰 단위이므로 컴파일 오류
		int result4 = b1 + 20;  
		int result5 = 30 + b2;
		System.out.println("result2:"+ result2);
		System.out.println("result3:"+ result3);
		System.out.println("result4:"+ result4);
		System.out.println("result5:"+ result5);
		
		short s1 = 10;
		short s2 = 20;
		int result6 = 10 + 20;  //범위 안에 있으므로 컴파일 오류 안남
		int result7 = s1 + s1;  //short , short을 쓰면 int로 바뀌니까 범위가 int보다 작아서 컴파일 안됨
		int result8 = s1 + s2;
		int result9 = s1 + 20;
		int result10 = 30 + s2;
		System.out.println("result6:"+ result6);
		System.out.println("result7:"+ result7);
		System.out.println("result8:"+ result8);
		System.out.println("result9:"+ result9);
		System.out.println("result10:"+ result10);
		
		byte v1 = 10;
		int v2 = 100;
		long v3 = 1000L;
		
//		int result11 = v1 + v2 + v3; //int보다 큰 long을 더했기 때문에 컴파일 오류
		long result12 = v1 + v2 + v3; //최대 크기를 가지고 있는 변수타입으로 왼쪽에 선언을 해야한다
		System.out.println("result12:"+ result12);
		
		int v4 = 10;
		int result13 = v4 /4;
		System.out.println("result13:"+ result13);
		
		int v5 = 10;
//		int result14 = v5 / 4.0; //4.0 자체가 double형이기 때문에 큰 형식으로 받아줘야한다
		double result15 = v5 / 4.0;
		double result16 = (double)v4 / 4;  // 값 2.5 / 더블형으로 형변환했으므로 소수점까지 출력.
		//(double)을 지우면 값이 2.0/ v4(10)도 정수고 4도 정수니까 정수형으로 소수점은 안나온다.
		System.out.println("result15:"+ result15);
		System.out.println("result16:"+ result16);


		

		
		
	}

}
