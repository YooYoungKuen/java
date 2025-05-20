package ch06.sec07.exam02;

public class Korean {
	
	
	//필드 선언
	String nation = "대한민국";
	String name;
	String ssn;
	
	
	//생성자 선언  
	//생성자의 매개변수 이름은 가능하면 매개변수를 통해서 저장되는 필드이름과 동일하게 해준다
	public Korean (String n,  String s) {
		name = n;	
		ssn = s;
	}
}
