package yyk.lotto;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 로또 번호 6개 저장할 배열 변수 생성
		int array[] = new int[6];

		// 반복문
		// i는 0이고 6보다 작을때까지 반복; 1씩증가, 숫자가 증가하는 것이 아닌 배열의 인덱스 순번이 1씩 늘어남
		for (int i = 0; i <= 5; i++) {

			// 1부터 45까지 랜덤으로 배열에 담을 숫자를 int num에 저장
			int num = (int) (Math.random() * 45 + 1);

			// 랜덤으로 뽑은 num의 숫자를 반복문에 있는 배열 array[i] 에 저장
			array[i] = num;

			// 중복된 숫자가 나오면 이전 배열로 돌아가게 해주기 위한 반복문
			for (int j = 0; j < i; j++) {

				// array[i]의 값과 array[j]의 값이 같으면 array[i]의 배열이 이전 인덱스로 돌아가고
				// 브레이크를 만나서 해당실행문 빠져나감

				if (array[i] == array[j]) {
					i--;
					break;
				}
			}
		}

		System.out.println("====== 이번주 로또번호 ======");
		// 추출한 배열 [i]의 인덱스 값을 순차적으로 출력하기 위한 반복문
		for (int i = 0; i <= 5; i++) {
			System.out.println(i + 1 + "번째번호 : " + array[i]);
		}
		System.out.println("======= 당첨 기원 =======");
	}

}
