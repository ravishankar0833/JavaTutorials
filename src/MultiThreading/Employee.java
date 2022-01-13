package MultiThreading;

public class Employee {
	
	private ThreadLocal<String> employeeName=ThreadLocal.withInitial(()-> new String());
	private ThreadLocal<Integer> id=ThreadLocal.withInitial(()-> 0);
	private static Employee e1=new Employee(); 
	
	public String getemployeeName(){
		return this.employeeName.get();
	}
	
	public void setemployeeName(String employeeName){
		this.employeeName.set(employeeName);
	}
	
	public int getId(){
		return this.id.get();
	}
	
	public void setId(int id){
		this.id.set(id);
	}
	
  public synchronized static void setEmployee(String name, int id){
		
		e1.setemployeeName(name);
		e1.setId(id);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void getEmployee(){
		System.out.println(e1.getemployeeName());
		System.out.println(e1.getId());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
