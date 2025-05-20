package practice;

public class P_250311_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 최대값과 최소값을 구하시오
		 * 배열 int[]score={79,88,91,33,100,55,95};
		 */
		
		
		int[] score = {79,88,91,33,100,55,95};
		int maxScore = score[0];
		int minScore = score[0];
		
		for(int i = 0; i < score.length; i++) {
			if(score[i] > maxScore) {
				maxScore = score[i];
			}
			if(score[i] < minScore) {
				minScore = score[i];
			}
			
			
			
		}
		System.out.println("maxScore:" + maxScore +", minScore:" + minScore);
//		System.out.println("최대값 : " + maxScore);
//		System.out.println("최소값 : " + minScore);
	}

}
