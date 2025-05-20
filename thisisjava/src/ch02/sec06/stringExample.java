package ch02.sec06;

public class stringExample {

	public static void main(String[] args) {
/*
 * String 타입 예제
 * 작은따옴표(')로 감싼 한 개의 문자는 char 타입. 큰따옴표(")로 감싼 여러 개 문자들은 유니코드로 변환x
 */
		
		String name = "홍길동";
		String job = "프로그래머";
		
	
		System.out.println(name);
		System.out.println(job);
		
		String str = "나는 \"자바\'를 배웁니다.";  //역슬래쉬 \를 사용하면 "문자열안에 ""or '' 사용가능
		System.out.println(str);
		
		str = "번호\t이름\t직업 ";   //탭키 만큼 문자사이를 띄움
		System.out.println(str);
		
		System.out.print("나는\n");
		System.out.print("자바를\n");  // \n 은 개행의 역할
		System.out.print("배웁니다.		");
		
		System.out.println("나는");
		System.out.println("자바를");
		System.out.println("배웁니다");
	}

}
