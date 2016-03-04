package saturday060616;

import java.util.Comparator;

public class ComparatorByNameAsc implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		return o2.getName().compareToIgnoreCase(o1.getName());
	}

}
