package _1_Generic;

public class _11_GenericTypeComaparations {

	public static void main(String[] args) {
		genClass111<Integer> i=new genClass111<Integer>(10);
		genClass111<Integer> i2=new genClass111<Integer>(10);
		genClass111<String> s=new genClass111<String>("test");
		
		if(i instanceof genClass111<?>) {
			System.out.println("i is of genClass111 type");
		}
		
		if(i2 instanceof genClass111<?>) {
			System.out.println("i2 is of genClass111 type");
		}
		
		if(s instanceof genClass111<?>) {
			System.out.println("s is of genClass111 type");
		}
		
		//This cannot be done as the comparasion will be done only for generic type
		//Uncomment and check for error
		/*
		 * if(s instanceof genClass111<String>) {
		 * System.out.println("s is of genClass111 type"); }
		 */
		
		
	}
}

class  genClass111<T>{
	T ob;
	genClass111(T o){
		ob=o;
	}
	
	T getOb(){
		return ob;
	}
	
}
