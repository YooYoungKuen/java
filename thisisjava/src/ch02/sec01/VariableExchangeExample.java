package ch02.sec01;

public class VariableExchangeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int x = 3;
		int y = 5;
		 
			System.out.println("x:" + x + ", y:" + y);

			//변수x 와 변수 y의 값을 바꾸고 싶을때 변수를 하나 더 생성해서 그안에 저장해놓고 값을 옮긴다
			int temp = x;
			x = y;
			y = temp;
			System.out.println("x:"+ x + " , y:" + y);
			//"x" 는 문자열 x , +는 문자열과 숫자를 붙여주는 의미 , x 는 변수값 
			
			int a = 1;
			int b = 2;
			
			System.out.println("a:" + a + ", b: " + b);
			
			int temp1 = a;
			
			 a = b;
			 b = temp1;
		
			System.out.println("a:" + a + ", b: " + b); 
			
			int z = 10;
			int p = 20;
			
	}

}
