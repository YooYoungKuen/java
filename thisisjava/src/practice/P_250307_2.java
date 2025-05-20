package practice;

public class P_250307_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("스코어보드");
		System.out.print("\t");
		int[] round = {1,2,3,4,5,6,7,8,9};
		for(int i=0; i<round.length; i++) {
			System.out.print(round[i]+"   ");
			
		}
			System.out.println("R");
			
			System.out.print("탬파베이\t");
			
		int[] tem = {0,0,0,0,1,3,2,3,1,10};
		for(int i=0; i<tem.length; i++) {
			System.out.print(tem[i]+"   ");
		}
		
			System.out.println();
		
			System.out.print("토론토\t");
		
		int[] toron = {0,2,2,0,4,1,0,0,0,9};
		for(int i=0; i<toron.length; i++) {
			System.out.print(toron[i]+"   ");
		}
			
			
	}

}
