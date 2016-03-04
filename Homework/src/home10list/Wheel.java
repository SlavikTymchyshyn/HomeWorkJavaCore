package home10list;

import java.util.ArrayList;
import java.util.Scanner;

public class Wheel {
	
	private int wheelradius;
	private String SeasonType;

	public Wheel(int wheelradius, String SeasonType) {
		this.wheelradius = wheelradius;
		this.SeasonType=SeasonType;
		
	}
	
	void WheelTwice(){
		this.wheelradius*=2;
	} 
	
	int IntRadius() {
		Scanner wd = new Scanner(System.in);
		System.out.println("Type Wheel Diametr:");
		String s = wd.nextLine();
		int i=Integer.parseInt(s);
			while (wd.hasNextInt()) {
			i = wd.nextInt();
			return i;
			}
		return i;
	}
		
	public String getSeasonType() {
		return SeasonType;
	}
	public void setSeasonType(String seasonType) {
		SeasonType = seasonType;
	}

	public int getWheelradius() {
		return wheelradius;
	}

	public void setWheelradius(int wheelradius) {
		this.wheelradius = wheelradius;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((SeasonType == null) ? 0 : SeasonType.hashCode());
		result = prime * result + wheelradius;
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
		Wheel other = (Wheel) obj;
		if (SeasonType == null) {
			if (other.SeasonType != null)
				return false;
		} else if (!SeasonType.equals(other.SeasonType))
			return false;
		if (wheelradius != other.wheelradius)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Wheel (wheelradius=" + wheelradius + ", SeasonType="
				+ SeasonType + ")";
	}

	
}
