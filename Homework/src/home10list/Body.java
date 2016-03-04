package home10list;

import java.util.Iterator;
import java.util.Scanner;

public class Body {
	
	private String BodyType;
	
	private String numberbody;

	private String color;

	private double weight;

	public Body(String BodyType, String numberbody, String color, double weight) {
		this.BodyType=BodyType;
		this.numberbody = numberbody;
		this.color = color;
		this.weight = weight;
	}
	String TypeBodyField() {
		Scanner wd = new Scanner(System.in);
		System.out.println("Type Body Field:");
		String c = null;
			while (wd.hasNextLine()) {
			c = wd.nextLine().toLowerCase();
			return c;
			}
		return c;
	}
	
	String TypedBodytype(String Bodyt){
//		return(this.BodyType.equalsIgnoreCase(Bodyt))?this.BodyType:null;
		while(this.BodyType.equalsIgnoreCase(Bodyt)){return this.BodyType;}
		return this.BodyType;
	}
	

	public String getBodyType() {
		return BodyType;
	}
	public void setBodyType(String bodyType) {
		BodyType = bodyType;
	}
	public String getNumberbody() {
		return numberbody;
	}

	public void setNumberbody(String numberbody) {
		this.numberbody = numberbody;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((BodyType == null) ? 0 : BodyType.hashCode());
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result
				+ ((numberbody == null) ? 0 : numberbody.hashCode());
		long temp;
		temp = Double.doubleToLongBits(weight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Body other = (Body) obj;
		if (BodyType == null) {
			if (other.BodyType != null)
				return false;
		} else if (!BodyType.equals(other.BodyType))
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (numberbody == null) {
			if (other.numberbody != null)
				return false;
		} else if (!numberbody.equals(other.numberbody))
			return false;
		if (Double.doubleToLongBits(weight) != Double
				.doubleToLongBits(other.weight))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Body [BodyType=" + BodyType + ", numberbody=" + numberbody
				+ ", color=" + color + ", weight=" + weight + "]";
	}

	
}
