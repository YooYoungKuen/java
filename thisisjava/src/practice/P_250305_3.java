package practice;

import java.util.Scanner;

public class P_250305_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* a 센치미터가 몇 미터,몇 센치 인지 출력하는 프로그램을 구현해 주세요
		 * 
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		
		
		// cm 값 입력
		System.out.print("원하시는 cm를 입력하세요 : ");
		int a = scanner.nextInt();  //스캐너에서 Int형으로 가져왔는데 자세한 내용은 모르겠습니다.
		int meter = a / 100;  // 입력값의 1/00 을 meter에 대입
		int cm = a % 100;	// 입력값의 100%를 cm에 대입
		
		
		// 출력
		System.out.println(meter + "m," + cm +"cm");
	}

}
