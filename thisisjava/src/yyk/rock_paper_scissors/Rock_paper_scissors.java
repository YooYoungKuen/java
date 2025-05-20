package yyk.rock_paper_scissors;

import java.util.Scanner;

public class Rock_paper_scissors {

	public static void main(String[] args) {

		int userArr[] = new int[5];
		int comArr[] = new int[5];

		// lose카운터
		int comLose = 0;
		int userLose = 0;

		// user가 입력할 스캐너 생성
		System.out.println("뭐 낼거야?");


		// 1가위2바위3보

		// 반복문
		for (int i = 0; i < userArr.length; i++) {

			Scanner scanner = new Scanner(System.in);
			String strA = scanner.nextLine();
			int userArr1 = Integer.parseInt(strA);
			int com = (int) (Math.random() * 3 + 1);
			userArr[i] = userArr1;

			if (com == 1) {
				if (userArr[i] == 3) {
					System.out.println(com + "가 가위로 이김");
					comLose++;
				} else if (userArr[i] == 2) {
					System.out.println(com + "가 가위로 짐");
					userLose++;
				} else {
					System.out.println(com + "가 가위로 비김");
					i--;
					continue;
				}
			}

			if (com == 2) {
				if (userArr[i] == 1) {
					System.out.println(com + "가 바위로 이김");
					comLose++;
				} else if (userArr[i] == 3) {
					System.out.println(com + "가 바위로 짐");
					userLose++;
				} else {
					System.out.println(com + "가 바위로 비김");
					i--;
					continue;
				}
			}

			if (com == 3) {
				if (userArr[i] == 2) {
					System.out.println(com + "가 보로 이김");
					comLose++;
				} else if (userArr[i] == 1) {
					System.out.println(com + "가 보로 짐");
					userLose++;
				} else {
					System.out.println(com + "가 보로 비김");
					i--;
					continue;
				}
			}

			if (comLose == 3) {
				System.out.println("user3번이김으로 종료");
				break;

			} else if (userLose == 3) {
				System.out.println("com3번이김으로 종료");
				break;
			}

		}

	}

}
