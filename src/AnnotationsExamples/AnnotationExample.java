package AnnotationsExamples;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class AnnotationExample {
	
	
	public static void main(String[] args) {
		Vehicle v=new Vehicle("Audi","4 Wheeler");
		
		Class a=v.getClass();
		Annotation an=a.getAnnotation(VehicleDetails.class);
		VehicleDetails vd=(VehicleDetails)an;
		System.out.println(vd.modelName());
	}

}

//This is multi values annotation as it is having multiple variables
@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface VehicleDetails{
	String modelName() default "v4";
	String fuelType() default "diesel";
}


@VehicleDetails(modelName="V9",fuelType="Petrol")
class Vehicle{
	
	String CompanyName;
	String VehicleType;
	
	public Vehicle(){
		
	}
	
	public Vehicle(String CompanyName, String VehicleType){
		this.CompanyName=CompanyName;
		this.VehicleType=VehicleType;
	}
	
}

class ElectricalVehicle extends Vehicle{

	
	
}

//Marker Annotation is the one which does not contain any variables inside it
/*@interface vehicleDetails{
	
}*/

//Single value annotation is the one which has one variable inside it
/*@interface VehicleDetails{
	String ModelName();
}*/


