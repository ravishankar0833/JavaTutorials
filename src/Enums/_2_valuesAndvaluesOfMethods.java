package Enums;

public class _2_valuesAndvaluesOfMethods {
	
	public static void main(String[] args) {
		
		//values method
		System.out.println("values method--->");
		for(Apple a:Apple.values()) {
			System.out.println(a);
		}
		
		System.out.println("valuesOf method--->");
		System.out.println(Apple.valueOf("Winesap"));
		
	}
	

}
