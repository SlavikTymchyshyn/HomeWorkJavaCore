package less14aboutMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main {

	static Map<String,Double> square(double a, double b, double c){
		Map<String,Double> map=new HashMap<>();
		double d=(b*b)-(4*a*c);
		if(d==0){
			map.put("x1", (-b/(2*a)));
		}else if (d>0){
			map.put("x1",  -b-Math.sqrt(d)/(2*a));
			map.put("x2",  -b+Math.sqrt(d)/(2*a));
		}
		return map;
	}
	
	
	public static void main(String[] args) {
					
//		Map<Direction,Integer> map=new HashMap<>(); //1й дженерік Direction це ключ, 2й -Integer -значення, TreeMap sort by Direction 
//		map.put(Direction.LEFT, 0);
//		map.put(Direction.RIGHT, 1);
//		map.put(Direction.UP, 2);
//		map.put(Direction.DOWN, 3); //for direction of move as example
//		System.out.println(map.get(Direction.DOWN));  //по ключу дістаєм значення
//	}
	//для ключа краще обэкт а значення його ліст
		
		Map<String,Double> map=square(2, 4, 2);
		if(map.isEmpty()){
			System.out.println("розвязків немає");
			}else{
				double x1=map.get("x1");
				if(map.get("x2")==null)
					{System.out.println("розвязок один ="+x1);}
				else{
					System.out.println("розвязкыв 2 х1= "+x1+", x2="+map.get("x2"));
				}
			}
		
	Map<String,List<Integer>> map1=new HashMap<>();
		map1.put("A", new ArrayList<>());
		map1.get("A").add(4);               //map1.get("A")  -- ce ArrayList<>()
		map1.get("A").add(5);
		map1.put("B", new ArrayList<>());
		map1.get("B").add(6);               //map1.get("A")  -- ce ArrayList<>()
		map1.get("B").add(7);
		
		for(int tmp: map1.get("A"))
		{
//			System.out.println(tmp);
			}
	
	Set<Entry<String,List<Integer>>> set =map1.entrySet();			//entrySet() даэ 2 метода для map через set: getKey i getValue
	Iterator<Entry<String,List<Integer>>> entryIterator =set.iterator();  //змінні мона перейменовувати виділивши і рефактор rename ->open rename dialog
	while(entryIterator.hasNext()){
		Entry<String,List<Integer>> entry=entryIterator.next();
		System.out.println(entry.getKey());
		Iterator<Integer> iterOfvalue =entry.getValue().iterator();
		while(iterOfvalue.hasNext()){
			System.out.println(iterOfvalue.next());
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	}
}
