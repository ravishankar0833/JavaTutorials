package _1_Generic;

public class _2_ClassExample {
	
	public static void main(String[] args) {
		
		//Gen<int> wont work as int is premitive type
		
		//Creating the Integer Type of gen class
		Gen<Integer> genObj;
		
		genObj=new Gen<Integer>(1);
		
		int g=genObj.getObj();		
		System.out.println("The value of g is "+g);
		
		genObj.showObject();
		
		//Creating String Type of Gen Class
		Gen<String> strObj=new Gen<String>("Generic String Type");
		
		strObj.showObject();
		
		
	}
	

}

class Gen<T>{
	T obj;
	
	Gen(T o){
		obj=o;
	}

	public T getObj() {
		return obj;
	}

	//show type of obj
	public void showObject() {
		//getClass displays the Class of obj
		//getName displays the Type of getClass object obj
		System.out.println("Type of obj is: "+ obj.getClass().getName());
	}
	
	
}
