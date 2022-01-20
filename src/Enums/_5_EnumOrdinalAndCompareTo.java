package Enums;

public class _5_EnumOrdinalAndCompareTo {
	
	public static void main(String[] args) {
		Apple ap,ap2,ap3;
		System.out.println("Here is all apple constant and their ordinal values");
		for(Apple a:Apple.values()) {
			System.out.println("price of "+a.name()+" and its ordinal is "+a.ordinal());
		}
		
		ap=Apple.RedDel;//3rd position
		ap2=Apple.GoldenDel;//2nd position
		ap3=Apple.RedDel;
		
		if(ap.compareTo(ap2)>0) {
			System.out.println("RedDel comes after GoldenDel");
		}
		
		if(ap2.compareTo(ap)<0) {
			System.out.println("GoldenDel comes after RedDel");
		}
		
		if(ap.compareTo(ap3)==0) {
			System.out.println("Both are RedDels");
		}
	}
	

}

