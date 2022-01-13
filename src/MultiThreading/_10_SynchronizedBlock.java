package MultiThreading;

public class _10_SynchronizedBlock {
	
	public static void main(String[] args) {
		callMe1 c= new callMe1();
		new syncClass1(c,"Hello");
		new syncClass1(c,"Synchronized");
		new syncClass1(c,"World");
	}

}

class callMe1{
	void call(String msg){
		try {
			System.out.print("[");
			Thread.sleep(1000);
			System.out.print(msg);
			Thread.sleep(1000);
			System.out.println("]");
		} catch (InterruptedException e) {
			System.out.println("Child Interupted");
		}
	}
}

class syncClass1 implements Runnable{

	Thread th;
	callMe1 c;
	
	syncClass1(callMe1 target,String name){
		
		c=target;
		th = new Thread(this, name);
		th.start();
		
	}
	
	@Override
	public void run() {
		synchronized(c){
			c.call(th.getName());
		}
		
	}
	
	
}
