package practice;

import java.util.Scanner;

public class P_250307_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * 3개의 수를 입력받아 가장 작은 수를 0번째 인덱스, 그다음 작은 수를 1번째 인덱스,
		 * 나머지 수를 2번째 인덱스에 넣어주시고, 그 배열을 출력 해 주세요
		 */
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 수를 입력하세요: ");
		String strA = scanner.nextLine();
		int a = Integer.parseInt(strA);
		
		System.out.print("두번째 수를 입력하세요: ");
		String strB = scanner.nextLine();
		int b = Integer.parseInt(strB);
		
		System.out.print("세번째 수를 입력하세요: ");
		String strC = scanner.nextLine();
		int c = Integer.parseInt(strC);
		
						

		int[] number = new int[3];
		
		
		if (a <= b && a <=c) {
			number[0] = a;
			if (b <= c) {
				number[1] = b;
				number[2] = c;
				System.out.println("number[0]:"+a+",[number[1]:"+b+",[number[2]:"+c);
			}else {
				number[2] = b;
				number[1] = c;
				System.out.println("number[0]:"+a+",[number[1]:"+c+",[number[2]:"+b);
			}
		}
		
		
		else if (b <= a && b<=c) {
			number[1] = b;
			if (a <= c) {
				number[0] = a;
				number[2] = c;
				System.out.println("number[0]:"+b+",[number[1]:"+a+",[number[2]:"+c);
			}else {
				number[2] = a;
				number[0] = c;
				System.out.println("number[0]:"+b+",[number[1]:"+c+",[number[2]:"+a);
			}
		}else {
			number[2] = c;
			if (a <= b) {
				System.out.println("number[0]:"+c+",[number[1]:"+a+",[number[2]:"+b);
			}else {
			}
			
			System.out.println("number[0]:"+c+",[number[1]:"+b+",[number[2]:"+a);

		}

	}
	
}


