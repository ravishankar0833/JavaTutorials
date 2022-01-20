package LambdaExpression;

public class _2_BasicExampleWithParams2 {
	
	public static void main(String[] args) {
		funcInt1 val=(n)->(n%2)==0;
		System.out.println(val.getValue(12));
		
		val=(n)->(n%2!=0);
		System.out.println(val.getValue(13));
		
		genFuncInt<Integer> val1=()->12;
		System.out.println(val1.getValue());
		
		genFuncInt<String> val2=()->"12.2";
		System.out.println(val2.getValue());
	}

}

interface funcInt1{
	boolean getValue(int n);
}

interface genFuncInt<T>{
	T getValue();
}
