package practice;

import java.util.Scanner;

public class P_250305_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scanner = new Scanner(System.in);
		// 숫자 입력 받기
		// nextLine() : 입력 받은 값은 문자열
		String strInput = scanner.nextLine();
		int input = Integer.parseInt(strInput);
				
		int a =11;
		int b =14;
		
		System.out.println("변경 전 a:"+a+":b:"+b);
		
		if (input == 0) {
			a = 5;
		} else {
			b = a + 3;
		}
		System.out.println("변경 후 a:"+a+":b:"+b);
		
		
		
		
		
	}

}
