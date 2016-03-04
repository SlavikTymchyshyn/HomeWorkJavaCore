package home10list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class CarTest {

	@Test
	public void DelRedTest(){
		List<Car> exp=new ArrayList<>();
		exp.add(new Car("1.5", "karburator", 8,"Пикап", "BC5101BC", "black", 4200.25,14,"winter",
				18, false, "ДжИГУЛи", "2107"));
		exp.add(new Car("1.7L", "karburator", 8,"Универсал", "BC5091BC", "purple", 4800.25, 15,"winter",
				16, false, "Москвич", "1979"));
		List<Car> act=new ArrayList<>();
		act.add(new Car("1.5", "karburator", 8,"Пикап", "BC5101BC", "black", 4200.25,14,"winter",
				18, false, "ДжИГУЛи", "2107"));
		act.add(new Car("1.6L", "karburator", 8,"Седан", "BC5301BC", "red", 3950.25, 14,"winter",
				17, false, "ЛАДА", "2109"));
		act.add(new Car("1.7L", "karburator", 8,"Универсал", "BC5091BC", "purple", 4800.25, 15,"winter",
				16, false, "Москвич", "1979"));
		act.get(0).DelRed(act);	
		Object[] actuals =act.toArray();
		Object[] expecteds=exp.toArray();
		for(int i=0;i<actuals.length;i++){
		Assert.assertArrayEquals(expecteds, actuals);}
		}
	
	@Test
	public void ChangeSeasonPackTest(){
		List<Car> exp=new ArrayList<>();
		exp.add(new Car("1.5", "karburator", 8,"Пикап", "BC5101BC", "black", 4200.25,14,"summer",
				18, false, "ДжИГУЛи", "2107"));
		exp.add(new Car("1.6L", "karburator", 8,"Седан", "BC5301BC", "red", 3950.25, 15,"winter",
				17, false, "ЛАДА", "2109"));
		exp.add(new Car("1.7L", "karburator", 8,"Универсал", "BC5091BC", "purple", 4800.25, 16,"winter",
				16, false, "Москвич", "1979"));
		exp.add(new Car("1.6L", "karburator", 8,"Седан", "BC5301BC", "red", 3950.25, 17,"summer",
				17, false, "ЛАДА", "2109"));
		exp.add(new Car("1.7L", "karburator", 8,"Универсал", "BC5091BC", "purple", 4800.25, 15,"winter",
				16, false, "Москвич", "1979"));
		List<Car> act=new ArrayList<>();
		act.add(new Car("1.5", "karburator", 8,"Пикап", "BC5101BC", "black", 4200.25,14,"summer",
				18, false, "ДжИГУЛи", "2107"));
		act.add(new Car("1.6L", "karburator", 8,"Седан", "BC5301BC", "red", 3950.25, 15,"summer",
				17, false, "ЛАДА", "2109"));
		act.add(new Car("1.7L", "karburator", 8,"Универсал", "BC5091BC", "purple", 4800.25, 16,"summer",
				16, false, "Москвич", "1979"));
		act.add(new Car("1.6L", "karburator", 8,"Седан", "BC5301BC", "red", 3950.25, 17,"summer",
				17, false, "ЛАДА", "2109"));
		act.add(new Car("1.7L", "karburator", 8,"Универсал", "BC5091BC", "purple", 4800.25, 15,"summer",
				16, false, "Москвич", "1979"));
		act.get(0).ChangeSeasonPack(act);	
		Object[] actuals =act.toArray();
		Object[] expecteds=exp.toArray();
		for(int i=0;i<actuals.length;i++){
		Assert.assertArrayEquals(expecteds, actuals);}
		}
	
	@Test
	public void DelCarBodyRadiusTest(){
		int MinRadSteer=14;
		int MaxRadSteer=17;
		String Kuzov="Универсал";
		
		List<Car> exp=new ArrayList<>();
		exp.add(new Car("1.5", "karburator", 8,"Пикап", "BC5101BC", "black", 4200.25,14,"summer",
				18, false, "ДжИГУЛи", "2107"));
		exp.add(new Car("1.6L", "karburator", 8,"Седан", "BC5301BC", "red", 3950.25, 15,"summer",
				17, false, "ЛАДА", "2109"));
		exp.add(new Car("1.6L", "karburator", 8,"Седан", "BC5301BC", "red", 3950.25, 17,"summer",
				17, false, "ЛАДА", "2109"));
		
		List<Car> act=new ArrayList<>();
		act.add(new Car("1.5", "karburator", 8,"Пикап", "BC5101BC", "black", 4200.25,14,"summer",
				18, false, "ДжИГУЛи", "2107"));
		act.add(new Car("1.6L", "karburator", 8,"Седан", "BC5301BC", "red", 3950.25, 15,"summer",
				17, false, "ЛАДА", "2109"));
		act.add(new Car("1.7L", "karburator", 8,"Универсал", "BC5091BC", "purple", 4800.25, 16,"summer",
				16, false, "Москвич", "1979"));
		act.add(new Car("1.6L", "karburator", 8,"Седан", "BC5301BC", "red", 3950.25, 17,"summer",
				17, false, "ЛАДА", "2109"));
		act.add(new Car("1.7L", "karburator", 8,"Универсал", "BC5091BC", "purple", 4800.25, 15,"summer",
				16, false, "Москвич", "1979"));
		act.get(0).DelCarBodyRadius(act,MinRadSteer,Kuzov,MaxRadSteer);	
		Object[] actuals =act.toArray();
		Object[] expecteds=exp.toArray();
		for(int i=0;i<actuals.length;i++){
		Assert.assertArrayEquals(expecteds, actuals);}
		}
	
	@Test
	public void DelCarByRadiusOfWheelTest(){
		Set<Car> exp=new LinkedHashSet<>();	
		exp.add(new Car("1.6L", "karburator", 8,"Седан", "BC5301BC", "red", 3950.25, 17,"summer",
				17, false, "ЛАДА", "2109"));
		
		Set<Car> act=new LinkedHashSet<>();
		act.add(new Car("1.7L", "karburator", 8,"Универсал", "BC5091BC", "purple", 4800.25, 14,"summer",
				16, false, "Москвич", "1979"));
		act.add(new Car("1.6L", "karburator", 8,"Седан", "BC5301BC", "red", 3950.25, 17,"summer",
				17, false, "ЛАДА", "2109"));
		act.add(new Car("1.7L", "karburator", 8,"Универсал", "BC5091BC", "purple", 4800.25, 15,"summer",
				16, false, "Москвич", "1979"));
		act.iterator().next().DelCarByRadiusOfWheel(14,15,act);
		
		Object[] actuals =act.toArray();
		Object[] expecteds=exp.toArray();
		for(int i=0;i<actuals.length;i++)	//пролистування акт масиву шоб він знав якої він довжини і наповнення
		{
			Assert.assertArrayEquals(expecteds, actuals);}
		}
	
	@Test
	public void IndexOfBodyTest(){
	int expected=1;
	List<Car> act=new LinkedList<>();	
	act.add(new Car("1.7L", "karburator", 8,"Универсал", "BC5091BC", "purple", 4800.25, 15,"winter",
			16, false, "Москвич", "1979"));
	act.add(new Car("4.4L", "injector", 16,"sportcar", "BC5081BC", "white", 1250.25, 18,"summer",
			12, true, "Lamborghini", "diablo GT"));
	int actual=act.get(0).IndexOfBody(act);
	Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void ChangeCarToAnotherTest(){
		List<Car> exp=new LinkedList<>();	
		exp.add(new Car("1.6L", "karburator", 8,"Седан", "BC5301BC", "red", 3950.25, 17,"summer",
				17, false, "ЛАДА", "2109"));
		exp.add(new Car("1.6L", "karburator", 8,"Седан", "BC5301BC", "red", 3950.25, 17,"summer",
				17, false, "ЛАДА", "2109"));
		
		List<Car> act=new LinkedList<>();	
		act.add(new Car("1.7L", "karburator", 8,"Универсал", "BC5091BC", "purple", 4800.25, 14,"summer",
				16, false, "Москвич", "1979"));
		act.add(new Car("1.6L", "karburator", 8,"Седан", "BC5301BC", "red", 3950.25, 17,"summer",
				17, false, "ЛАДА", "2109"));
		act.get(0).ChangeCarToAnother(act.get(1), 17);
		
		Object[]actuals =act.toArray();
		Object[]expecteds =exp.toArray();
//		for(int i=0;i<actuals.length;i++)
		{
		Assert.assertArrayEquals(expecteds, actuals);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
