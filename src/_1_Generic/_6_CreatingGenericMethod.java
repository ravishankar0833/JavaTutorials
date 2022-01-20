package _1_Generic;

public class _6_CreatingGenericMethod {
	
	
	public static void main(String[] args) {
		GenCons<Integer> g=new GenCons<Integer>(10);
		
		System.out.println("value is "+g.getValue());
		
		GenCons<Double> g1=new GenCons<Double>(1.2);
		
		System.out.println("value is "+g1.getValue());
	}

}

class GenCons<T extends Number>{
	T ob;
	
	GenCons(T ob){
		this.ob=ob;
	}
	
	T getValue(){
		return ob;
	}
}
