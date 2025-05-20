package ch05.sec05;

public class EqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문자열을 비교할때는 equals 를 써라

		String strVar1 = "홍길동";
		String strVar2 = "홍길동";

		if (strVar1 == strVar2) { // 번지비교
			System.out.println("strVar1과 strVar2는 참조가 같음");
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}

		if (strVar1.equals(strVar2)) { // 문자열 비교
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		}

		String strVar3 = new String("홍길동"); // new로 객체 생성
		String strVar4 = new String("홍길동");

		if (strVar3 == strVar4) { // 번지비교
			System.out.println("strVar3과 strVar4는 참조가 같음");
		} else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}

		if (strVar1.equals(strVar2)) { // 문자열 비교
			System.out.println("strVar3과 strVar4는 문자열이 같음");

			String hobby = "";
			if (hobby.equals("")) {
				System.out.println("hobby 변수가 참조는 string 객체는 빈문자열");
			}

		}
	}

}
