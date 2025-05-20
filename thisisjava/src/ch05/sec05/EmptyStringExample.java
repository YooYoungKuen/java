package ch05.sec05;

public class EmptyStringExample {

	public static void main(String[] args) {

		/*
		 * 문자열 타입 equals 메소드 사용
		 * 
		 * == 는 주소값을 비교하므로 객체 값이 같아도 false .equals 는 변수안에 객체 값 자체를 비교하고 싶을 때 사용
		 */

		String hobby = "";
		if (hobby.equals("")) {
			System.out.println("hobby 변수가 참조하는 String 객체는 빈 문자열");
		}

	}

}
