package LambdaExpression;

public class _4_BlockLambdaExpression {
	public static void main(String[] args) {
		Fact<Integer> fact=(num)->{
			double f=1.0;
			for(int i=1;i<=num;i++) {
				f*=i;
			}
			return f;
		};
		
		System.out.println("The factorial of num 5 is: "+ fact.fact(5));
	}
}

interface Fact<T extends Comparable<T>>{
	double fact(T n);
}
