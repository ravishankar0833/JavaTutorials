package Java_1_8.InterfacesChangesInJava1_8._2_DefaultMethodsInterfaceExample;



/* Mulitple interfaces implementation is not possible if we have same method
 * in both the interfaces.
 * So we have to either implement only one interface or else have unique default methods in both interface
 * 
*/
//public class ImplementedClass implements Interface1,Interface2{

public  class _2_ImplementedClass2 implements Interface2, Interface3{

	
	public static void main(String[] args) {
		
		Interface2 I2=new _2_ImplementedClass2();
		I2.show();
		
		Interface3 I3=new _2_ImplementedClass2();
		I3.show2();
		
	}

}
