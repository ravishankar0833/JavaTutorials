package _1_Generic;

public class Teacher {

	private String name;
	private String teacherType;

	
	public Teacher(String name, String teacherType) {
		super();
		this.name = name;
		this.teacherType = teacherType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeacherType() {
		return teacherType;
	}

	public void setTeacherType(String teacherType) {
		this.teacherType = teacherType;
	}

	@Override
	public String toString() {
		return "Teacher [name=" + name + ", teacherType=" + teacherType + "]";
	}

}
