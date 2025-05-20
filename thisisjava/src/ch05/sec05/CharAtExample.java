package ch05.sec05;

public class CharAtExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/* CharAt
		 * 문자 추출
		 * 문자열 하나의 값을 리턴(출력?)하고 싶을때 사용
		 */
		
		String ssn = "9506241230123";
		char sex = ssn.charAt(6);
		switch (sex) {
		case '1' :
		case '3' :
			System.out.println("남자입니다.");
			break;
		case '2' : 
		case '4' :
			System.out.println("여자입니다.");
			break;
		}
	}

}
