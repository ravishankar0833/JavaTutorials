package Java_1_8.InterfacesChangesInJava1_8._1_MultipleInteferanceProblemSolution;

public class ImplementedClass implements Interface1,Interface2{

	@Override
	public void show() {
		System.out.println("This is the overrided methodaaa");
		
	}
	

	@Override
	public void wcall() {
		System.out.println("This is whatsapp call");
		
	}

	@Override
	public void call() {
		System.out.println("normal calling");
		
	}

	@Override
	public void vcall() {
		System.out.println("video calling");		
	}
	

	public static void main(String[] args) {
		
		System.out.println("********************");
		System.out.println("Interface1");
		Interface1 i1=new ImplementedClass();
		i1.show();
		i1.call();
		i1.vcall();
		
		System.out.println("********************");
		System.out.println("Interface2");
		Interface2 i2=new ImplementedClass();
		i2.show();
		i2.call();
		i2.wcall();
	}

}
