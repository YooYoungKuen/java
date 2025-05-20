package ch05.sec05;

public class IndexOfContainsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 문자열 찾기  indexOf
		 * 특정 문자열의 위치를 찾고자 할때
		 * 해당 문자열이 시작되는 인덱스를 찾는다 (해당 문자열이 첫번째 등장)
		 * 찾고자 하는 문자열이 포함되지 않으면 -1을 출력
		 * 
		 * 포함되어있는지 확인만 하고 싶을때는 contains 사용
		 * 포함되어 있으면 true 포함되어 있지않으면 false
		 */
		
		String subject = "자바 프로그래밍";		//문자열 subject 변수에 "자바 프로그래밍" 저장
		
		int location = subject.indexOf("프로그래밍");//변수 subject에서 "프로그래밍"의 위치를 찾음.
												//해당 문자열이 없으면 -1값 출력
													//찾은 "프로그래밍"만 location에 저장
		
		System.out.println(location);   //해당 문자열은 3번째 인덱스이므로 3이 출력	
		String substring = subject.substring(location); //location에 저장한 값을 잘라내어 substring에 저장.
		System.out.println(substring);
		
		location = subject.indexOf("자바");
		if(location != -1) {
			System.out.println("자바와 관련된 책이군요");			
		} else {
			System.out.println("자바와 관련 없는 책이군요");
		}
		
		boolean result = subject.contains("자바");
		if(result) {
			System.out.println("자바와 관련된 책이군요");
		} else {
			System.out.println("자바와 관련 없는 책이군요");
		}

	}

}
