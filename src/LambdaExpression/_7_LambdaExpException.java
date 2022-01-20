package LambdaExpression;

public class _7_LambdaExpException {
	public static void main(String[] args) throws EmptyArrayException {
		
		
		DoubleNumericArrayFunction dval=(r)->{
			
				if(r.length==0) {
					throw new EmptyArrayException();
				}
			double sum=0.0;
			
			
			for(int i=0;i<r.length;i++) {
				sum += r[i];
			}
			
			return sum/r.length;
		};
		double[] d= {1.5,2.5,6.5};
		System.out.println("The avergae of non empty double array is: "+dval.func(d));
		
		double[] d1= {};
		System.out.println("The avergae of empty double array is: "+dval.func(d1));
	}
}

interface DoubleNumericArrayFunction{
	double func(double[] r) throws EmptyArrayException;
}

class EmptyArrayException extends Exception{
	EmptyArrayException(){
		super("Array is Empty");
	}
}
