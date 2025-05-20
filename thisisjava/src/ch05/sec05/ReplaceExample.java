package ch05.sec05;

public class ReplaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * 문자열 대체  Replace
		 * 특정 문자열을 다른 문자열로 대체하고 싶을때 사용
		 * 해당문자를 찾아서 한꺼번에 다 바꾼다 
		 *
		 */
		
		String oldStr = "자바 문자열은 불변입니다. 자바 문자열은 String입니다.";
		String newStr = oldStr.replace("자바", "JAVA");
		
		
		System.out.println(oldStr);
		System.out.println(newStr);
	}

}
