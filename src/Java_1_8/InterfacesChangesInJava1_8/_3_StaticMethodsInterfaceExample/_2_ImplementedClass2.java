package Java_1_8.InterfacesChangesInJava1_8._3_StaticMethodsInterfaceExample;



/* Mulitple interfaces implementation is not possible if we have same method
 * in both the interfaces.
 * So we have to either implement only one interface or else have unique default methods in both interface
 * 
*/
//public class ImplementedClass implements Interface1,Interface2{

public  class _2_ImplementedClass2 implements Interface2, Interface3{

	
	public static void main(String[] args) {
		Interface2.show();
		
		Interface3.show2();
		
	}

}
