package homeZooClub;

import java.io.Serializable;

public class Pet implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8032634288372794909L;
	private String animal;
	private String Name;
	
	public Pet(String animal, String name) {
		this.animal = animal;
		Name = name;
	}
	
	
//	public Pet(){
//		System.out.println("яку тваринку");
//		this.animal=new Person().stringType();
//		System.out.println("назва тваринки");
//		Name=new Person().stringType();
//	}

	public String getAnimal() {
		return animal;
	}

	public void setAnimal(String animal) {
		this.animal = animal;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((animal == null) ? 0 : animal.hashCode());
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
		Pet other = (Pet) obj;
		if (animal == null) {
			if (other.animal != null)
				return false;
		} else if (!animal.equals(other.animal))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pet (animal is " + animal + ", Name=" + Name + ")\n";
	}
	
	

}
