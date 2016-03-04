package home11;

import java.util.Comparator;

public class CompBookP implements Comparator<Commodity>{

	@Override
	public int compare(Commodity p1, Commodity p2) {
		return p1.getNameBook().compareToIgnoreCase(p2.getNameBook());
	}

}
