package ch04.sec07;

public class BreakOutterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * break는 가장 가까운 반복문만 종료하고 바깥쪽 반복문은 종료시키지 않는다. 
		 * 중첩된 반복문까지 종료시키는 label 종료 바깥쪽 반복문에
		 * 이름(레이블)을 붙이고, 'break 이름;' 을 사용하여 종료
		 */

		Outter: for (char upper = 'A'; upper <= 'Z'; upper++) {
			for (char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + "-" + lower);
				if (lower == 'g') {
					break Outter;
				}
			}
		}

		System.out.println("프로그램 종료");
		System.out.println("------------------------------------");
		System.out.println();

		for (char upper = 'A'; upper <= 'Z'; upper++) {
			for (char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + "-" + lower);
				if (lower == 'g') {
					break;
				}
			}
		}

	}

}
