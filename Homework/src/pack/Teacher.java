package pack;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Human{

	private String name;
	private VNZ vnz;
	private List<Subject> subjects=new ArrayList<>();
	
	public Teacher(int weight, int height, int age, String name, VNZ vnz
			) {
		super(weight, height, age);
		this.name = name;
		this.vnz = vnz;
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public VNZ getVnz() {
		return vnz;
	}
	public void setVnz(VNZ vnz) {
		this.vnz = vnz;
	}
	public List<Subject> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((subjects == null) ? 0 : subjects.hashCode());
		result = prime * result + ((vnz == null) ? 0 : vnz.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Teacher other = (Teacher) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (subjects == null) {
			if (other.subjects != null)
				return false;
		} else if (!subjects.equals(other.subjects))
			return false;
		if (vnz != other.vnz)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", vnz=" + vnz  + "]";
	} 
	
	
	
}
