package LambdaExpression;

public class _10_ConstructorRefExample1 {
	public static void main(String[] args) {
		
		
		MyFunc myClassCons=Myclass::new;
		Myclass mc=myClassCons.func(100);
		System.out.println("The valu is:"+mc.getValue());
		
		Myclass c=new Myclass(10000);
		System.out.println("The valu is:"+c.getValue());
	}
}

interface MyFunc{
	Myclass func(int n);
}

class Myclass{
	private int val;
	Myclass(int val){
		this.val=val;
	}
	int getValue(){
		return val;
	}
}
