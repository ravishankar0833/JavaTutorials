package LambdaExpression;

public class _9_b_MethodRefToInstanceMethods1 {
	
	static int someFunc(Funct111 f,int n) {
		return f.func(n);
	}
	public static void main(String[] args) {
		
		IntFunct f=new IntFunct();
		System.out.println("This is the double value ogf 10: "
				+someFunc(f::doubleIntvalue,10) );
	}
}


interface Funct111{
	int func(int n);
}

class IntFunct {
	// This is the static method implementation
	int doubleIntvalue(int n){
		return n+n;
	}
}
