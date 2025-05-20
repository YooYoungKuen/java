package Test;

public class testtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input=101110;
		int di = 1;
		int sum = 0;
		
		while (true) {
			if (input ==0) break;
			else {
				sum=sum+(input % 10)* di;
				System.out.println(sum);
				di=di*2;
				input = input/10;
				
			}
		}
		System.out.println(sum);
	}
	

}
