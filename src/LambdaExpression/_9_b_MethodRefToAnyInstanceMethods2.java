package LambdaExpression;

public class _9_b_MethodRefToAnyInstanceMethods2 {
	
	static int someFunc(Funct111 f,int n) {
		return f.func(n);
	}
	public static void main(String[] args) {
		
		IntFunc f=new IntFunc();
		System.out.println("This is the double value ogf 10: "
				+someFunc(f::doubleIntvalue,10) );
		
		System.out.println("This is the squared value ogf 10: "
				+someFunc(f::SquaredIntValue,10) );
		
		System.out.println("This is the squareRoot value ogf 9: "
				+someFunc(IntFunc::squareRootValue,9) );
	}
}


interface Func1{
	int func(int n);
}

class IntFunc {
	// This is the static method implementation
	int doubleIntvalue(int n){
		return n+n;
	}
	
	int SquaredIntValue(int n) {
		return n*n;
	}
	
	static int squareRootValue(int n) {
		return (int) Math.sqrt(n);
	}
}
