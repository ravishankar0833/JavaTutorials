package LambdaExpression;

public class _8_VariableCapture {
	public static void main(String[] args) {
		int num=10;
		Functions s=(n)->{
			n=num+10;
			
			//Error
			//Local variable num defined in an enclosing scope must be final or effectively final
			//num++;
			
			return n;
		};
		
		//if we uncomment this line then n=num+10 will give error
		//as local var num will loose its final status
		//num=12;
	}
}

interface Functions{
	int somefunc(int n);
}
