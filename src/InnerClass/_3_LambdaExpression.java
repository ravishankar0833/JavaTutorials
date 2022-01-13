package InnerClass;

public class _3_LambdaExpression {
	
	public static void main(String[] args) {
		I1 i=new demo1();
		i.show();
		
		//With lambda expression 
		//The interface should have only one abstract method that type of interface is called as 
		// Functional Interface
		I2 i1=()->{
			System.out.println("Calling in lambda expression");
		};
		
		i1.call();
	}

}

interface I1{
	
	void show();
	void call();
}

class demo1 implements I1{

	public void show() {
		System.out.println("Overideed show from demo class");
		
	}
	public void call() {
		System.out.println("Overideed show from demo class");
		
	}
}


// Interface with only one interface is called as Functional Interface
@FunctionalInterface
interface I2{
	void call();
}
