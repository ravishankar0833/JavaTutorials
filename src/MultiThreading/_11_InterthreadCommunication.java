package MultiThreading;

// One Queue with one producer and one consumer
public class _11_InterthreadCommunication {
	public static void main(String[] args) {
		Queue q=new Queue();
		new producer(q,"producer");
		new consumer(q,"consumer");

	}
}

class Queue {
	int count;
	boolean valueSet = false;
	
	synchronized int get() {
		
		while(!valueSet){
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("wait interuppted");
			}
			
		}
		valueSet=false;
		notify();
		return count;
	}

	synchronized  void set(int count) {
		while(valueSet){
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("wait interuppted");
			}
			
		}
		
		this.count = count;
		valueSet=true;
		notify();
		
	}
}

class producer implements Runnable {
	Queue queue;
	producer(Queue q,String name) {
		queue=q;
		new Thread(this, name).start();

	}

	@Override
	public void run() {
		int i = 0;
		while (i < 20) {
			queue.set(i);
			System.out.println("set:" + i++);
		}

	}
}

class consumer implements Runnable {
	Queue queue;
	consumer(Queue q,String name) {
		queue=q;
		new Thread(this, name).start();
	}

	@Override
	public void run() {
		int i = 0;
		while (i < 20) {
			System.out.println("get:" + queue.get());
			i++;
		}
	}
}
