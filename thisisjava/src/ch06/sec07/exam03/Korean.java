package ch06.sec07.exam03;

public class Korean {
	// 필드 선언
	String nation = "대한민국";
	String name;
	String ssn;
	
	
	// 생성자 선언
	public Korean(String name, String ssn) {
		this.name = name; 
		this.ssn = ssn;		
		//필드의 이름과 매개변수 이름이 동일할 경우 생성자에서 매개변수와 필드를 구분하기 위하여 필드앞에 this.을 붙여준다.
		//this.(내가 가지고 있는)(객체의 데이터(필드)) name(매개변수)
		//매개변수의 값을 필드에 저장한다.
	}
}

