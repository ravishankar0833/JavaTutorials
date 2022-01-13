package Java_1_8.InterfacesChangesInJava1_8._5_ForEachExamplesWithLambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class _1_DifferentImplementationExamples {
	
	public static void main(String[] args) {
		List<Integer> values=Arrays.asList(1,2,3,4);
		
		
		System.out.println("This is direct lambda expression");
		//for each with lambda expression
		values.forEach(i-> System.out.println(i));
		
		
		System.out.println("This is with consumer interface");
		
		
		//For each method with Consumer interface implementation explanation
		Consumer<Integer> c=new Consumer<Integer>(){

			@Override
			public void accept(Integer i) {
				System.out.println(i*2);
				
			}
			
		};
		
		values.forEach(c);
		
		//For each method with reduced code in lambda expression for consumer interface
		
		System.out.println("This is with consumer interface with reduced code and lambda expression");
		Consumer<Integer> c1=i-> System.out.println(i*2);
		
		values.forEach(c1);
	}

}


