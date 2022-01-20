package LambdaExpression;

public class _6_LambdaExpAsArguments {
	
	static String SomeFunc(StringFunc sf, String str) {
		return sf.Func(str);
	}
	
	public static void main(String[] args) {
		String inStr=" Lambda is power to Java";
		System.out.println("Input String is: "+ inStr);
		
		String outStr=SomeFunc((s)->s.toUpperCase(), inStr);
		
		System.out.println("The String in UpperCase is: "+outStr);
		
		outStr=SomeFunc((s)->{
			String st="";
			for(int i=0;i<=s.length()-1;i++) {
				if(s.charAt(i)!=' ') {
					st += s.charAt(i);
				}
			}
			return st;
		},inStr);
		
		System.out.println("The string with spaces removed is "+outStr);
		
		StringFunc revstr=(s)->{
			String str="";
			for(int i=s.length()-1;i>-1;i--) {
				str+=s.charAt(i);
			}
			
			return str;
		};
		
		System.out.println("The string reversed is "+revstr.Func(inStr));
		
	}

}

interface StringFunc{
	String Func(String n);
}
