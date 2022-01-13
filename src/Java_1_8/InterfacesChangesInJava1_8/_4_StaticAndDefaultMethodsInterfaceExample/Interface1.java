package Java_1_8.InterfacesChangesInJava1_8._4_StaticAndDefaultMethodsInterfaceExample;

public interface Interface1 {
	
	int add(int a,int b);
	
	default int sub(int a, int b){
		return a-b;
		
	}
	
	//Method declaration with diff parameters works!!!!!!
	default int sub(int a, int b, int c){
		return a-b-c;
		
	}
	
	//Method declaration with different type does not work in interface!!!!!!
	default long sub(long a, int b){
		return a-b;
		
	}
	
	static void show(){
		System.out.println("I1");
	}

}

