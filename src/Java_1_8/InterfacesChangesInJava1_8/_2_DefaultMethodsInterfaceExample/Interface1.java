package Java_1_8.InterfacesChangesInJava1_8._2_DefaultMethodsInterfaceExample;

public interface Interface1 {
	
	int add();
	
	default void show(){
		System.out.println("I1");
	}

}

