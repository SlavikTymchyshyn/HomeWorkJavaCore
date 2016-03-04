package lesssGeneric2;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public Entity newEntity(){
		return new Person(null, 0);
	}
	
	public static List<Integer> getIds(List<? extends Entity> list){
		List<Integer> listIds = new ArrayList<>();
		for (Entity entity : list) {
			listIds.add(entity.getId());
		}
		return listIds;
	}
	
	public static void print(Entity entity){
		System.out.println(entity);
	}

	public static void main(String[] args) {
		Container<String, List<String>> c = new Container<String, List<String>>();
		c.setElement(new ArrayList<>());
		System.out.println(c.getElement());
		print(new Person(null, 0));
		List<Person> list = new ArrayList<>();
		getIds(list);
	}
}
