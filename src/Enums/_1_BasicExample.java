package Enums;

public class _1_BasicExample {
	
	public static void main(String[] args) {
		Apple op;
		
		op=Apple.RedDel;
		System.out.println("value of op is: "+op);
		
		op=Apple.GoldenDel;
		if(op==Apple.GoldenDel) {
			System.out.println("op contains GoldenDel");
		}
		
		switch(op){
			case Jonathan:
				System.out.println("jonathan Is Red");
				break;
			case GoldenDel:
				System.out.println("GoldenDel Is golden");
				break;
			case RedDel:
				System.out.println("RedDel Is Red");
				break;
			case Winesap:
				System.out.println("Winesap Is Wine");
				break;
			case Cortland:
				System.out.println("Cortland Is Yellow");
				break;
		}
	}
	

}
