package Enums;

public class _3_EnumAreClassTypes {
	
	public static void main(String[] args) {
		
		//Apple1[] a1 = Apple1.values();
		//System.out.println("Before");
		for(Apple1 a:Apple1.values()) {
			System.out.println("price of "+a.name()+"is "+a.getPrice());
		}
		
	}
	

}

enum Apple1{
	Jonathan(10), GoldenDel(11), RedDel(22), Winesap(25), Cortland;
	private int price;
	
	Apple1() {
		System.out.println("This is default price: "+0.0);
	}
	
	Apple1(int n){
		price=n;
		System.out.println("The price of "+Apple1.this+" is: "+n);
	}
	
	int getPrice(){
		return price;
	}
	
	
	
}
