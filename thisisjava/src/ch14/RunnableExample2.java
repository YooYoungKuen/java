package ch14;

public class RunnableExample2 {

	public static void main(String[] args) {

		String threadName = Thread.currentThread().getName();
		System.out.println("1현재 스레드 이름: " + threadName);
		
		Thread blue = new Thread(new BlueFlag());
		Thread white = new Thread(new WhiteFlag());
		
		threadName = blue.getName();
		System.out.println("2현재 스레드 이름: " + threadName);
		blue.start();
		
		threadName = white.getName();
		System.out.println("3현재 스레드 이름: " + threadName);
		white.start();
	}

}
