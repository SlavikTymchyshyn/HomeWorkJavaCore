package home10list;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import less17.A.C;

public class Car {

	private String Manufacturer;

	private String Model;

	private Engine engine;

	private Body body;

	private Wheel wheel;

	private SteeeringWheel steeeringWheel;
	
//	public Car(Car c){
//		this.engine = c.engine;
//		this.body = c.body;
//		this.wheel =c.wheel;
//		this.steeeringWheel =c.steeeringWheel ;
//		Manufacturer = c.Manufacturer;
//		Model = c.Model;
//	}
	public Car (){}
		
	public Car(String Volume, String Type, int CylinderCount,String BodyType,
			String numberbody, String color, double weight, int wheelradius,String seasonType,
			int steerradius, boolean keys, String manufacturer, String model) {
		this.engine = new Engine(Volume, Type, CylinderCount);
		this.body = new Body(BodyType,numberbody, color, weight);
		this.wheel = new Wheel(wheelradius,seasonType);
		this.steeeringWheel = new SteeeringWheel(steerradius, keys);
		Manufacturer = manufacturer;
		Model = model;
	}
////////////////
	public void Changediametrykoles(int newwheel) {
//		System.out.println("Старий діаметр Wheel:" + wheel.getWheelradius());
		wheel.setWheelradius(newwheel);
//		System.out.println("New діаметр Wheel:" + wheel.getWheelradius());
		
	}
	
	
	//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!cool метод workae
	List<Car> DelRed(List<Car> car){
	Iterator<Car> iter=car.iterator();					//удаляє машини червоного кольору
	while(iter.hasNext()){
		Car tmp=iter.next();									
		if(tmp.getBody().getColor().equalsIgnoreCase("Red")){
			iter.remove();
		}
	}
	return car;}
	
	List<Car> DelRedLambda(List<Car> car){
	//	car.stream().filter(c->c.getBody().getColor().equalsIgnoreCase("red"));
	car.removeIf(c->c.getBody().getColor().equalsIgnoreCase("red"));
		return car;
	}
	
//	String ChangeSeasonPack(){
//	return(wheel.getWheelradius()<17&&wheel.getWheelradius()>14)?"winter":wheel.getSeasonType();
//	}
	
	//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!cool метод workae
	List<Car> ChangeSeasonPack(List<Car> car){
		Iterator<Car> it2=car.iterator();
		while(it2.hasNext()){
		Car tmp=it2.next();		
		if(tmp.wheel.getWheelradius()<17&&tmp.wheel.getWheelradius()>14){
			tmp.getWheel().setSeasonType("winter");}
		}
		return car;
	} 
	
	List<Car> ChangeSeasonPackLambda(List<Car> car){
		car.replaceAll((p)->p.getBody().getBodyType().equals("sportcar"));
		return car;
	}
		
	List<Car> DelCarBodyRadius(List<Car> car,int MinRadSteer,String Kuzov,int MaxRadSteer){
		
//		System.out.println("Type minRadiusRulja:");
//		int MinRadSteer=steeeringWheel.TypeRulja();
//		String Kuzov=body.TypeBodyField();
//		System.out.println("Type maxRadiusRulja:");
//		int MaxRadSteer=steeeringWheel.TypeRulja();
		
		Iterator<Car> it4=car.iterator();
		while(it4.hasNext()){Car tmp=it4.next();		
		if(tmp.steeeringWheel.getSteerradius()<=MaxRadSteer&&tmp.steeeringWheel.getSteerradius()>=MinRadSteer
				&&tmp.body.getBodyType().equalsIgnoreCase(Kuzov))
			it4.remove();
		}
		return car;
	} 
	
/*SET!!!*/	Set<Car> DelCarByRadiusOfWheel(int MinRadius,int MaxRadius,Set<Car> car){
//					System.out.println("Type minRadius koles:");
//					int MinRadius=steeeringWheel.TypeRulja();
//					System.out.println("Type maxRadius koles:");
//					int MaxRadius=steeeringWheel.TypeRulja();
		
//				Set<Car> car=new LinkedHashSet<>();//краще в параметрах
	
				Iterator<Car> it9=car.iterator();
				while(it9.hasNext()){Car tmp=it9.next();
				if(tmp.getWheel().getWheelradius()<=MaxRadius&&tmp.getWheel().getWheelradius()>=MinRadius)
					it9.remove();
				}
				return car;
			}
	
	
	int IndexOfBody(List<Car> car){
		
		int i=0;		
//		String Kuzov=body.TypeBodyField();
		String Kuzov="sportcar";
		ListIterator<Car> it6=car.listIterator();
		while(it6.hasNext())
		{Car tmp=it6.next();		
		if(tmp.body.getBodyType().equalsIgnoreCase(Kuzov))
		{
		i=it6.nextIndex()-1;                //для того щоб показало реальний індекс тому it6.nextIndex()-1, тому що в 118 строці воно вже переступає на 1
			}
		}
		return i;
	} 
	
	Car ChangeCarToAnother(Car another,int radius){
		if(wheel.getWheelradius()<radius){
			this.wheel =another.wheel;
			this.engine=another.engine;
			this.body=another.body;
			this.steeeringWheel=another.steeeringWheel;
			Manufacturer=another.Manufacturer;
			Model=another.Model;
			return another;
		}else{System.out.println("Your car has normal wheel radius"+this.wheel);}
		return another;
	}

	void IfRed(){
		if(body.getColor().equals("Red")){steeeringWheel.ChangeRulja();}
	}
	void Buttonhas(){
		if(steeeringWheel.isKeys()){
			wheel.WheelTwice();;
		}
	}
	
//////////////
	public Wheel getWheel() {
		return wheel;
	}

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	public SteeeringWheel getSteeeringWheel() {
		return steeeringWheel;
	}

	public void setSteeeringWheel(SteeeringWheel steeeringWheel) {
		this.steeeringWheel = steeeringWheel;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Body getBody() {
		return body;
	}

	public void setBody(Body body) {
		this.body = body;
	}

	public String getManufacturer() {
		return Manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		Manufacturer = manufacturer;
	}

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((Manufacturer == null) ? 0 : Manufacturer.hashCode());
		result = prime * result + ((Model == null) ? 0 : Model.hashCode());
		result = prime * result + ((body == null) ? 0 : body.hashCode());
		result = prime * result + ((engine == null) ? 0 : engine.hashCode());
		result = prime * result
				+ ((steeeringWheel == null) ? 0 : steeeringWheel.hashCode());
		result = prime * result + ((wheel == null) ? 0 : wheel.hashCode());
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
		Car other = (Car) obj;
		if (Manufacturer == null) {
			if (other.Manufacturer != null)
				return false;
		} else if (!Manufacturer.equals(other.Manufacturer))
			return false;
		if (Model == null) {
			if (other.Model != null)
				return false;
		} else if (!Model.equals(other.Model))
			return false;
		if (body == null) {
			if (other.body != null)
				return false;
		} else if (!body.equals(other.body))
			return false;
		if (engine == null) {
			if (other.engine != null)
				return false;
		} else if (!engine.equals(other.engine))
			return false;
		if (steeeringWheel == null) {
			if (other.steeeringWheel != null)
				return false;
		} else if (!steeeringWheel.equals(other.steeeringWheel))
			return false;
		if (wheel == null) {
			if (other.wheel != null)
				return false;
		} else if (!wheel.equals(other.wheel))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Car->Manufacturer->" + Manufacturer + ", Model->" + Model
				+ ", engine->" + engine + ", body->" + body + ", wheel->" + wheel
				+ ", steeeringWheel" + steeeringWheel + " \n";
	}
	
	
}
