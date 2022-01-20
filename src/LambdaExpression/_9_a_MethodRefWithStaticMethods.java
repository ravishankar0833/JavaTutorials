package LambdaExpression;

public class _9_a_MethodRefWithStaticMethods {
	
	static int someFunc(Funct11 f,int n) {
		return f.func(n);
	}
	public static void main(String[] args) {
		System.out.println("This is the double value ogf 10: "
				+someFunc(IntFunctions::doubleIntvalue,10) );
		
		Funct11 ff=IntFunctions::doubleIntvalue;
		
		System.out.println("This is the double value ogf 10: "
				+ff.func(10000));
	}
}


interface Funct11{
	int func(int n);
}

class IntFunctions {
	// This is the static method implementation
	static int doubleIntvalue(int n){
		return n+n;
	}
}
