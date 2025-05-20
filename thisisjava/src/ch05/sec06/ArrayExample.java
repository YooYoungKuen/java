package ch05.sec06;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 배열
		 */

		// 배열 변수 선언과 배열 생성
		String[] season = { "spring", "Summer", "Fall", "Winter" };
		
//		//배열의 항목값 읽기
		System.out.println("season[0] : " + season[0]);
		System.out.println("season[1] : " + season[1]);
		System.out.println("season[2] : " + season[2]);
		System.out.println("season[3] : " + season[3]);
		
		//인덱스 1 항목에 "야,여름이다" 값으로 변경, 출력해 주세요
		season[1] = "야, 여름이다";
		System.out.println("season[1] : " + season[1]);
		
		//배열 변수 선언과 배열 생성
		int[] scores = { 83, 90, 87 };
		
		//총합과 평균 구하기
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		System.out.println("총합:" + sum);
		double avg = (double) sum / 3;
		System.out.println("평균:" + avg);
		
		//배열 변수 선언과 배열 생성
		int[] arr1 = new int[3]; 
		
		//배열 항목의 초기값 출력				
		for(int i=0; i<3; i++) {
			System.out.print("arr1[" + i + "] : " + arr1[i] + ", ");
			System.out.println();
		}	
			
		// arr1의 각 항목별 값들은 인덱스 번호로 채워주세요
		//순서대로 값을 출력해 주세요
		arr1[0] = 1;
		arr1[1] = 2;
		arr1[2] = 3;
		for(int i=0; i < arr1.length; i++) {
			   
		System.out.println("arr1["+i+"]:" + arr1[i]);
		}
		
			
		// double 데이터 타입으로 배열의 길이는 3개로 생성한 다음에
		// 인덱스 순서대로 0.1, 0.3, 0.5 값을 넣어 주세요
		// 순서대로 값을 출력해 주세요
		
//		double[] dArr = new double [3];	  //배열을 선언했지만 값이 주어지지 않은 상태
//		
//		for(int j=0; j<3; j++) {
//			System.out.println("dArr["+j+"]:" + dArr[j]);
//		}
		
		
		
	  double[] dArr = {0.1,0.3,0.5}; // 배열에 바로 선언. 요소 값이 주어진 상태
		for(int j=0; j<3; j++) {
			
			System.out.println("dArr["+j+"]:" + dArr[j]);
		}
		
		
		
			
		// 문자열을 담은 3개의 배열을 선언 한 후
		// 인덱스 순서대로 "1월", "2월", "3월" 데이터를 넣어주세요
		// 순서대로 값을 출력해 주세요	
		
		String[] sArr = new String[3];
		
		sArr[0] = "1월";
		sArr[1] = "2월";
		sArr[2] = "3월";
//		sArr = new String[] {"1월","2월","3월"};
		
		for(int i=0; i < sArr.length; i++) {
			
			System.out.println("sArr["+i+"]:" + sArr[i]);
		}
		
		
		
		
		// 100, 50, 80, 94 값을 선언할 때 같이 초기화 해 주고
		// 해당 하는 값의 총합과 평균을 구하세요
		// 평균은 double 값으로 구해 주세요
		// 총합과 평균을 출력 해 주세요
		
		int[] scoreArr = {100,50,80,94};
		int sum2 = 0;
		for(int i=0; i < scoreArr.length; i++) {
			sum2 += scoreArr[i];
		}
		avg = (double)sum / 4;
		System.out.println("총합:"+sum+":평균:"+avg);
		
		
		
		
	}

}
