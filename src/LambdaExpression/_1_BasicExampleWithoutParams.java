package LambdaExpression;

public class _1_BasicExampleWithoutParams {
	
	public static void main(String[] args) {
		funcInt val=()->12.4;
		System.out.println(val.getValue());
		
		val=()->12.43;
		System.out.println(val.getValue());
	}

}

interface funcInt{
	double getValue();
}
