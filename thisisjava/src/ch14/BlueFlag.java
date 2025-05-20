package ch14;

public class BlueFlag implements Runnable {

	@Override
	public void run() {
		int i = 0;
		while(true) {
			if (i > 100) break;
			System.out.println(i + " 청기올려");
			i++;
		}
		String threadName = Thread.currentThread().getName();
	}
}
