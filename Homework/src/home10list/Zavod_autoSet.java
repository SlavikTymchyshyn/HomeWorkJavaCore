package home10list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Zavod_autoSet {

	public static void main(String[] args) {
		Set<Car> carset = new LinkedHashSet<>();
		carset.add(new Car("1.5", "karburator", 8,"Пикап", "BC5101BC", "black", 4200.25,14,"winter",
				18, false, "ДжИГУЛи", "2107"));
		carset.add(new Car("1.6L", "karburator", 8,"Седан", "BC5301BC", "red", 3950.25, 14,"winter",
				17, false, "ЛАДА", "2109"));
		carset.add(new Car("1.7L", "karburator", 8,"Универсал", "BC5091BC", "purple", 4800.25, 15,"winter",
				16, false, "Москвич", "1979"));
		carset.add(new Car("4.4L", "injector", 16,"sportcar", "BC5081BC", "white", 1250.25, 18,"summer",
				12, true, "Lamborghini", "diablo GT"));
		carset.add(new Car("5.2L", "injector", 16, "sportcar","BC5071BC", "green", 1150.25,16,"summer",
				11, true, "Ford", "Mustang GT sport"));
		carset.add(new Car("6.0L", "injector", 16, "sportcar","BC5051BC", "grey", 1100.25,17,"summer",
				12, true, "Ford", "Mustang GT sport"));
		carset.add(new Car("3.0L", "injector", 16, "sportcar","BC5041BC", "pink", 1900.25,18,"summer",
				12, true, "Lamborghini", "diablo GT06"));
		carset.add(new Car("3.6L", "injector", 12, "sportcar","BC5031BC", "red", 1700.25, 19,"summer",
				14, true, "Porsche", "911 GT"));
		carset.add(new Car("3.8L", "injector", 14, "sportcar","BC5021BC", "orange", 1900.25,16,"summer",
				13, true, "Lamborghini", "diablo GT02"));
		carset.add(new Car("3.2L", "injector", 12, "sportcar","BC5011BC", "yellow", 2100.25,16,"summer",
				14, true, "Lamborghini", "diablo GT01"));
		System.out.println(carset);
		
		List<Car> l=new ArrayList<>(10);
// 2 Видалити машини, діаметр колес яких попадає у вказаний діапазон.		
		
//		int MinRadius1=12;
//		int MaxRadius1=15;
//		System.out.println("minRadius koles:"+MinRadius1);
//		System.out.println("Type maxRadius koles:"+MaxRadius1);
//		
//		Iterator<Car> it4=carset.iterator();
//		while(it4.hasNext()){Car tmp=it4.next();		
//		if(tmp.getWheel().getWheelradius()<=MaxRadius1&&tmp.getWheel().getWheelradius()>=MinRadius1)
//			it4.remove();
//		}
//		System.out.println(carset); //workae
		
//		l.addAll(carset);
//		l.get(0).DelCarByRadiusOfWheel();
//		System.out.println(l);
		
		carset.iterator().next().DelCarByRadiusOfWheel(14,15,carset);
		System.out.println(carset);
		
		
		
//1 Машинам, які мають вказаний колір кузова та вказаний діаметр колеса, змінити тип шин на вказаний.
		
//		String s="red";
//		int Radius=14;
//		String seasonPack="summer";
//				
//		Iterator<Car> it5=carset.iterator();
//		while(it5.hasNext()){Car tmp=it5.next();		
//		if(tmp.getBody().getColor().equalsIgnoreCase(s)&&tmp.getWheel().getWheelradius()==Radius)
//			tmp.getWheel().setSeasonType(seasonPack);
//		}
//		System.out.println(carset);
		
//3 Знайти машини, які мають вказаний тип шин та діаметр коліс яких попадає у вказаний діапазон.		
		
//		int MinRadius1=16;
//		int MaxRadius1=19;
//		String seasonPack="summer";
//				
//		Iterator<Car> it5=carset.iterator();
//		while(it5.hasNext()){Car tmp=it5.next();		
//		if(!(tmp.getWheel().getSeasonType().equalsIgnoreCase(seasonPack)&&tmp.getWheel().getWheelradius()<=MaxRadius1
//				&&tmp.getWheel().getWheelradius()>=MinRadius1))
//			it5.remove();
//		}
//		System.out.println(carset);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
