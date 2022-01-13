package ObjectCloning;

public class _1_ShallowAndDeepCopy {
	
	public static void main(String[] args) {
		
		A obj=new A();
		obj.i=4;
		obj.j=5;
		
		
		//Shallow copy
		//If we copy the object it is shallow copy
		//There will be only one object created i.e obj
		//There will be 2 reference to the obj
		System.out.println("SHALLOW COPY");
		A obj1=obj;
		System.out.println(obj.i);
		System.out.println(obj.j);
		System.out.println(obj1.i);
		System.out.println(obj1.j);
		
		//Change in one variable will change the obj variable in another object as well
		obj1.i=2;
		System.out.println("SHALLOW COPY-Change in one value");
		System.out.println(obj.i);
		System.out.println(obj.j);
		System.out.println(obj1.i);
		System.out.println(obj1.j);
		
		
		//DeepCopy-Copy each object variables one by one
		
		System.out.println("Deep COPY");
		A obj2=new A();
		obj2.i=obj.i;
		obj2.j=obj.j;
		
		System.out.println(obj.i);
		System.out.println(obj.j);
		System.out.println(obj2.i);
		System.out.println(obj2.j);
		
		//Change in one variable will not change the obj variable in another object
		obj2.i=9;
		System.out.println("Deep COPY-Change in one value");
		System.out.println(obj.i);
		System.out.println(obj.j);
		System.out.println(obj2.i);
		System.out.println(obj2.j);		
		
	}

}

class A{
	int i;
	int j;
	
}