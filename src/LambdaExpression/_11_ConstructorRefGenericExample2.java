package LambdaExpression;

public class _11_ConstructorRefGenericExample2 {
	public static void main(String[] args) {
		
		
		MyFunc2<String,Integer> myClassCons=Myclass2::new;
		Myclass2<String,Integer> mc=myClassCons.func("test",100);
		System.out.println("The valu is:"+mc.getTValue());
		System.out.println("The valu is:"+mc.getRValue());
	}
}

interface MyFunc2<T,R>{
	Myclass2 func(T n,R r);
}

class Myclass2<T,R>{
	private T val;
	private R r;
	Myclass2(T val,R r){
		this.val=val;
		this.r=r;
	}
	T getTValue(){
		return val;
	}
	
	R getRValue(){
		return r;
	}
}


