package ch06.sec08.exam02;

public class ComputerExample {

	public static void main(String[] args) {

		//computer 객체 생성
		Computer myCom = new Computer();
		
		//sum() 메소드 호출 시 매개값 1,2,3을 제공하고
		//합산 결과를 리턴받아 result1 변수에 대입
		int result1 = myCom.sum(1,2,3); // 배열이 아니지만 배열처럼 동장을 한다. {1,2,3}
		System.out.println("result1: " + result1);
		
		//sum() 메소드 호출 시 매개값 1,2,3,4,5를 제공하고
		//합산 결과를 리턴받아 result2 변수에 대입
		int result2 = myCom.sum(1,2,3,4,5);	//
		System.out.println("result2: " + result2);
		
		//sum() 메소드 호출 시 배열을 제공하고
		//합산 결과를 리턴받아 result3 변수에 대입
		int[] values = {1,2,3,4,5}; //배열을 만들어서 매개값을 전달해줄 수 있다.
		int result3 = myCom.sum(values); //배열을 미리 생성해서 참조변수를 대입하는 것은 얼마든지 가능하다.
		System.out.println("result3: " + result3);
		
		//sum() 메소드 호출 시 배열을 제공하고
		//합산 결과를 리턴받아 result4 변수에 대입
		int result4 = myCom.sum(new int[] {1,2,3,4,5}); //직접 배열변수를 만들어서 매개값으로 제공해줄 수 있다
		System.out.println("result4: " + result4);	//new int[]
		//이미 변수가 허용 되있을 경우 int [] values;
		//  					values = {1,2,3}; 이건 안된다
		//					   int [] values;
		//						values = new int[]{1,2,3};  이건 된다.
		//					이와같이 배열을 생성해서 값을 제공해야한다.
	
	
	
	
	
	
	}

}
