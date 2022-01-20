package I_O_Basics;

public class _3_NativeMethods {
	
	int i;
	
	public static void main(String[] args) {
		_3_NativeMethods nm=new _3_NativeMethods();
		nm.i=3;
		
		System.out.println("This is before native method is called:"+nm.i);
		nm.test();
		
		System.out.println("This is after native method is called:"+nm.i);
	}	
	public native void test();
		static {
			System.out.println("nativeDemo");
			//series of complex to be followed
		}
	}


