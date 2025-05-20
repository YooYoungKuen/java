package ch06.sec10.exam02;

public class Television {

	//static안에서는 instence를 가져다 쓰면 안된다.
	
	static String company = "MyCompany";
	static String model = "LCD";
	static String info;
	
	
	static {
		info = company + "-" + model;
	
	}
}
