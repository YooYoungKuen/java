package ch05.sec04;

public class GarbageObjectExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Garbage
		 */
		
		String hobby = "여행";
		hobby = null;  //"여행"에 해당하는 String 객체를 쓰레기로 만듦
		
		
		String kind1 = "자동차";
		String kind2 = kind1; //kind1 변수에 저장되어 있는 번지를 kind2 변수에 대입
		kind1 = null;  //"자동차"에 해당하는 String 객체는 쓰레기가 아님
		
		System.out.println("kind2:" + kind2);
		
		
		
		//
		//kind1 재선언시 kind2에 객체는 살아있으므로 kind2를 출력하면 자동차가 출력된다.
		
	}

}
