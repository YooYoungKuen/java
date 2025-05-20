package practice.Television;

public class TelevisionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Television lgTelevision = new Television(7,9,true);
		System.out.println("lgTelevision.channel:" + lgTelevision.channel);
		System.out.println("lgTelevision.volume:" + lgTelevision.volume);
		System.out.println("lgTelevision.onOff:" + lgTelevision.onOff);
		
		
		Television samsumngTelevision = new Television(9,10,true);
		System.out.println("samsumngTelevision.channel:" + samsumngTelevision.channel);
		System.out.println("samsumngTelevision.volume:" + samsumngTelevision.volume);
		System.out.println("samsumngTelevision.onOff:" + samsumngTelevision.onOff);
		
	}

}
