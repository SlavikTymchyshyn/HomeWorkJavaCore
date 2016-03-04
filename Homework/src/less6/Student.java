package less6;

public class Student extends Human {
	private String VNZ;

	private String group;

	public Student(String vNZ, String group) {
		super();
		VNZ = vNZ;
		this.group = group;
	}

	public Student() {
	}

	public String getVNZ() {
		return VNZ;
	}

	public void setVNZ(String vNZ) {
		VNZ = vNZ;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	@Override
	public String toString() {
		return "Student" + super.toString() + "[VNZ=" + VNZ + ", group="
				+ group + "]";
	}

}