package _1_Generic;

public class _7_CreatingGenericConstructor {
	
	static<T,V extends T> boolean isIn(T[] arr,V val){
		for(int i=0;i<arr.length;i++) {
			if(arr[i].equals(val)) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		Integer[] nums= {1,2,3,4,5};
		
		if(isIn(nums,2)) {
			System.out.println("2 is in nums");
		}
		
		if(!isIn(nums,10)) {
			System.out.println("10 is not in nums");
		}
		
		
		String[] strs= {"asd","qwe"};
		
		if(isIn(strs,"asd")) {
			System.out.println("asd is in strs");
		}
		
		if(!isIn(strs,"zxc")) {
			System.out.println("zxc is not in strs");
		}
	}

}
