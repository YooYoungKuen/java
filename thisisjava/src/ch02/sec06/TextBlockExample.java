package ch02.sec06;

public class TextBlockExample {

	public static void main(String[] args) {
		
		String str1 = "" +
		"{\n" +
		"\t\"id\":\"winter\",\n" +  // +는 String안에서 문자열을 연결해준다.
		"\t\"name\":\"눈꽃송이\"\n" +  //  \역슬래쉬는 이스케이프문자
		"}";

		// """ Java13 은 더블쿼테이션 3개로 이스케이프 문자를 생략할 수 있다
		String str2 ="""
		{
			"id":"winter",		
			"name":"눈꽃송이"       
		}
		""";
				
		System.out.println(str1);
		System.out.println("-----------------------------");
		System.out.println(str2);
		System.out.println("-----------------------------");
		
		String str3 = """
		나는 자바를 \
		학습합니다.
		나는 자바 고수가 될 겁니다.
		""";
		// """"에서는 \는 줄바꿈을 하지 않고 이어서 작성하고 싶을 때, JAVA14
		System.out.println(str3);
		
		//""
		
	}
}

		
