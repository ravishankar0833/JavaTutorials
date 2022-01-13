package Java_1_8.InterfacesChangesInJava1_8._4_StaticAndDefaultMethodsInterfaceExample;



/* Mulitple interfaces implementation is not possible if we have same method
 * in both the interfaces.
 * So we have to either implement only one interface or else have unique default methods in both interface
 * 
*/
//public class ImplementedClass implements Interface1,Interface2{

public  class _1_ImplementedClass implements Interface1{

	
	public static void main(String[] args) {
		//For static methods
		Interface1.show();
		
		//For Default methods we have to declare a ref variable
		Interface1 I1=new _1_ImplementedClass();
		System.out.println(I1.sub(1,2));
		System.out.println(I1.sub(1,2,3));
		System.out.println(I1.add(1,2));
		
	}

	@Override
	public int add(int a,int b) {
		return a-b;
	}

}
