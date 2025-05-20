package ch06.sec07.exam03;

public class KoreanExample {

	public static void main(String[] args) {

		//Korean 객체 생성
		Korean k1 = new Korean("박자바","870915-1234567");
		//Korean 객체 읽기
		System.out.println("Korean nation: " + k1.nation);
		System.out.println("Korean name: " + k1.name);
		System.out.println("Korean ssn: " + k1.ssn);
		
		//또 다른 Korean 객체 생성
		Korean k2 = new Korean("둘리", "901222-2134567");
		//또 다른 Korean 객체 읽기
		System.out.println("Korean nation : " + k2.nation);
		System.out.println("Korean name " + k2.name);
		System.out.println("korean ssn: " + k2.ssn);
	}

}
