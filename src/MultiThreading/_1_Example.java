package MultiThreading;

public class _1_Example implements Runnable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("This it the simple Thread");
		Thread t1= new Thread("Thread 1");
		Thread t2= new Thread("Thread 2");
		
		t1.start();
		t2.start();
		
		System.out.println("Thread names are as follows");
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		
		try {
			t2.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		t2.setPriority(2);
		System.out.println("priority of t1:"+t1.getPriority());
		
	}
	
	static int counter(){
		int count=0;
		
		if(count<50){
			return count;
		}else{
			return -1;
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
