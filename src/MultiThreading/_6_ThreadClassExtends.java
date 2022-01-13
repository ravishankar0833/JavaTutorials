package MultiThreading;

public class _6_ThreadClassExtends {

	public static void main(String[] args) {
		new NewThread1("One");
		new NewThread1("Two");
		new NewThread1("Three");

		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("Main Thread: " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("Main Thread Interupted");
		}

		System.out.println("Main thread ended");

	}

}

class NewThread1 extends Thread {
	Thread th;

	NewThread1(String name) {
		th = new Thread(this, name);
		System.out.println("Child Thread: " + th);
		th.start();
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("Child Thread: " + th.getName() + ": " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("Child thread Interupted");
		}

		System.out.println("Child thread ended: " + th);
	}

}
