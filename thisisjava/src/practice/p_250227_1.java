/**
 * author: YooYoungKeun

 * Date: 2025-02-27
 
 * Desc: 250227 Practice
 */

package practice;

public class p_250227_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String st1 = "Hello"; 
	String st2 = "World";
	System.out.println(st1); //예상출력 Hello  (출력확인 Hello)
	
//	System.out.println(st1 + "world); //예상출력 컴파일 오류
	System.out.println(st1 + st2); //예상출력 HelloWorld  (출력확인 HelloWorld)
	
	st1 = "new word";
	String str3 = st1 + st2;
	
	System.out.println(str3); //예상출력 new wordWorld  (출력확인 new wordWorld)
	
	}

}
