
/**
 * author: YooYoungKeun
 * Date: 2025-02-28
 */

package ch02.sec09;

public class StringConcatExample {

	public static void main(String[] args) {

		//숫자에 ""를 넣어서 문자로 변환
		
		//숫자 연산
		int result1 = 10 + 2 + 8;
		System.out.println("result1 :" + result1);
		
		//결합 연산
		String result2 = 10 + 2 + "8";
		System.out.println("result2 :" + result2); //숫자를 먼저 계산하고 문자열을 만나서 128
		
		String result3 = 10 + "2" + 8;
		System.out.println("result3 :" + result3); //숫자가 문자열을 만나서 10과2를 더한것이아니라 문자를 붙임
	
		String result4 = "10" + 2 + 8;	
		System.out.println("result4 :" + result4);
		
		String result5 = "10" + ( 2 + 8 ); //괄호안에 숫자를 먼저 계산 후 문자열과 붙임
		System.out.println("result5 :" + result5);
	}
	
	
}
