package practice.Box;

public class BoxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box myBox = new Box(20,20,30);

		double result = myBox.volume(20,20,30);
		System.out.println("상자의 가로,세로,높이는 " + myBox.width +","+ myBox.length +","+ myBox.height +" 입니다.");
		System.out.println("상자의 부피는 " + result + " 입니다.");

	}

}
