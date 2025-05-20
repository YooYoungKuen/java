package ch05.sec05;

public class SubStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * 문자열 잘라내기 Substring
		 * 특정 위치의 문자열을 잘라내어 가져오고 싶을때 사용
		 */
		
		String ssn = "880815-1234567";
		
		String firstNum = ssn.substring(0,6);  //0번 인덱스부터 5번인덱스까지 가져온다
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7); //7번 인덱스부터 끝까지 가져온다
		System.out.println(secondNum);
	}

}
