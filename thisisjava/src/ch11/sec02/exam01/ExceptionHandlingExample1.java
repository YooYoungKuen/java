package ch11.sec02.exam01;

public class ExceptionHandlingExample1 {

	public static void printLength(String data) {
		try {
			int result = data.length();
			System.out.println("문자 수:" + result);
		} catch (NullPointerException e) {
			System.out.println("**************************");
			System.out.println(e.getMessage()); // 많이 쓴다
			System.out.println("--------------------------");
			System.out.println(e.toString());
			System.out.println("==========================");
			e.printStackTrace(); // 에러메시지 내용이 길어서 용량이 많이차서 안쓴다
		} finally {
			System.out.println("finally 실행");
		}

	}

	public static void main(String[] args) {
		System.out.println("[프로그램 시작]\n");
//		printLength("ThisIsJava");
		printLength(null);
		System.out.println("[프로그램 종료]");
	}

}
