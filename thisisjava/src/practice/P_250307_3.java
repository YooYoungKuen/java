package practice;

import java.util.Scanner;

public class P_250307_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * 가위(0),바위(1),보(2)를 사용자로부터 입력받고
		 * 컴퓨터가 0,1,2 값을 하나 추출해서 서로
		 * 가위바위보를 비교해서 각자 가위바위보 중에
		 * 어떤 것을 냈고 누가 이겼는지를 알려주는 프로그램 구현해 주세요
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("뭐 낼꺼야?(0가위,1바위,2보)");
		String strA = scanner.nextLine();
		int i = Integer.parseInt(strA);
		
		
		int com = (int)(Math.random()*3);
		
		
		
//		while (i <= 3 ) {
			if(i == 0) {
				if(com == 2) {
					System.out.println("내가 가위를 내서 이김.컴퓨터가 보를 내서 짐");
//					break;
				} else if (com == 1) {
					System.out.println("내가 가위를 내서 짐.컴퓨터가 바위를 내서 이김");
//					break;
				} else if (com == 0) {
					System.out.println("내가 가위를 내서 비김");
//					break;
				}
			}
			if(i == 1) {
				if(com == 0) {
					System.out.println("내가 바위를 내서 이김.컴퓨터가 가위를 내서 짐");
//					break;
				} else if (com == 2) {
					System.out.println("내가 바위를 내서 짐.컴퓨터가 보를 내서 이김");
//					break;
				} else if (com == 1) {
					System.out.println("내가 바위를 내서 비김");
//					break;
				}
			}
			if(i == 2) {
				if(com == 1) {
					System.out.println("내가 보를 내서 이김.컴퓨터가 바위를 내서 짐");
//					break;
				} else if (com == 0) {
					System.out.println("내가 보를 내서 짐.컴퓨터가 가위를 내서 이김");
//					break;
				} else if (com == 2) {
					System.out.println("내가 보를 내서 비김");
//					break;
					
				}
			}
			
//		}
		
		
	}

}
