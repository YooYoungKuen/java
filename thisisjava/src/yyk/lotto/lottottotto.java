package yyk.lotto;

public class lottottotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 로또 번호 6개 담을 배열 선언
		int cnt = 0;
		// 로또 번호 6개 담을 변수 선언
		int[] array = new int[6];

		// while문 (cnt가 6보다 작을때까지 반복 6과 같거나 크면 반복 종료)
		while (cnt < 6) {
			// 랜덤으로 뽑은 수를 변수 num에 저장
			int num = (int) (Math.random() * 45 + 1);

			// 랜덤수를 담은 num 을 array[cnt] 에 저장
			array[cnt] = num;

			// 중복숫자 안나오게끔 for문 돌림
			// for문으로 cnt길이만큼 반복문 실행
			// 이미 담겨있는 array[cnt]의 값과 랜덤으로 뽑은 num의 값이 같으면 브레이크를 실행시켜 해당 실행문으로 빠져나가
			// 와일문으로 돌아가고 값이 같지 않으면 진행하면서 cnt가 1씩증가 cnt값이 6보다 작을시 반복문 종료
			for (int i = 0; i < cnt; i++) {
				if (array[cnt] == num) {
					break;
				}
			}
			cnt++;
		}

		for (int i = 0; i < 6; i++) {
			System.out.println(i + 1 + "번째 번호 : " + array[i]);
		}

	}

}
