package inputAndOutputWithFiles.q1;

public class Student {
	
	private int enroll;
	private String name;
	private double cr;
	
	Student(int enroll, String name, double cr){
		this.enroll = enroll;
		this.name = name;
		this.cr = cr;
	}

	public int getEnroll() {
		return enroll;
	}

	public String getName() {
		return name;
	}

	public double getCr() {
		return cr;
	}
	
}
