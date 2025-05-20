package ch14;

public class RunnableExample3 {

	public static void main(String[] args) {

		String threadName = Thread.currentThread().getName();
		System.out.println("1현재 스레드 이름: " + threadName);
		
		Runnable blue = () -> {
			int i = 0;
			while(true) {
				if (i > 100) break;
				System.out.println(i + " 청기 올려");
				i++;
			}
			String threadName1 = Thread.currentThread().getName();
			System.out.println("3 blue 현재 스레드 이름 : " + threadName1);
		};
		
		Runnable white = () -> {
			int i = 0;
			while(true) {
				if (i > 100) break;
				System.out.println(i + " 백기 올려");
				i++;
			}
			String threadName1 = Thread.currentThread().getName();
			System.out.println("4 white 현재 스레드 이름: " + threadName1);
		};
		
		Thread blueflag = new Thread(blue);
		Thread whiteflag = new Thread(white);
		
		blueflag.start();
		whiteflag.start();
	}

}
