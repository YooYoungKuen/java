package ch02.sec08;

public class CastingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 강제 변환 casting 예제
 * 큰 타이입이 작은 타입으로 대입될 때
 *   (작은단위) 큰단위앞에 
 */
		
		int var1 = 10;
		byte var2 = (byte) var1;
		System.out.println("var2:"+ var2); //int타입은 byte타입보다 큰 허용 범위를 가지므로 자동변환되지않고 
											//(byte)캐스팅을 해서 byte타입으로 강제 변환시킨다
		
		long var3 = 300;
		int var4 = (int) var3;
		System.out.println("var4:"+ var4);
		
		int var5 = 65;
		char var6 = (char) var5;		//char 는 2byte 
		System.out.println("var6:"+ var6);  //65는 유니코드 숫자로 'A'이므로 'A'가 출력
		
		double var7 = 3.14;
		int var8 = (int) var7;		//int형으로 강제 변환하면서 소수점은 버린다
		System.out.println("var8:"+ var8);
	}

}
