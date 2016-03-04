package addonless200216;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AllDate {
	List <Date> dates =new ArrayList<Date>();
	
	public void add (String date){
		Singleton s=Singleton.getInstance();
		Date d=s.parseToDate(date);
		dates.add(d);
	}
	
	
	
	
}
