package home11;

import java.util.Comparator;

public class CompBookM implements Comparator<Commodity>{

	@Override
	public int compare(Commodity p1, Commodity p2) {
	return p2.getNameBook().compareToIgnoreCase(p1.getNameBook());
	}

}
