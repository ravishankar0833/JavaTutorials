package MultiThreading;

public class _12_DeadlockExample  implements Runnable{

	_12_DeadlockExample(){
		Thread.currentThread().setName("Main Thread");
		Thread t1=new Thread("Racing Thread");
		t1.start();
		A.call();
		System.out.println("Main Ended");
	}
	
	@Override
	public void run() {
		B.call();
		System.out.println("Racing Thread ended");
	}
	
	public static void main(String[] args) {
		new _12_DeadlockExample();
	}
	
}
class A {
	synchronized static void call(){
		try {
			System.out.println("A block: Call started");
			B.call();
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Call interupted");
		}
		System.out.println(" A block: call ended");
	}
}

class B extends A{
	synchronized static void call(){
		try {
			System.out.println("B block: Call started");
			A.call();
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Call interupted");
		}
		System.out.println("B block: call ended");
	}
}


