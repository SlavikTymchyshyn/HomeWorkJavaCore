package home8;

import home7.Person;

public class Zavod_auto {

	public static void main(String[] args) {
		SteeeringWheel rul=new SteeeringWheel (12);
		Wheel wheel=new Wheel(18,4);
		Wheel wheelsport=new Wheel(17,4);
		
//		
		
		Car diablo=new Car ("3.2L","injector",16,"BC5001BC","Yellow",1500.25,wheel,rul,"Lamborghini","diablo GT");
		diablo.Setwheel(16,5);
		diablo.Changediametrykoles(19);
		diablo.ChangediametryRylja(11);
		wheel.setWheelcount(4);
		System.out.println(diablo);
		System.out.println();
		Car diablo2=new Car ("2.7L","injector",12,"BC5005BC","Black",2500.25,wheelsport,rul,"Lamborghini","diablo");
		
				
		System.out.println(diablo2);
		System.out.println();
		System.out.println("diablo2.sportwheel()-----|");
		System.out.println("diablo.sportrul()--------| ");
		System.out.println("                         Y");
		diablo2.sportwheel();
		diablo2.sportrul();
		System.out.println(diablo2);
		System.out.println();
		System.out.println(diablo.getModel());
		System.out.println(diablo2.getManufacturer());
		
		System.out.println();
		System.out.println(diablo2.getManufacturer());
		diablo2.ChangManufctr("ford");
		System.out.println(diablo2.getManufacturer());
		
		System.out.println();
		String ester;//оголошення змінної стрінг
		//System.out.println(ester);
		ester=new String("ghjghj");//ініціалізація - надання значення і місця в памяті
		System.out.println(ester);
		Person first;
		first=new Person("Lena");//ініціалізація
		first.Changename("otto");
		//System.out.println(first);
		System.out.println(first.getName());
	}

}
