package MultiThreading;

import org.testng.annotations.Test;

public class _3_ExampleWithPojo implements Runnable {

	@Test
	public void test11(){
		System.out.println("test11 started Thread name: "+Thread.currentThread().getName());
		Employee.setEmployee("Ravi",1);
		Employee.getEmployee();
		System.out.println("test11 ended Thread name: "+Thread.currentThread().getName());
	}
	
	@Test
	public void test12(){
		System.out.println("test21 started Thread name: "+Thread.currentThread().getName());
		Employee.setEmployee("Raj",2);
		Employee.getEmployee();
		System.out.println("test12 ended Thread name: "+Thread.currentThread().getName());
	}
	
	@Test
	public void test13(){
		System.out.println("test31 started Thread name: "+Thread.currentThread().getName());
		Employee.setEmployee("Narayana",3);
		Employee.getEmployee();
		System.out.println("test13 ended Thread name: "+Thread.currentThread().getName());
	}
	
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}


