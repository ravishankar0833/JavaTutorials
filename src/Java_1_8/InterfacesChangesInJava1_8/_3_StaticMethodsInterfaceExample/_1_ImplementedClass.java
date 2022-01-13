package Java_1_8.InterfacesChangesInJava1_8._3_StaticMethodsInterfaceExample;



/* Mulitple interfaces implementation is not possible if we have same method
 * in both the interfaces.
 * So we have to either implement only one interface or else have unique default methods in both interface
 * 
*/
//public class ImplementedClass implements Interface1,Interface2{

public  class _1_ImplementedClass implements Interface1{

	
	public static void main(String[] args) {
		
		Interface1.show();
	}

	@Override
	public int add() {
		return 0;
	}

}
