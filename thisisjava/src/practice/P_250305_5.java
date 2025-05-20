package practice;

import java.util.Scanner;

public class P_250305_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 잔디 가격이 1제곱미터에 a원 일 때
		 * 윗변이 b, 아래변이 c, 높이 d인 사다리꼴에 잔디를 심으려면
		 * 얼마의 비용이 드는지 구하는 순서도를 작성하시오
		 * 
		 * 사다리꼴의 넓이 = (윗변 + 아랫변 길이) x 높이 / 2
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1제곱미터의 잔디값: ");
		String strD = scanner.nextLine();
		int d = Integer.parseInt(strD);
		
		
		System.out.print("윗변을 입력하세요: ");
		String strA = scanner.nextLine();
		int a = Integer.parseInt(strA);
		
		System.out.print("아랫변을 입력하세요: ");
		String strB = scanner.nextLine();
		int b = Integer.parseInt(strB);
		
		System.out.print("높이를 입력하세요: ");
		String strC = scanner.nextLine();
		int c = Integer.parseInt(strC);
		
		int result = ((a+b) * c /2) * d ;
		
		System.out.println("사다리꼴의 잔디값은 : " + result + "원 입니다.");
		
		
		
		
	}

}
