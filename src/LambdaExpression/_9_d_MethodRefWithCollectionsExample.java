package LambdaExpression;

import java.util.ArrayList;
import java.util.Collections;

public class _9_d_MethodRefWithCollectionsExample {
	
	static int CompareMC(MyClass12 a,MyClass12 b) {
		return a.getValue()-b.getValue();
	}
	
	public static void main(String[] args) {
		ArrayList<MyClass12> arr=new ArrayList<MyClass12>();
		arr.add(new MyClass12(10));
		arr.add(new MyClass12(20));
		arr.add(new MyClass12(30));
		arr.add(new MyClass12(40));
		
		MyClass12 obj=Collections.max(arr,_9_d_MethodRefWithCollectionsExample::CompareMC);
		
		System.out.println("Max value is "+obj.getValue());
		
		
		
	}
}

class MyClass12{
	private int val;
	
	MyClass12(int val){
		this.val=val;
		
	}
	
	int getValue(){
		return val;
	}
	
}

