package _1_Generic;

public class _1_MainClass_MethodExample {
	
	public static void main(String[] args) {
		ControlClass c= new ControlClass();
		
		Student s = new Student("Ravi","10th");
		Teacher t= new Teacher("Maheshwari","primary");
		Staff st= new Staff("prem","attender");
		c.verify(s);
		c.verify(t);
		c.verify(st);
	}

}
