package practice;

public class P_250311_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * 주어진 배열 항목의 전체 합과 평균을 구해 출력하는 코드를 작성해 보세요
		 * 중첩 for문 사용
		 */
		
		int[][] array = {
							{95,86},
							{83,92,96},
							{78,83,93,87,88}
						
						};
		    int totalNum = 0;
		    int totalSum = 0;
		
		for(int i = 0; i < array.length; i++) {
			
			totalNum += array[i].length;
			
			for (int j = 0; j < array[i].length; j++) {
				totalSum += array[i][j];
			}				
		}
		
		System.out.println("전체 합은:" + totalSum);
		
		double totalAvg = (double) totalSum / totalNum;
		
		System.out.println("전체 평균은:" + totalAvg);
	}

}
