package Java_1_8.InterfacesChangesInJava1_8._1_MultipleInteferanceProblemSolution;

//Multiple inheritance not possible
//public class MultipleInheritanceExample extends c1,c2 {
public class _1_MultipleInheritanceExampleNotPossible extends c1{
	
	public static void main(String[] args) {
		c1 c=new c1();
		c.show();
	}

}


class c1{
	void show(){
		System.out.println("c1");
	}
}

class c2{
	void show(){
		System.out.println("c2");
	}
}
