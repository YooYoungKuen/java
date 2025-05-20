package ch07.sec04.exam2;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeOff();
		System.out.println("flymode: " + sa.flyMode);
		sa.fly();
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		System.out.println("flymode: " + sa.flyMode);
		sa.fly();
		sa.flyMode = SupersonicAirplane.NORMAL;
		System.out.println("flymode: " + sa.flyMode);
		sa.fly();
		sa.land();

	}

}
