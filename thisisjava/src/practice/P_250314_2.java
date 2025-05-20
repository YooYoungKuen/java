package practice;

public class P_250314_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 로또 번호 6개 담을 배열 선언
		// 인덱스 번호 0부터 6까지 값이 늘어가는 변수 선언
		int cnt = 0;
		int[] array = new int[6];

		// while문 (cnt가 6보다 작을때까지 반복 6과 같으면 반복안함)
		while (cnt < 6) {

			// 랜덤으로 1부터 45까지 담을 변수 num 선언
			int num = (int) (Math.random() * 45 + 1);

			// 랜덤으로 뽑은 수를 array[cnt]에 저장
			array[cnt] = num;

			// for문으로 cnt길이만큼 반복문 실행
			// array[cnt]와 num의 값이 같을 경우 브레이크를 만나서
			// 해당 실행문 빠져나감
			for (int i = 0; i < cnt; i++) {
				if (array[cnt] == num) {
					break;
				}
			}
			// 반복문이 한바뀌 돌고 중괄호를 빠져나오면 cnt값이 1씩증가
			// cnt값이 6 과 같으면 반복문 종료
			cnt++;
		}

		// 출력문에 반복문으로 증가되는 수를 넣기 위해서 반복문 넣음
		for (int i = 0; i <= 5; i++) {
			System.out.println(i + 1 + "번째번호 : " + array[i]);
		}

	}

}
