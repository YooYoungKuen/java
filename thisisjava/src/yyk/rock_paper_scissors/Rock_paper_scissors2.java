package yyk.rock_paper_scissors;

import java.util.Scanner;

public class Rock_paper_scissors2 {

	public static void main(String[] args) {

		int userArr[] = new int[9];
		int comArr[] = new int[9];

		// lose카운터
		int comLose = 0;

		int userLose = 0;

		// 우선승자 변수
		int comAttack = 0;
		int userAttack = 0;

		System.out.println("======가위바위보 게임 시작!======");

//		userArr[i] = userArr1;

		// 컴퓨터가 랜덤으로 1부터 3까지 번호를 돌림

		// 1가위2바위3보

		// 반복문
		for (int i = 0; i < userArr.length; i++) {

			Scanner scanner = new Scanner(System.in);
			String strA = scanner.nextLine();
			int userArr1 = Integer.parseInt(strA);
			int com = (int) (Math.random() * 3 + 1);
			userArr[i] = userArr1;

			System.out.println("<<< " + (i + 1) + " 번째 게임>>>");

			if (com == 1) {
				if (userArr[i] == 3) {
					System.out.println("<유저 : 보!, 컴퓨터 : 가위!> 컴퓨터 승리!");
					comAttack = 1;
				} else if (userArr[i] == 2) {
					System.out.println("<유저 : 주먹!, 컴퓨터 : 가위!> 유저 승리!");
					userAttack = 1;
				} else {
					System.out.println("<유저 : 가위!, 컴퓨터 : 가위!> 무승부!");
					i--;
					continue;
				}
			}

			if (com == 2) {
				if (userArr[i] == 1) {
					System.out.println("<유저 : 가위!, 컴퓨터 : 바위!> 컴퓨터 승리!");
					comAttack = 1;
				} else if (userArr[i] == 3) {
					System.out.println("<유저 : 보!, 컴퓨터 : 바위!> 유저 승리!");
					userAttack = 1;
				} else {
					System.out.println("<유저 : 바위!, 컴퓨터 : 바위!> 무승부!");
					i--;
					continue;
				}
			}

			if (com == 3) {
				if (userArr[i] == 2) {
					System.out.println("<유저 : 바위!, 컴퓨터 : 보!> 컴퓨터 승리!");
					comAttack = 1;
				} else if (userArr[i] == 1) {
					System.out.println("<유저 : 가위!, 컴퓨터 : 보!> 유저 승리!");
					userAttack = 1;
				} else {
					System.out.println("<유저 : 보!, 컴퓨터 : 보!> 무승부!");
					i--;
					continue;
				}
			}

			if (comAttack == 1) {
				System.out.println("<<가위바위보 컴퓨터 승리>>!");
				System.out.println("<<<<<<묵~찌~빠~ 시작!>>>>>");
			} else if (userAttack == 1) {
				System.out.println("<<가위바위보 유저 승리>>!");
				System.out.println("<<<<<<묵~찌~빠~ 시작!>>>>>");
			}

			/** 묵지빠 로직 시작 **/

			String strB = scanner.nextLine();
			int userArr2 = Integer.parseInt(strB);
			int com1 = (int) (Math.random() * 3 + 1);

			if (comAttack == 1) {
				System.out.println("<<<<<<<<<<컴퓨터 공격>>>>>>>>>>");
				comAttack = 0;
				if ((com == 1) == (userArr[i] == 1)) {
					System.out.println("====컴퓨터 : 가위!   유저 : 가위! 컴퓨터 묵찌빠 승리====");
					userLose++;

				} else if ((com == 2) == (userArr[i] == 2)) {
					System.out.println("====컴퓨터 : 바위!   유저 : 바위! 컴퓨터 묵찌빠 승리====");
					userLose++;

				} else if ((com == 3) == (userArr[i] == 3)) {
					System.out.println("====컴퓨터 : 보!   유저 : 보! 컴퓨터 묵찌빠 승리====");
					userLose++;

				} else {
					System.out.println("=====컴퓨터 가위바위보 짐. 유저 공격시작=====");
					continue;
				}
			}

			if (userAttack == 1) {
				System.out.println("<<<<<<<<<<유저 공격>>>>>>>>>>");
				userAttack = 0;
				if ((userArr[i] == 1) == (com == 1)) {
					System.out.println("====유저 : 가위!   컴퓨터 : 가위! 유저 묵찌빠 승리====");
					comLose++;

				} else if ((userArr[i] == 2) == (com == 2)) {
					System.out.println("====유저 : 바위!   컴퓨터 : 바위! 유저 묵찌빠 승리====");
					comLose++;

				} else if ((userArr[i] == 3) == (com == 3)) {
					System.out.println("====유저 : 바위!   컴퓨터 : 바위! 유저 묵찌빠 승리====");
					comLose++;

				} else {
					System.out.println("=====유저 가위바위보 짐. 컴퓨터 공격시작=====");
					continue;
				}
			}

			if (comLose == 3) {
				System.out.println("<<<<<<<<<<user3번이김으로 게임종료>>>>>>>>>>");
				break;

			} else if (userLose == 3) {
				System.out.println("<<<<<<<<<<com3번이김으로 게임종료>>>>>>>>>>");
				break;
			}

		}
	}

}
