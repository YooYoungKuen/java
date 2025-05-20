package practice;

import java.util.Scanner;

public class P_250305_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요>>>" );
		
		String strInput = scanner.nextLine();
		int input = Integer.parseInt(strInput);
		
		System.out.println("입력받은 값은: " + input );
		
		//절대값으로 바꾸기

		if(input < 0) {
			input = input * -1;			// -1을 곱하면 양수가 된다
		}
		System.out.println("절대값은: " + input );
	}

}
