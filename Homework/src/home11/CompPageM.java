package home11;

import java.util.Comparator;

public class CompPageM implements Comparator<Commodity>{

	@Override
	public int compare(Commodity o1, Commodity o2) {
		return o2.getPageAmount()-o1.getPageAmount();
	}

}
