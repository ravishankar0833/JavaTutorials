package _OOPS_;

public class Person {
	
	private String firstName;
	private String lastName;
	private int age;
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getAge() {
		return age;
	}
	public void setFirstName(String fName) {
		firstName=fName;
	}
	public void setLastName(String lName) {
		lastName=lName;
	}
	public void setAge(int age) {
		if(age>0 && age<=100)
		    this.age=age;
		else
		    this.age=0;
	}
	
	public boolean isTeen() {
		if(age>12 && age <20)
			return true;
		else 
			return false;
	}
	
	public String getFullName() {
		if(firstName.isEmpty()&&lastName.isEmpty()) {
			return "";
		}else if(lastName.isEmpty())
			return firstName;
		else if(firstName.isEmpty())
			return lastName;
		else
			return firstName+" "+lastName;
	}

}
