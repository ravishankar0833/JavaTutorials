package _1_Generic;

public class _2_MultipleParamsGenericClass {
	public static void main(String[] args) {
		genClass1<Integer,Double> gi=new genClass1<Integer,Double>(10,12.34);
		
		gi.showType();
		System.out.println("value ob1 is:"+gi.getOb1());
		System.out.println("value ob2 is:"+gi.getOb2());
		
		genClass1<String,Integer> gstr=new genClass1<>("Stroing",11);
		
		gstr.showType();
		System.out.println("value ob1 is:"+gstr.getOb1());
		System.out.println("value ob2 is:"+gstr.getOb2());
		
		genClass1<Integer,Integer> gi2=new genClass1<>(1122,11);
		
		gi2.showType();
		System.out.println("value ob1 is:"+gi2.getOb1());
		System.out.println("value ob2 is:"+gi2.getOb2());
	}
}

class  genClass1<T,V>{
	T ob1;
	V ob2;
	genClass1(T ob1,V ob2){
		this.ob1=ob1;
		this.ob2=ob2;
	}
	
	T getOb1(){
		return ob1;
	}
	
	V getOb2(){
		return ob2;
	}
	
	void showType() {
		System.out.println("The type of ob1 is: "+ob1.getClass().getName());
		System.out.println("The type of ob2 is: "+ob2.getClass().getName());
	}
	
}


