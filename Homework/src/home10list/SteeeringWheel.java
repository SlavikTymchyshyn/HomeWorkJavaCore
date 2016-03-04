package home10list;

import java.util.Scanner;

public class SteeeringWheel {
	
	private int steerradius;
	private boolean keys;

	public SteeeringWheel(int steerradius,boolean keys) {
		this.keys=keys;
		this.steerradius = steerradius;
	}

	void ChangeRulja(){
		int sport=2;
		this.steerradius*=sport;		
	}
	int TypeRulja() {
		Scanner wd = new Scanner(System.in);
//		System.out.println("Type Diametr:");
		String s = wd.nextLine();
		int i=Integer.parseInt(s);
//		return (wd.hasNextInt())?i = wd.nextInt():TypeRulja();
		return i;
	}
	
//
	public boolean isKeys() {
		return keys;
	}

	public void setKeys(boolean keys) {
		this.keys = keys;
	}

	public int getSteerradius() {
		return steerradius;
	}

	public void setSteerradius(int steerradius) {
		this.steerradius = steerradius;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (keys ? 1231 : 1237);
		result = prime * result + steerradius;
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
		SteeeringWheel other = (SteeeringWheel) obj;
		if (keys != other.keys)
			return false;
		if (steerradius != other.steerradius)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "=" + steerradius + ", keys=" + keys;
	}

}
