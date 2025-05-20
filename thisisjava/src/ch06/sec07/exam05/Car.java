package ch06.sec07.exam05;

public class Car {
	// 필드 선언
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자 생성
	//생성자 내부에서 다른 생성자를 호출할 경우 this 키워드가 가리키는 생성자가 가장 먼저 사용되어야 한다
	//this 다음에는 다른코드 사용가능하다
	//sysout을 this 키워드 위로 하면 this 키워드에 빨간줄 에러가 뜬다
	Car(String model) {		//1.생성자
		this(model,"은색",250);   
		System.out.println("1");
		//27라인 생성자 호출
	}
	
	
	Car(String model,String color) {		//2.생성자
		this(model,color,250);
		System.out.println("2");
		//27라인 생성자 호출
	}
	
	Car(String model,String color, int maxSpeed) {		//3.생성자
		System.out.println("3");
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		// 1.생성자에서 3.생성자를 호출해서 실행하면 3.생성자를 호출해서 실행 후 다시 1.생성자로 돌아간다
		// 그래서 3.생성자의 sysout(3)이 출력되고 난 후 1.생성자의 sysout(1)이 출력된다.
	}
	
}
