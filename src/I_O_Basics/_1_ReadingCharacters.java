package I_O_Basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1_ReadingCharacters {
	
	
	
	public static void main(String[] args) throws IOException {
		char c;
		System.out.println("Enter the characters");
		System.out.println("press 'q' to quit");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		do{
			
			c=(char) br.read();
			System.out.println(c);
			
		}while(c!='q');
	}


}
