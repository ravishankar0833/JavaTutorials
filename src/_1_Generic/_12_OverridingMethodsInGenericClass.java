package _1_Generic;

public class _12_OverridingMethodsInGenericClass {
	
	public static void main(String[] args) {
		Gen22<Integer> g=new Gen22<Integer>();
		g.myMethod(10,20);
		System.out.println("val1 is: "+g.getOb());
		System.out.println("val2 is: "+g.getOb2());
	}

}

class Gen1<T>{
	private T ob; 
	void myMethod(T ob){
		this.ob=ob;
	}
	T getOb(){
		return ob;
	}
}

class Gen22<T> extends Gen1<T>{
	private T ob2;
	void myMethod(T ob,T ob2) {
		super.myMethod(ob);
		this.ob2=ob2;
	}
	
	T getOb2() {
		return ob2;
	}
}
