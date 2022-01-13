package Exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoException {
	
	public static void main(String[] args) {
		
		int i=0;
		int j=0;
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		try{
			System.out.println("Input the first integer");
			i=Integer.parseInt(br.readLine());

			System.out.println("Input the second integer");
			j=Integer.parseInt(br.readLine());
			
			System.out.println(i+j);
			
			if(i<j){
				throw new MyException("i should not be greater than j value");
			}
			
		}catch(MyException e){
			System.out.println("This is unchecked exception");
			System.out.println(e);
		}catch(NumberFormatException e) {
			e.printStackTrace();
			System.out.println("This is Number format exception");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally{
			System.out.println("This is finally Block");
		}
		
		
	}

}

class MyException extends Exception{
	MyException(String msg){
		System.out.println("This is the message for user defined exception");
	}
}
