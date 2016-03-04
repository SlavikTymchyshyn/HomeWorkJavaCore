package homeGeneric;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Mainmap {

//	MyEntry<?, ?> entr;
//	MyEntry<?, ?> entr2;
//
//	public Mainmap() {
//		entr = new MyEntry<String, Integer>();
//		Map<String, Integer> map = new HashMap<>();
//
//		entr2 = new MyEntry<String, String>();
//	}

	public static void main(String[] args) {

		Set<MyEntry<String, Integer>> set=new HashSet<>();
		MyMap<String, Integer> m1 = new MyMap<>();
//		MyEntry<String, Integer> me =new MyEntry<> ("Vasja", 59);
		set.add(new MyEntry<> ("Vasja", 59));
		set.add(new MyEntry<> ("Marta", 22));
		set.add(new MyEntry<> ("Olena", 34));
		set.add(new MyEntry<> ("Orest", 56));
			
		System.out.println(set);

//		 m1.addToMap(set, "Petro", 30);
//		 m1.delByValueFromMap(set, 22);
//		 m1.delTotallyFromMap(set, "Olena");
//		 m1.getAllMap(set);
//		 m1.getListValue(set);
//		 m1.getSetKeys(set);

	}
}
