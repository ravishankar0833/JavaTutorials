package MultiThreading;

public class _4_MainThreadExample {
	
	public static void main(String[] args) {
		
		Thread th= Thread.currentThread();
		System.out.println("Current Thread: "+th);
		
		th.setName("MyThread");
		System.out.println("After name change: "+th);
		
		
			try {
				for(int i=0;i<5;i++){
					System.out.println(i);
					Thread.sleep(1000);
				}
			} catch (InterruptedException e) {
				System.out.println("MainThread Interupted");
			}
		
		
	}

}
