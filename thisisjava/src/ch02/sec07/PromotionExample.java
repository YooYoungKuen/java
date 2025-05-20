package ch02.sec07;

public class PromotionExample {

	public static void main(String[] args) {

/*
 * 자동 형 변환 예제
 * 작은 타입이 큰 타입으로 대입될때
 */
		
		byte b1 = 10;
		int i1 = b1;
		System.out.println("int value:"+ i1); //b1은 바이트 타입인데 int 데이터 형으로 대입하게 되면
											 //byte 는 int 로 변환하게 된다
		
		char c1 = '가';
		i1 = c1;		// 문자형 '가'가 인트형 i1으로 대입되어 유니코드 가의 유니코드가 출력
		System.out.println("가의 유니코드:"+ i1);
		
		int c2 = 100;
		char c3 = '나';
		c2 = c3;
		System.out.println("나의 유니코드:"+ c2);
	
		
		i1 = 50;
		long l1 = i1;
		System.out.println("l1:"+ l1);  // i1 을 정수형 l1 에 대입 
		
		l1 = 100;
		float f1 = l1; // 형변환은 되는데 소수점 형태로 찍힌다
		System.out.println("f1:"+ f1);
		
		f1 = 100.5f;
		double d1 = f1;	//더블형으로 바뀌고 100.5 값이 출력
		System.out.println("d1:"+ d1);
	}

}
