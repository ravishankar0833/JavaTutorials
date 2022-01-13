package MultiThreading;

import java.time.LocalDateTime;

public class _2_Example {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*System.out.println("This it the simple Thread");
		ThreadMain t1= new ThreadMain("Thread 1");
		ThreadMain t2= new ThreadMain("Thread 2");
		ThreadMain t3= new ThreadMain("Thread 3");
		ThreadMain t4= new ThreadMain("Thread 4");
		ThreadMain t5= new ThreadMain("Thread 5");
		ThreadMain t6= new ThreadMain("Thread 6");
		ThreadMain t7= new ThreadMain("Thread 7");
		ThreadMain t8= new ThreadMain("Thread 8");
		ThreadMain t9= new ThreadMain("Thread 9");
		ThreadMain t10= new ThreadMain("Thread 10");
		
		System.out.println(LocalDateTime.now());
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();
		t10.start();
		
		System.out.println(LocalDateTime.now());
		System.out.println("************");*/
		
		NormalMain n1=new NormalMain("NThread 1");
		NormalMain n2=new NormalMain("NThread 2");
		NormalMain n3=new NormalMain("NThread 3");
		NormalMain n4=new NormalMain("NThread 4");
		NormalMain n5=new NormalMain("NThread 5");
		NormalMain n6=new NormalMain("NThread 6");
		NormalMain n7=new NormalMain("NThread 7");
		NormalMain n8=new NormalMain("NThread 8");
		NormalMain n9=new NormalMain("NThread 9");
		NormalMain n10=new NormalMain("NThread 10");
		
		n1.run();
		n2.run();
		n3.run();
		n4.run();
		n5.run();
		n6.run();
		n7.run();
		n8.run();
		n9.run();
		n10.run();
		
		System.out.println(LocalDateTime.now());
		
	}
}

class NormalMain{
	
	Thread localThread;
	
	private String localThreadName;
	
	NormalMain(String name){
		localThreadName=name;
	}

	public void run() {
		System.out.println("Thread running: "+ localThreadName);
		
		for(int i=0;i<40;i++){
			LocalDateTime time=LocalDateTime.now();
			System.out.println(time.toString()+i+localThreadName );
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	
}

class ThreadMain implements Runnable{
	
	Thread localThread;
	
	private String localThreadName;
	
	ThreadMain(String name){
		localThreadName=name;
	}

	@Override
	public void run() {
		System.out.println("Thread running: "+ localThreadName);
		
		for(int i=0;i<40;i++){
			LocalDateTime time=LocalDateTime.now();
			System.out.println(time.toString()+i+localThreadName );
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public void start(){
		System.out.println("Thread Started: "+ localThreadName);
		/*Here we are taking an if condition to check whether
		 *  class variable localThread has value in it or no. 
		 *  If its null then we are creating an instance using 
		 *  thread class which takes the name as a parameter 
		 *  (value for which was assigned in the constructor). 
		 *  After which the thread is started using start() method
		*/
		if(localThread == null){
			localThread = new Thread(this, "localThreadName");
			localThread.start();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
