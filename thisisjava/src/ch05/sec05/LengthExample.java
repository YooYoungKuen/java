package ch05.sec05;

public class LengthExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * 문자열 길이 length
		 * 공백을 포함한 문자의 길이 인덱스 번호는 0번부터이기에 ex) 인덱스 번호 13번까지면 렝스 길이는 14
		 */
		
		String ssn = "9506241230123";
		int length = ssn.length();
		if(length == 13) {
			System.out.println("주민등록번호 자릿수가 맞습니다.");
		} else {
			System.out.println("주민등록번호 자릿수가 틀립니다.");
		}
	}

}
