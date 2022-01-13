package _1_Generic;

public class Staff {

	private String name;
	private String jobType;

	public Staff(String name, String jobType) {
		super();
		this.name = name;
		this.jobType = jobType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJobType() {
		return jobType;
	}

	public void setJobType(String jobType) {
		this.jobType = jobType;
	}

	@Override
	public String toString() {
		return "Staff [name=" + name + ", jobType=" + jobType + "]";
	}

}
