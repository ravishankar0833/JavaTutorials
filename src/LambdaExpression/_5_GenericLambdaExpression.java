package LambdaExpression;

public class _5_GenericLambdaExpression {

	public static void main(String[] args) {
		funct<Integer> Fact=(num)->{
			int f=1;
			for(int i=1;i<=num;i++) {
				f*=i;
			}
			return f;
		};
		
		System.out.println("The factorial of num 5 is "+Fact.SomeFunc(5));
		
		funct<String> revstr=(s)->{
			String str="";
			for(int i=s.length()-1;i>-1;i--) {
				str+=s.charAt(i);
			}
			
			return str;
		};
		
		System.out.println("The reversed string of Lambda is "+revstr.SomeFunc("Lambda"));
	}
}

interface funct<T>{
	T SomeFunc(T t);
}
