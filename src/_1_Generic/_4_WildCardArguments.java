package _1_Generic;

public class _4_WildCardArguments {
	public static void main(String[] args) {
		Integer[] arr= {1,2,3,4,5};
		genClass3<Integer> gi=new genClass3<Integer>(arr);
		
		System.out.println("The average is "+gi.avg());
		
		Double[] arr1= {1.0,2.0,3.0,4.0,5.0};
		genClass3<Double> gi2=new genClass3<Double>(arr1);
		
		System.out.println("The average is "+gi2.avg());
		
		if(gi.sameavg(gi2)) {
			System.out.println("The avg are same");
		}else {
			System.out.println("The avg is not same");
		}
	}
}

class  genClass3<T extends Number>{
	T[] ob1;
	
	genClass3(T[] ob1){
		this.ob1=ob1;
	}

	double avg(){
		Double sum=0.0;
		for(T ob:ob1) {
			//.doubleValue method will be avialble only when T extends Number
			//Because direct T doesnt know ob is og which type suppose if T 
			//is String we can have doublevalue method
			sum += ob.doubleValue();
		}
		return sum/ob1.length;
	}
	
	Boolean sameavg(genClass3<?> obj){
		
		if(avg()==obj.avg()) {
			return true;
		}else {
			return false;
		}
			
	}
	
}


