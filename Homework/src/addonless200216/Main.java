package addonless200216;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Singleton s=Singleton.getInstance();
		Date d=s.parseToDate("2016-02-15");
		System.out.println(d);
		System.out.println(s.parseToString(d));
		AllDate ad=new AllDate();
		ad.add("2016-02-15");
		
//		Book b = (Book) Class.forName("less2.Book").//ше один спосіб рефлексії

		{} // -- блок інціалізації виконується швидше ніж конструктор
		
		
	}
}
