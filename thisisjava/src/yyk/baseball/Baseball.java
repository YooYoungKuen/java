package yyk.baseball;

import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {


		int out = 0;
		int inning = 0;
		
		//타자 배열 선언
		int[] batArray = new int [9];
		
		//투수 배열 선언
		int[] pitArray = new int [9];
		
		//스캐너 불러와서 숫자 입력
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		
		//for문으로 배터길이만큼 반복문 
		for (int i = 0; i < batArray.length; i++) {
			//batArray 배열 순번대로 타자 출격
			System.out.println(i + 1 + "번째 타자");
			//스캐너로 스트링 문자열 가저옴
			String strA = scanner.nextLine();
			//batArray는 이미 변수명으로 사용중이므로 batArray1로 선언.  문자열을 인트형으로 형 변환
			int batArray1 = Integer.parseInt(strA);
			//입력값 battArray1을  batArray배열에 저장
			batArray[i] = batArray1;
			//pitArray배열을 1~10까지 난수로 나오게 저장 
			pitArray[i] = (int) (Math.random() * 10 + 1);
			
			//if문으로 조건 만듬 
			//batArray[i]의 입력값과 pitArray[i]의 난수가 같을시 안타
			if(batArray[i] == pitArray[i]) {
				System.out.println("안타입니다.");
			//batArray[i]의 입력값과 pitArray[i]의 난수가 같지 않은 모든 수 에 아웃
			}else {
				//글로벌 변수로 out 선언해놓고  out시 1씩 증가 (몇번째 아웃인지 카운트)
				out++;
				System.out.println(out + " 번째 아웃 ");
			}
			//반복문이 돌면서 3out을 했을 시 다음 이닝으로 넘어감
			if (out == 3) {
				System.out.println("3아웃으로 다음 이닝");				 
			}
			//for문에 i가 8번째 (0부터니까 타석 9번이 지난 후) 이후에 i 값은 0으로 1부터 다시 시작
			if (i == 8) {
				i = 0;
			}
			//out변수가 3으로 나눠서 나머지가 0일시 inning 변수 1씩 증가
			if (out % 3 == 0) {
				//바깥에 글로벌 변수로 inning 생성
				inning++;
				System.out.println(inning + 1 + "번째 이닝");
			}
			//for문이 반복되어서 inning이 3과 같을시 3이닝으로 야구 종료
			if (inning == 3) {
				System.out.println("3이닝으로 야구 종료");
				//위에 실행문이 true로 실행되고 야구가 3이닝으로 종료되면 break 걸려서 실행문을 완전히 빠져나감
				break;
			}
		}
		/*
		 * 타자와 투수 배열을 선언 후 스캐너 문자열을 불러와 숫자를 입력하라고 출력
		 * 반복문 안에 내용
		 * 반복문으로 타자의 길이만큼(0부터 8까지 9번) 반복문 수행 몇번째 타자가 나올건지 출력
		 * 타자는 입력값을 받아야하고 반복문 안에 있는 타자배열(batArray)을 입력받은 값으로 사용하고 싶으나 타자변수명을 전역변수로 사용하고 있으므로
		 * 스캐너로 batArray1을 새롭게 선언한 후 batArray1에 입력받은 값을 저장
		 * 배터 생성 끝
		 * 피처는 외부에 있는 전역변수 pitArray에 1부터 10까지 난수를 던지게끔 Math.random으로 저장
		 * 피처 생성 끝
		 * if문으로 조건을 만듬
		 * 첫번째 if
		 * 타자와 피처의 수가 같으면 안타 안타일 경우 밑에 실행문들을 거치는데 true가 없으므로 반복문으로 돌아가서 다시 실행
		 * 두번째 else
		 * if에서 제시한 조건이 아닐시 무조건 아웃 . 아웃일시 몇번째 아웃 출력하고 외부에 생성해 놓은 out 변수의 수가 1씩 증가하도록 설정
		 * 아래 실행문을 쭉 훑어가면서 true가 아닐시 그냥 지나가고 중괄호를 빠져나가서 다시 반복문 실행으로 돌아가서 반복문 실행
		 * 세번째 if
		 * 위에 else에서 아웃이 3번나오는 조건을 만족했을시 3아웃으로 3아웃 출력 후 1이닝 종료 후 다음이닝으로 넘어가고 
		 * 아래 실행문 조건들을 확인 후 지나가고 조건에 맞지 않으면 다시 반복문으로 돌아가서 실행
		 * 네번째 if
		 * 반복문 안에 있는 배열 i 의 숫자가 8번째일때 (0부터니까 9번째) 의 조건을 만족하면 반복문안에 있는 배열 i 의 카운터는 0으로 돌아감
		 * 다섯번째 if
		 * 세번째 if문 의 조건을 3번 만족 (아웃카운터를 3으로 나눠서 0일시) 하나의 이닝종료 후 외부에 생성한 inning 변수 1씩 증가하도록 설정하고 몇번째 이닝인지 출력
		 * 여섯번째 if
		 * 5번째 설정해놓은 변수 inning의 값이 3인 조건을 만족 시 3이닝으로 야구 종료 출력. 아래 브레이크문으로 실행문 종료. 중괄호 다 빠져나가서 야구 완전 종료
		 */
		
	}

}
