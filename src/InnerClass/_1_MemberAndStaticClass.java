package InnerClass;

public class _1_MemberAndStaticClass {
	
	public static void main(String[] args) {
		A a=new A();
		a.i=6;
		System.out.println(a.i);
		
		//Member class object creation
		A.B obj=a.new B();
		
		obj.show();
		
		//Static class object creation
		A.C c=new A.C();
		
		c.call();
		
	}

}

class A{
	int i=0;
	class B{
		void show(){
			System.out.println("Hello B");
		}
		void call(){
			System.out.println("Call B");
		}
	}
	
	static class C{
		void show(){
			System.out.println("Hello C");
		}
		void call(){
			System.out.println("calling C");
		}
	}
}
