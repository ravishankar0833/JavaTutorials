package _1_Generic;

public class ControlClass {

	public <E> void verify(E s){
		System.out.println("The name is: "+s.toString());
	}
}
