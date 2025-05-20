package ch05.sec05;

public class SplitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * 문자열 분리 split
		 *  (, :)같은 구분자를 이용하여 문자열이 여러 개 구성되어 있을 경우 따로 분리 하고 싶을 때 사용
		 */
		
		String board = "1,자바 학습,참조 타입 String을 학습합니다.,홍길동";
		
		//분자열 분리
		String[] tokens = board.split(",");
		
		//인덱스별로 읽기
		
		System.out.println("번호:" + tokens[0]);
		System.out.println("제목:" + tokens[1]);
		System.out.println("내용:" + tokens[2]);
		System.out.println("성명:" + tokens[3]);
		System.out.println();
		
		//for 문을 이용한 읽기
		for(int i=0; i<tokens.length; i++) {
			System.out.println(tokens[i]);
		}
		
		String board2 = "1:자바 학습:참조 타입 String을 학습합니다.:둘리"; //구분자가 : 경우
		
		String[] tokens2 = board2.split(":");
		
		System.out.println("번호:" + tokens2[0]);
		System.out.println("제목:" + tokens2[1]);
		System.out.println("내용:" + tokens2[2]);
		System.out.println("성명:" + tokens2[3]);
		System.out.println();
		
		for(int i=0; i<tokens2.length; i++) {
			System.out.println(tokens2[i]);
		}
		
	}

}
