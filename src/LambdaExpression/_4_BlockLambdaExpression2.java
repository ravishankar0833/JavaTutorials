package LambdaExpression;

public class _4_BlockLambdaExpression2 {
	public static void main(String[] args) {
		
		Reverse revstr=(s)->{
			String str="";
			for(int i=s.length()-1;i>-1;i--) {
				str+=s.charAt(i);
			}
			
			return str;
		};
		
		System.out.println("The reversed string of Lambda is "+revstr.getReversedString("Lambda"));
	}
}

interface Reverse{
	String getReversedString(String str);
}
