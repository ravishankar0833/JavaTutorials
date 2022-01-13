package _1_DataTypes;


//Compute distance light travels using long variable
public class Light {
	public static void main(String[] args) {
		int lightspeed;
		long days;
		long seconds;
		long distance;
		
		//approximate speed of light in niles per second
		lightspeed=186000;
		
		days=1000;
		
		seconds=days*24*60*60;
		
		distance = lightspeed*seconds;
		
		System.out.print("In "+days);
		System.out.print(" days light will travel about ");
		System.out.println(distance +" miles. ");
		
	}
}
