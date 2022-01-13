package MultiThreading;

public class _13_OldVersionSuspendResume {
	
	public static void main(String[] args) {
		Thread1 th1=new Thread1("one");
		Thread1 th2=new Thread1("two");
		
		try {
			Thread.sleep(1000);
			System.out.println("Suspending thread1");
			th1.suspend();
			
			Thread.sleep(1000);
			System.out.println("Suspending thread2");
			th2.suspend();
			
			Thread.sleep(1000);
			System.out.println("Resuming thread1");
			th1.resume();
			
			Thread.sleep(1000);
			System.out.println("Resuming thread2");
			th2.resume();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}

class Thread1 implements Runnable{
	Thread th;
	Thread1(String name){
		th=new Thread(this,name);
		th.start();
	}
	
	@Override
	public void run() {
		for(int i=0;i<30;i++){
			System.out.println(th.getName()+": "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	void suspend(){
		th.suspend();
	}
	
	void resume(){
		th.resume();
	}
	
}
