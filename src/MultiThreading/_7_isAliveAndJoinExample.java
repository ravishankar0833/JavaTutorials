package MultiThreading;

public class _7_isAliveAndJoinExample {
	
	public static void main(String[] args) {
		NewThread th1=new NewThread("One");
		NewThread th2=new NewThread("Two");
		NewThread th3=new NewThread("Three");
		
		System.out.println("Thread one is alive: "+th1.th.isAlive());
		System.out.println("Thread two is alive: "+th2.th.isAlive());
		System.out.println("Thread three is alive: "+th3.th.isAlive());

		try {
			th1.th.join();
			th2.th.join();
			th3.th.join();
			
			for (int i = 0; i < 5; i++) {
				
				System.out.println("Main Thread: " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("Main Thread Interupted");
		}
		System.out.println("Thread one is alive: "+th1.th.isAlive());
		System.out.println("Thread two is alive: "+th2.th.isAlive());
		System.out.println("Thread three is alive: "+th3.th.isAlive());

		System.out.println("Main thread ended");

	}

}
