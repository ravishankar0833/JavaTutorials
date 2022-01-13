package ObjectCloning;

public class ObjectCloningMethod {
	
	public static void main(String[] args) {
		
		DemoClone obj=new DemoClone();
		
		obj.i=4;
		obj.j=5;
		
		DemoClone obj1=(DemoClone) obj.clone();
		
		System.out.println(obj.i);
		System.out.println(obj.j);
		System.out.println(obj1.i);
		System.out.println(obj1.j);
		
		obj1.i=2;
		System.out.println("CLoning method-Change in one value");
		System.out.println(obj.i);
		System.out.println(obj.j);
		System.out.println(obj1.i);
		System.out.println(obj1.j);
		
	}

}


//Only Overriding clone method does not work as the clone method in objet call is protected.
//So we have to implement Marker interface Cloneable.
//Why the Clone is protected ?
//Because if all the object are allowed to clone then hackers can create a duplicate and hack the software.
//So we have to explictly implemet cloneable interface
class DemoClone implements Cloneable{
	int i;
	int j;
	
	@Override
	public Object clone(){
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}
}
