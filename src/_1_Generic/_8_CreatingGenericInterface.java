package _1_Generic;

public class _8_CreatingGenericInterface {
	
	public static void main(String[] args) {
		
		Integer arr[]= {1,2,3,4,5};
		Imp<Integer> a1=new Imp<Integer>(arr);
		
		System.out.println(" min value is "+a1.min());
		System.out.println(" max value is "+a1.max());
		
		Character chars[]= {'a','c','e'};
		Imp<Character> c1= new Imp<Character>(chars);
		
		System.out.println(" min value is "+c1.min());
		System.out.println(" max value is "+c1.max());
	}
	
}

interface genInt<T extends Comparable<T>>{
	T min();
	T max();
}

class Imp<T extends Comparable<T>> implements genInt<T>{
	T[] arr;
	
	Imp(T[] arr){
		this.arr=arr;
	}

	@Override
	public T min() {
		T m=arr[0];
		for(T v:arr) {
			if(v.compareTo(m)<0) m=v;
		}
		return m;
	}

	@Override
	public T max() {
		T m=arr[0];
		for(T v:arr) {
			if(v.compareTo(m)>0) m=v;
		}
		return m;
	}
	
}