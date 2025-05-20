package ch06.sec08.exam02;

public class Computer {

	//가변길이 매개변수를 갖는 메소드 선언
	int sum(int ... values) {  
		//sum 변수 선언		   
		int sum = 0;
		
		//values 는 배열 타입의 변수처럼 사용
		for (int i=0; i < values.length; i++) {
			sum += values[i];
		}
		
		//합산 결과를 리턴
		return sum;
	}
}

//위에 메소드 선언을	int sum(int[] values) 이와 같이한다면
//ComputerExample 페이지에 12,17라인은 실행 안된다. 22,28라인은 실행된다.
//12,17라인은 배열이 아니기 때문에 컴파일 에러가 나고 22,28라인은 배열이기때문에 실행가능.
