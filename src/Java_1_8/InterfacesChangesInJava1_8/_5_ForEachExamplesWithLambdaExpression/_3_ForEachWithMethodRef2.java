package Java_1_8.InterfacesChangesInJava1_8._5_ForEachExamplesWithLambdaExpression;

import java.util.Arrays;
import java.util.List;

public class _3_ForEachWithMethodRef2 {
	
	public static void main(String[] args) {
		List<Integer> values=Arrays.asList(1,2,3,4);
		
		//one way of calling custom print
		values.forEach(_3_ForEachWithMethodRef2::doubleit);
		
	}
	
	public static void doubleit(int i){
		System.out.println(i*2);
	}

}
