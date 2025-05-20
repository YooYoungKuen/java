package Test;

public class method11111 {

	/*
	 * 결과: HELLO 두번째 단락부터 읽습니다 public static void main(String[] args) { 여기부터 읽고
	 * sysout print 하라는데 getUpper("hello")를 프린트 하래요 그러면 그 메소드를 찾아가야 하니까 첫 단락에 public
	 * static String getUpper(String str) { 여기로 올라갑니다 getUpper("hello") 라고 햌ㅅ으니싸
	 * str에 hello가 대입이 됩니다 그다음 return.str.어쩌구문인데 str이 hello라고 했으니까
	 * hello.toUpperCase() 인데 toUpperCase는 사실 저희가 만들어준 메서드는 아니구요 자바에 내장된 함수같은 메서드라서
	 * 대문자로 변환한다는거에요 hello.대문자변환메서드 가 되니까 HELLO 인데 앞에 return이 있잖아요 return은 자신을 호출한
	 * 곳으로 값을 되돌려줍니다 getUpper을 호출했던 맨처음 문장 두번째 단락의 getUpper("hello")에 HELLO를 반환해서
	 * system.out.println(HELLO) 가 됩니다 그래서 답이 HELLO입니다
	 */

	/*
	 * public static void main(String[] args) 메인 메서드에서 getUpper 메서드를 호출 호출받은
	 * getUpper는 getUpper에 toUppercase (대문자로변환)해서 return return은 호출한 main 메서드 에서
	 * 대문자로 변환한 hello 즉 HELLO 출력
	 * 
	 */

	public static String getUpper(String str) {
		return str.toUpperCase(); // 온점(.)을 사용해 toUpperCase() 호출 후 결과 반환
	}

	public static void main(String[] args) {
		System.out.println(getUpper("hello")); // 메서드 호출 후 결과 출력
	}
}
