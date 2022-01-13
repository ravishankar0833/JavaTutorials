package InnerClass;

public class _2_AnonymousClass {
	
	public static void main(String[] args) {
		
		D a=new Demo()
		//This is anoynomus class declaration
		{
			
			void show(){
				System.out.println("Hello");
			}
			
		};
		
		a.show();
		
	}

}

class D{
	
	void show(){
		System.out.println("Hi");
	}
}

class Demo extends D{
	void call(){
		System.out.println("call");
	}
	
	void show(){
		System.out.println("Demo show");
	}
}
