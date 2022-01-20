package Enums;

public class _4_EnumConstructor {
	
	public static void main(String[] args) {
		
		//Apple1[] a1 = Apple1.values();
		//System.out.println("Before");
		for(Apple1 a:Apple1.values()) {
			System.out.println("price of "+a.name()+"is "+a.getPrice()+" and its ordinal is "+a.ordinal());
			
		}
		
	}
	

}

enum Apple2{
	Jonathan(10), GoldenDel(11), RedDel(22), Winesap(25), Cortland;
	private int price;
	
	Apple2() {
		price=-1;
		System.out.println("This is default price: "+-1);
	}
	
	Apple2(int n){
		price=n;
		System.out.println("The price of "+Apple2.this+" is: "+n);
	}
	
	int getPrice(){
		return price;
	}
	
	
	
}
