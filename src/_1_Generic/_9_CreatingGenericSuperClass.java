package _1_Generic;

public class _9_CreatingGenericSuperClass {
	public static void main(String[] args) {
		GenSupClass<Integer> g=new GenSupClass<Integer>(10);
		System.out.println("value is "+g.getOb());
		
		SubClass<Double> g1=new SubClass<Double>(10.4);
		System.out.println("value is "+g1.getOb());
		
		Gen2<String,Double> g2=new Gen2<String,Double>("test",10.4);
		System.out.println("value is "+g2.getOb()+" and "+g2.ob2);
	}
}

class GenSupClass<T>{
	T ob;
	
	GenSupClass(T ob){
		this.ob=ob;
	}
	
	T getOb(){
		return ob;
	}
}

class SubClass<T> extends GenSupClass<T>{

	SubClass(T ob) {
		super(ob);
	}
	
}

class Gen2<T,V> extends SubClass<T>{
	V ob2;
	Gen2(T ob,V ob2) {
		super(ob);
		this.ob2=ob2;
	}
	
	T getObject(){
		return ob;
	}
	
	V getObject2(){
		return ob2;
	}
	
}