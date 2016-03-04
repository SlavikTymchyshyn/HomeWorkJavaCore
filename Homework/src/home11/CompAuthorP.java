package home11;

import java.util.Comparator;

public class CompAuthorP implements Comparator<Commodity>{

	@Override
	public int compare(Commodity p1, Commodity p2) {
			return p1.getNameAuthor().compareToIgnoreCase(p2.getNameAuthor());
	}

}
