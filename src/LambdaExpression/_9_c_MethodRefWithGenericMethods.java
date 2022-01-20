package LambdaExpression;

public class _9_c_MethodRefWithGenericMethods {
	
	static<T extends String ,V extends Number> V someFunc(GenFunct f,T n,V v) {
		return (V) f.func(n,v);
	}
	public static void main(String[] args) {
		GenFuncImpl g=new GenFuncImpl();
		
		System.out.println("This is the squared value ogf 9 : "
				+someFunc(g::SquaredIntValue,"squareroot",9) );
		
		System.out.println("This is the squared value ogf 9: "
				+someFunc(g::SquaredDoubledValue,"squareroot",9.0) );
	}
}


interface GenFunct<T extends String ,V extends Number>{
	V func(T n, V v);
}

class GenFuncImpl {
	// This is the static method implementation
	int doubleIntvalue(String opName,int n){
		return n+n;
	}
	
	<T,V> int SquaredIntValue(T opName,V n) {
		
		return (int)n^2;
	}
	
	<T,V> double SquaredDoubledValue(T opName,V n) {
		
		return (double)n*(double)n;
	}
	
}
