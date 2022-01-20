package _1_Generic;

public class _1_BasicExampleofGenericClass {
	public static void main(String[] args) {
		genClass<Integer> gi=new genClass<Integer>(10);
		
		gi.showType();
		System.out.println("value: "+gi.getOb());
		
		genClass<String> gstr=new genClass<String>("Stroing");
		
		gstr.showType();
		System.out.println("value: "+gstr.getOb());
	}
}

class  genClass<T>{
	T ob;
	genClass(T o){
		ob=o;
	}
	
	T getOb(){
		return ob;
	}
	
	void showType() {
		System.out.println("The type of ob is: "+ob.getClass().getName());
	}
	
}


