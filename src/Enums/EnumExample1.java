package Enums;

public class EnumExample1 {
	
	static enum Days{
		MONDAY("45"), TUESDAY("88"),WEDNESDAY;
		
		int Times;
		
		Days(){
			System.out.println("Defaukt time is 1:00PM");
		}
		Days(String Times){
			System.out.println(this.Times);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(EnumExample1.Days.MONDAY);
	}
	
	

}

enum Mobile{
	APPLE,SAMSUNG,ONEPLUS
}
