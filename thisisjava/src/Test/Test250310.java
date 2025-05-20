package Test;

import java.util.Scanner;

public class Test250310 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		int comArr[] =  new int[3];
		int userArr[] = new int[3];
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("1번타자 숫자를 입력하세요:");


		
		
		
	
		for (int i = 0; i < userArr.length; i++) {
			
			int comArr1 = (int)(Math.random()*10) + 1;
			
			String strA = scanner.nextLine();
			int userArr1 = Integer.parseInt(strA);
			userArr[i] = userArr1;
			
			
			for(int j = 0; j < userArr.length; j++) {
				
				if (comArr==userArr) {
					System.out.println("안타입니다.");
					continue;
				}else {
					System.out.println("아웃입니다.");
					break;
				}				
			}
		}
					System.out.println("3아웃 타자 체인지");
					System.out.println("2번타자 숫자를 입력하세요:");
				
					
		for (int i = 0; i < userArr.length; i++) {
			
			int comArr1 = (int)(Math.random()*10) + 1;
						
			String strA = scanner.nextLine();
			int userArr1 = Integer.parseInt(strA);
			userArr[i] = userArr1;
			
			for(int j = 0; j < userArr[i]; j++) {
				
				if (comArr==userArr) {
					System.out.println("안타입니다.");
					continue;
				}else {
					System.out.println("아웃입니다.");
					break;
				}				
			}
		}
					System.out.println("3아웃 타자 체인지");
					System.out.println("3번타자 숫자를 입력하세요:");
					
					
		for (int i = 0; i < userArr.length; i++) {
			
			int comArr1 = (int)(Math.random()*10) + 1;
			
			String strA = scanner.nextLine();
			int userArr1 = Integer.parseInt(strA);
			userArr[i] = userArr1;
			
			for(int j = 0; j < userArr[i]; j++) {
				
				if (comArr==userArr) {
					System.out.println("안타입니다.");
					continue;
				}else {
					System.out.println("아웃입니다.");
					break;
				}				
			}
		}
					System.out.println("3이닝 종료 Game Over");
	}
					
}
