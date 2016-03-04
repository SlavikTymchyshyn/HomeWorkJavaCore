package home10list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Zavod_auto {

	private static Car tmp;

	public static void main(String[] args) {
		// List<Car> car=new ArrayList<>();
		List<Car> car = new ArrayList<>();
		car.add(new Car("1.5", "karburator", 8,"Пикап", "BC5101BC", "black", 4200.25,14,"winter",
				18, false, "ДжИГУЛи", "2107"));
		car.add(new Car("1.6L", "karburator", 8,"Седан", "BC5301BC", "red", 3950.25, 14,"winter",
				17, false, "ЛАДА", "2109"));
		car.add(new Car("1.7L", "karburator", 8,"Универсал", "BC5091BC", "purple", 4800.25, 15,"winter",
				16, false, "Москвич", "1979"));
		car.add(new Car("4.4L", "injector", 16,"sportcar", "BC5081BC", "white", 1250.25, 18,"summer",
				12, true, "Lamborghini", "diablo GT"));
		car.add(new Car("5.2L", "injector", 16, "sportcar","BC5071BC", "green", 1150.25,16,"summer",
				11, true, "Ford", "Mustang GT sport"));
		car.add(new Car("6.0L", "injector", 16, "sportcar","BC5051BC", "grey", 1100.25,17,"summer",
				12, true, "Ford", "Mustang GT sport"));
		car.add(new Car("3.0L", "injector", 16, "sportcar","BC5041BC", "pink", 1900.25,18,"summer",
				12, true, "Lamborghini", "diablo GT06"));
		car.add(new Car("3.6L", "injector", 12, "sportcar","BC5031BC", "red", 1700.25, 19,"summer",
				14, true, "Porsche", "911 GT"));
		car.add(new Car("3.8L", "injector", 14, "sportcar","BC5021BC", "orange", 1900.25,16,"summer",
				13, true, "Lamborghini", "diablo GT02"));
		car.add(new Car("3.2L", "injector", 12, "sportcar","BC5011BC", "yellow", 2100.25,16,"summer",
				14, true, "Lamborghini", "diablo GT01"));
//		car.trimToSize(); //-обрізає ліст до розміру з даними для зменшення використання ОЗП при зберіганні даного списку
		
//		for (Car car2 : car) {
//			System.out.println(car2);
//		}
		
		int i = 0;
		for (; i < car.size(); i++) {
			System.out.print(car.get(i));
		}
		System.out.println();
		
		List<Car> carwheel = new ArrayList<>();

						
// 1 Знайти машини, які мають введений діаметр коліс.

//				int w = car.get(0).getWheel().IntRadius();					//it works
		//		for (Car car2 : car) {
		//			if (car2.getWheel().getWheelradius() == w) {
		//				carwheel.add(car2);
		//			}
		//		}
		//		System.out.print(carwheel);
		//		carwheel.clear();
		//		System.out.println();

// 1a
//			i=0;
//		for (; i < car.size();i++) {										//works
//			if (car.get(i).getWheel().getWheelradius() == w) {
//				System.out.println(car.get(i));
//			}
//		}
//		System.out.println();

// 2 Знайти машини, які мають введений діаметр коліс та колір кузова
		
		//		String s=car.get(1).getBody().TypeColor();									// works	
		//		for (Car el1 : car) {
		//			if (el1.getWheel().getWheelradius() == w
		//					&& el1.getBody().getColor().equalsIgnoreCase(s)) {
		//				carwheel.add(el1);
		//			}else{System.out.println("no coincidence in "+s+" color & radius="+w);}
		//		}
		//		System.out.print(carwheel);
		//		carwheel.clear();
		//		System.out.println();

// 3 Замінити в усіх машинах, які мають червоний колір кузова, кермо на	інше.

		//		for(Car e3: car){															// works		
		//			e3.IfRed();
		//			carwheel.add(e3);
		//		}
		//		System.out.println(carwheel);
		//		carwheel.clear();
		//		System.out.println();
				
//				for (i=0; i < car.size(); i++) {										//works
//					car.get(i).IfRed();
//					}
//				System.out.println(car);
//				System.out.println();
		
// 4 Збільшити діаметр коліс вдвічі, якщо кермо має кнопочки.

		//		for(Car e4: car){															// works		
		//			e4.Buttonhas();;
		//			carwheel.add(e4);
		//		}
		//		System.out.println(carwheel);
		//		carwheel.clear();
		//		System.out.println();
					
//				for (i=0; i < car.size(); i++) {												//workae
//					car.get(i).Buttonhas();
//				}
//				System.out.println(car);
//				System.out.println();

// 5 Замінити усі машини, які мають колеса діаметром менші за введене
// значення, на інші машини.
				
//				int w5=car.get(9).getWheel().IntRadius();
		//		for(Car e5: car){															// works		
		//			e5.ChangeCarToAnother(car.get(5), w5);
		//			System.out.println(e5);
		//			carwheel.add(e5);
		//		}
		//		System.out.println(carwheel);
		//		carwheel.clear();
		//		System.out.println();
		//		
		//		
//				i=0;
//				for (; i < car.size(); i++) {												//workae
//					car.get(i).ChangeCarToAnother(car.get(5), w5);
//		
//				}
//				System.out.println(car);
//				System.out.println();
		
		
	// 6  Yдаляє машини введеного кольору
		
//		String tbt=car.get(0).getBody().TypeBodyField();
//		Iterator<Car> iter=car.iterator();					
//		while(iter.hasNext()){
//			Car tmp=iter.next();										//tmp екземпляр типу Car тому з нього мона до інших достукатись
//			if(tmp.getBody().getColor().equalsIgnoreCase(tbt)){
//				iter.remove();
//			}
//		}
//		System.out.println(car);
	
		//6a Yдаляє машини red кольору
	
//		System.out.println(car.get(1).DelRed(car));
		System.out.println(car.get(0).DelRedLambda(car));
		
			
	//7 Знайти машини, які використовують введений тип кузова.
		
//		Iterator<Car> it3=car.iterator();					
//		while(it3.hasNext()){
//			Car tmp=it3.next();										
//			if(!tmp.getBody().getBodyType().equalsIgnoreCase(tbt)){
//				it3.remove();
//			}
//		}
//		System.out.println(car);	
		
	//8 Замінити усім машинам, діаметр коліс яких лежить у введеному діапазоні шини на зимові.	
		
//		System.out.println(car.get(1).ChangeSeasonPack(car));
		
	//9 Видалити усі машини, які мають введений тип кузова та введений діапазон діаметра керма.
		
//		System.out.println(car.get(1).DelCarBodyRadius(car));
		
	//10 Запам'ятати індекси машин, які маютьвведений тип кузова. 	
		
//		car.get(0).IndexOfBody(car);
		
		
		
		
		
		
	}
}
