package _1_Generic;

public class _3_BoundedTypesExample {
	public static void main(String[] args) {
		Integer[] arr= {1,2,3,4,5};
		genClass2<Integer> gi=new genClass2<Integer>(arr);
		
		System.out.println("The average is "+gi.avg());
		
		Double[] arr1= {1.1,2.2,3.3,4.4,5.5};
		genClass2<Double> gi2=new genClass2<Double>(arr1);
		
		System.out.println("The average is "+gi2.avg());
	}
}

class  genClass2<T extends Number>{
	T[] ob1;
	
	genClass2(T[] ob1){
		this.ob1=ob1;
	}

	Double avg(){
		Double sum=0.0;
		for(T ob:ob1) {
			//.doubleValue method will be avialble only when T extends Number
			//Because direct T doesnt know ob is og which type suppose if T 
			//is String we can have doublevalue method
			sum += ob.doubleValue();
		}
		return sum/ob1.length;
	}
	
}


