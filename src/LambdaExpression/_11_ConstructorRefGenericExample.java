package LambdaExpression;

public class _11_ConstructorRefGenericExample {
	public static void main(String[] args) {
		
		
		MyFunc1<Integer> myClassCons=Myclass1::new;
		Myclass1<Integer> mc=myClassCons.func(100);
		System.out.println("The valu is:"+mc.getValue());
		
		Myclass c=new Myclass(10000);
		System.out.println("The valu is:"+c.getValue());
	}
}

interface MyFunc1<T>{
	Myclass1 func(T n);
}

class Myclass1<T>{
	private T val;
	Myclass1(T val){
		this.val=val;
	}
	T getValue(){
		return val;
	}
}


