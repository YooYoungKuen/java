package Test;

public class Person {

	private static String name;
	public Person(String val) {
		name = val;
	}

	public static String get() {
		return name;

	}

	public void print() {
		System.out.println(name);
	}
}


