package ch02.sec13;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {

		/*
		 * 키보드 입력 데이터를 변수에 저장
		 */
		//스캐너에 빨간줄이 처질경우 마우스를 갖다대면 라이브러리에서 가져올 수 있는 항목이 나온다

		
		Scanner scanner = new Scanner(System.in); //자바 유틸에 라이브러리에 있는 스캐너 함수를 가져와서 사용
//		
//		System.out.print("x 값 입력해 주세요>>>"); //print니까 개행을 안함
//		String strX = scanner.nextLine(); //스캐너 넥스트라인을 실행하면 키보드로 입력된 내용을 문자열로 읽고 좌측
//		int x = Integer.parseInt(strX);		//String 변수에 저장할 수 있다.
//		System.out.println();
//		
//		
//		System.out.print("y 값 입력해 주세요>>>"); //실행하면 콘솔에 데이터를 입력할 수 있고
//		String strY = scanner.nextLine();		//값을 입력하면 순차적으로 실행한다
//		int y = Integer.parseInt(strY);
//		
//		int result = x + y;
//		System.out.println("x + y = "+result);
		
		while(true) {
			System.out.print("입력하세요>>>");
			String data = scanner.nextLine();
			if (data.equals("q")) {
				break;
			}
			System.out.println("입력받은 문자열:" + data);
			System.out.println();
		}
//		
	}

}
