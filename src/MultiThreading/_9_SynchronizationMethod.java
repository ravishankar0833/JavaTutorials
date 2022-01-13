package MultiThreading;

public class _9_SynchronizationMethod {
	
	public static void main(String[] args) {
		new syncClass("Hello");
		new syncClass("Synchronized");
		new syncClass("World");
	}

}

class callMe{
	synchronized static void call(String msg){
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

class syncClass implements Runnable{

	Thread th;
	
	syncClass(String name){

		th = new Thread(this, name);
		th.start();
		
	}
	
	@Override
	public void run() {
		callMe.call(th.getName());
	}
	
	
}
