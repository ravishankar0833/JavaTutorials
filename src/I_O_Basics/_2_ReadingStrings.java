package I_O_Basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2_ReadingStrings {
	
	public static void main(String[] args) throws IOException {
		String c;
		System.out.println("Enter the characters");
		System.out.println("enter 'stop' to quit");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		do{
			
			c=br.readLine();
			System.out.println(c);
			
		}while(c.equals("stop"));
	}


}
