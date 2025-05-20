package practice.Tree;

public class TreeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("===== 나무 정보 =====");
		System.out.println("이름: " + Tree.name("Mango"));
		System.out.println("성장 시간: " + Tree.growthTime(4) + "시간");
		System.out.println("별점: " + Tree.starRating(4));
		System.out.println("보유 개수: " + Tree.currentAmount(7) + "/" + Tree.maxAmount(50));
		System.out.println("가격: " + Tree.price(200) + " 코인");
		System.out.println("====================");
		
		System.out.println("===== 나무 정보 =====");
		System.out.println("이름: " + Tree.name("Papaya"));
		System.out.println("성장 시간: " + Tree.growthTime(6) + "시간");
		System.out.println("별점: " + Tree.starRating(6));
		System.out.println("보유 개수: " + Tree.currentAmount(6) + "/" + Tree.maxAmount(50));
		System.out.println("가격: " + Tree.price(375) + " 코인");
		System.out.println("====================");
		
		System.out.println("===== 나무 정보 =====");
		System.out.println("이름: " + Tree.name("BananaPalm"));
		System.out.println("성장 시간: " + Tree.growthTime(5) + "시간");
		System.out.println("별점: " + Tree.starRating(5));
		System.out.println("보유 개수: " + Tree.currentAmount(7) + "/" + Tree.maxAmount(50));
		System.out.println("가격: " + Tree.price(500) + " 코인");
		System.out.println("====================");
		
		System.out.println("===== 나무 정보 =====");
		System.out.println("이름: " + Tree.name("Lemon"));
		System.out.println("성장 시간: " + Tree.growthTime(8) + "시간");
		System.out.println("별점: " + Tree.starRating(8));
		System.out.println("보유 개수: " + Tree.currentAmount(1) + "/" + Tree.maxAmount(50));
		System.out.println("가격: " + Tree.price(750) + " 코인");
		System.out.println("====================");
		
	}

}
