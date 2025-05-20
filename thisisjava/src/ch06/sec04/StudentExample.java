package ch06.sec04;

public class StudentExample {

	public static void main(String[] args) {

		//클래스로 만든 객체의 번지수가 변수에 저장된다
		//new 는 객체를 만드는 연산자
		//new는 메모리에 객체를 생성하고 객체의 번지를 리턴(결과값을 돌려준다)한다
		//변수안에 그 번지를 저장해서 앞으로 변수를 통해서 객체를 사용할 수 있게함
		
		Student s1 = new Student();  //Student 클래스로부터 새로운 객체(s1)가 만들어짐
		//Student 타입의 객체를 하나 생성한다. new Student();
		//Student 라는 클래스를 가지고 객체를 만들겠다는 의미
		//그 객체의 번지를 리턴해주면 s1에 저장하겠다는 의미
		System.out.println("s1 변수가 Student 객체를 참조합니다.");
		
		//변수가 s1과 s2 두개가 선언됬으니 스택영역에 s1과 s2가 생성되고
		//new Student() 두개가 사용됬기에 두개의 객체가 만들어진다.
		//각각의 객체 번지를 s1과 s2가 가지고 있다.
		
		Student s2 = new Student ();
		System.out.println("s2 변수가 new로 생성한 또 다른 Student 객체를 찹조합니다.");
	}

}
