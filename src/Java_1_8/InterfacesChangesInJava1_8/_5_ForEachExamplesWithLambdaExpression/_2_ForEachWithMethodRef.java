package Java_1_8.InterfacesChangesInJava1_8._5_ForEachExamplesWithLambdaExpression;

import java.util.Arrays;
import java.util.List;

public class _2_ForEachWithMethodRef {
	
	public static void main(String[] args) {
		List<Integer> values=Arrays.asList(1,2,3,4);
		
		values.forEach(System.out::println);
	}

}
