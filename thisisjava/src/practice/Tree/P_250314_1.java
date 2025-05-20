package practice.Tree;

public class P_250314_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//로또 번호 6개 담을 배열 생성
		int array[] = new int[6];

		for (int i = 0; i <= 5; i++) {

			int num = (int) (Math.random() * 45 + 1);

			array[i] = num;

			for (int j = 0; j < i; j++) {

				if (array[i] == array[j]) {
					i--;
					break;
				}
			}
		}

		System.out.println("====== 이번주 로또번호 ======");
		for (int i = 0; i <= 5; i++) {
			System.out.println(i + 1 + "번째번호 : " + array[i]);
		}
		System.out.println("======= 당첨 기원 =======");

	}

}
