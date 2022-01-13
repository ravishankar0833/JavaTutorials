package MultiThreading;

public class _13_NewTypeSuspendResumeUsingWaitNotify {
	
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

class Thread2 implements Runnable{
	Thread th;
	Boolean SuspendFlag= false;
	Thread2(String name){
		th=new Thread(this,name);
		th.start();
	}
	
	@Override
	public void run() {
		for(int i=0;i<30;i++){
			System.out.println(th.getName()+": "+i);
			try {
				Thread.sleep(250);
				while(SuspendFlag){
					th.wait();
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	void suspend(){
		SuspendFlag=true;
	}
	
	synchronized void resume(){
		SuspendFlag=false;
		notify();
	}
	
}


