package home11;

import java.util.Comparator;

public class CompAuthorM implements Comparator<Commodity>{

	@Override
	public int compare(Commodity p1, Commodity p2) {
		return p2.getNameAuthor().compareToIgnoreCase(p1.getNameAuthor());
	}

}
