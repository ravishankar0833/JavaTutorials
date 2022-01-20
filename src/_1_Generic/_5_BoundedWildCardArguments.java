package _1_Generic;



public class _5_BoundedWildCardArguments {
	
	static void ShowXY(Coords<?> c) {
		System.out.println("2D X and Y");
		for(int i=0;i<c.ob.length;i++) {
			System.out.println(c.ob[i].x+"  "+c.ob[i].y);
		}
	}
	
	static void ShowXYZ(Coords<? extends ThreeD> c) {
		System.out.println("2D X and Y and Z");
		for(int i=0;i<c.ob.length;i++) {
			System.out.println(c.ob[i].x+"  "+c.ob[i].y+"  "+c.ob[i].z);
		}
	}
	
	static void ShowXYZF(Coords<? extends FourD> c) {
		System.out.println("2D X and Y and Z and F");
		for(int i=0;i<c.ob.length;i++) {
			System.out.println(c.ob[i].x+"  "+c.ob[i].y+"  "+c.ob[i].z+"  "+c.ob[i].f);
		}
	}
	
	public static void main(String[] args) {
		TwoD[] f2d= {new TwoD(1,2),new TwoD(1,2)};
		ThreeD[] f3d= {new ThreeD(1,2,3),new ThreeD(1,2,2)};
		FourD[] f4d= {new FourD(1,2,3,4),new FourD(1,2,4,3)};
		
		Coords<TwoD> c2=new Coords<TwoD>(f2d);
		Coords<ThreeD> c3=new Coords<ThreeD>(f3d);
		Coords<FourD> c4=new Coords<FourD>(f4d);
		
		ShowXY(c2);
		ShowXYZ(c3);
		ShowXYZF(c4);
		
	}
	
}

class Coords<T extends TwoD>{
	T[] ob;
	Coords(T[] ob){
		this.ob=ob;
	}
}

class TwoD{
	int x;
	int y;
	
	TwoD(int x,int y){
		this.x=x;
		this.y=y;
	}
}

class ThreeD extends TwoD{
	int z;
	
	ThreeD(int x,int y,int z ){
		super(x, y);
		this.z=z;
	}
}

class FourD extends ThreeD{
	int f;
	
	FourD(int x,int y,int z,int f ){
		super(x, y,z);
		this.f=f;
	}
}

