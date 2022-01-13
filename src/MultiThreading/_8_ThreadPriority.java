package MultiThreading;

public class _8_ThreadPriority {

	public static void main(String[] args) {
		
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);

		clicker th1 = new clicker("One",Thread.MIN_PRIORITY);
		clicker th2 = new clicker("Two",Thread.NORM_PRIORITY+2);
		clicker th3 = new clicker("Three",Thread.NORM_PRIORITY-2);
		clicker th4 = new clicker("One",Thread.MIN_PRIORITY);

		System.out.println("Thread one is alive: " + th1.th.isAlive());
		System.out.println("Thread two is alive: " + th2.th.isAlive());
		System.out.println("Thread three is alive: " + th3.th.isAlive());
		System.out.println("Thread four is alive: " + th4.th.isAlive());

		try {
			
			for (int i = 0; i < 5; i++) {
				
				System.out.println("Main Thread: " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("Main Thread Interupted");
		}
		
		
		th1.stop();
		System.out.println("Thread one stopped:");
		
		th2.stop();
		System.out.println("Thread two stopped:");
		
		th3.stop();
		System.out.println("Thread three stopped:");
		
		th4.stop();
		System.out.println("Thread four stopped:");
		
		System.out.println("Thread one count: " + th1.getCount());
		System.out.println("Thread two count: " + th2.getCount());
		System.out.println("Thread three count: " + th3.getCount());
		System.out.println("Thread four count: " + th4.getCount());
		
		System.out.println("Thread one is alive: " + th1.th.isAlive());
		System.out.println("Thread two is alive: " + th2.th.isAlive());
		System.out.println("Thread three is alive: " + th3.th.isAlive());
		System.out.println("Thread four is alive: " + th4.th.isAlive());

		System.out.println("Main thread ended");

	}

}

class clicker implements Runnable {
	Thread th;
	private long count;
	private volatile Boolean running=true;
	
	clicker(String name, int newPriority) {
		th = new Thread(this, name);
		th.setPriority(newPriority);
		th.start();
	}

	@Override
	public void run() {
		count = 0;
		while (running) {
			count++;
		}
		System.out.println("Child Thread: "+th.getName()+" Stopped");
	}
	
	public long getCount(){
		return count;
	}
	
	public void stop(){
		running=false;
	}

}