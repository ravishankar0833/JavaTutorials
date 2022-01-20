package _1_Generic;

public class _10_CreatingGenericSubclass {
	public static void main(String[] args) {
		G2<String> g=new G2<String>("test",10);
		System.out.println(g.ob+" "+g.num);
	}
	

}

class G1{
	int num;
	
	G1(int n){
		num=n;
	}
	
	int getValue(){
		return num;
	}
}

class G2<T> extends G1{
	T ob;
	G2(T ob,int n) {
		super(n);
		this.ob=ob;
	}
	
	T getObject(){
		return ob;
	}
	
}