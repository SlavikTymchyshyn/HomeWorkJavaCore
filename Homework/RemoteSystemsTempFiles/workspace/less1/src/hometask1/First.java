package hometask1;

public class First {

	public static void main(String[] args) {
		double a=8;
		double b=8;
		double c=2;
		double x1;
		double x2;

		x1 = (Math.sqrt(Math.pow(b, 2) - 4 * a * c) - b) / (2 * a);
		x2 = (Math.sqrt(Math.pow(b, 2) - 4 * a * c) + b) / (2 * a);
		
		if (Double.isNaN(x1)){System.out.print("there is No result For x1; ");}
		else {System.out.print("x1 = " + x1+ ";");}
		if (Double.isNaN(x2)){System.out.println("there is No result For x2;");}
		else {System.out.println(" x2 = " + x2+ ";");}
		
				
		//System.out.println("No result");
		//System.out.println("Is result");
		//System.out.println("x1 = " + x1);
		//System.out.println("x2 = " + x2);

	}
}
	


