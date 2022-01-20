package LambdaExpression;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class _12_PredefinedFuncInts {
	
	public static void main(String[] args) {
		UnaryOperator<Integer>  u=x-> x*2;
		System.out.println(u.apply(100));
		
		BinaryOperator<Integer> b= (x,y)-> x+y;
		System.out.println(b.apply(100,200));
		
		
	}

}


