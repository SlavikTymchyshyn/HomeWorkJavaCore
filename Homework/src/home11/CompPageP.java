package home11;

import java.util.Comparator;

public class CompPageP implements Comparator<Commodity>{

	@Override
	public int compare(Commodity o1, Commodity o2) {
			return o1.getPageAmount()-o2.getPageAmount();
	}

}
