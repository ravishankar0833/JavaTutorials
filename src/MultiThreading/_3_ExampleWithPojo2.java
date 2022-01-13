package MultiThreading;

import org.testng.annotations.Test;

public class _3_ExampleWithPojo2 implements Runnable {

	@Test
	public void test21(){
		System.out.println("test21 started Thread name: "+Thread.currentThread().getName());
		Employee.setEmployee("Meena",11);
		Employee.getEmployee();
		System.out.println("test21 ended Thread name: "+Thread.currentThread().getName());
	}
	
	@Test
	public void test22(){
		System.out.println("test22 started Thread name: "+Thread.currentThread().getName());
		Employee.setEmployee("Aishu",21);
		Employee.getEmployee();
		System.out.println("test22 ended Thread name: "+Thread.currentThread().getName());
	}
	
	@Test
	public void test23(){
		System.out.println("test23 started Thread name: "+Thread.currentThread().getName());
		Employee.setEmployee("Gay",31);
		Employee.getEmployee();
		System.out.println("test23 ended Thread name: "+Thread.currentThread().getName());
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}


