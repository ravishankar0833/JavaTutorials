package LambdaExpression;

public class _3_BasicExampleWithMultipleParams3 {
	
	public static void main(String[] args) {
		funcInt2<String> val=(v,n)->{
			System.out.println(v);
			System.out.println(n);
		};
		
		val.getValue("Test", 10);
	}

}

interface funcInt2<T>{
	void getValue(T v,int n);
}

