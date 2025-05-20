package ch11.sec05;

public class ThrowsExample2 {

	public static void main(String[] args) throws Exception {

//		try {
//			String name = "둘리";
//			findClass();
//		} catch(ClassNotFoundException e) {
//			System.out.println("예외 처리:" + e.toString());
//		}
		findClass();
	}
	
	public static void findClass() throws ClassNotFoundException {
		Class.forName("Java.lang.String2");
	}

}
