package MultiThreading;

//One Queue with one producer and multiple consumer
public class _11_InterthreadCommunicationExample2 {
	public static void main(String[] args) {
		Queue1 q = new Queue1();
		new producer1(q, "producer");
		new consumer1(q, "consumer1");
		new consumer1(q, "consumer2");
		new consumer1(q, "consumer3");
	}
}

class Queue1 {
	int count;
	boolean valueSet = false;

	synchronized int get() {

		while (!valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("wait interuppted");
			}

		}
		valueSet = false;
		notifyAll();
		return count;
	}

	synchronized void set(int count) {
		while (valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("wait interuppted");
			}

		}

		this.count = count;
		valueSet = true;
		notifyAll();

	}
}

class producer1 implements Runnable {
	Thread th;
	Queue1 queue;

	producer1(Queue1 q, String name) {
		queue = q;
		th = new Thread(this, name);
		th.start();

	}

	@Override
	public void run() {
		int i = 0;
		while (true) {
			queue.set(i);
			System.out.println(th.getName() + ": set:" + i++);
		}

	}
}

class consumer1 implements Runnable {
	Thread th;
	Queue1 queue;

	consumer1(Queue1 q, String name) {
		queue = q;
		th = new Thread(this, name);
		th.start();
	}

	@Override
	public void run() {
		int i = 0;
		while (true) {
			System.out.println("----------------------------->" + th.getName() + ": get:" + queue.get());
			i++;

		}
	}
}
