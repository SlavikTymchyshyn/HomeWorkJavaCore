package enums3;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
//		Month a=Month.APRIL;
//		System.out.println(a);
//		System.out.println(Arrays.toString(Month.values()));
//		Month []m =Month.values();
//		for (Month month : m) {
//			if(month.getSeason().name().equalsIgnoreCase("WINTER"))System.out.print(month+" ");
//			}
//		System.out.println();
//		Season[] s=Season.values();
//		for (Season season : s) {
//			if(season.name().equalsIgnoreCase("summer"))System.out.println(" "+season);
//		}
//		System.out.println();
//		Month []m1 =Month.values();
//		for (Month month : m1) {
//			if(month.getSeason().equals(Season.AUTUMN))
//				System.out.println(month);
//		}
//		
//		
//		
//		System.out.println();
//		System.out.println(Season.valueOf("SPRING"));
//		System.out.println();
//		Month2 m2=Month2.AUGUST;
//		m2.printMonth();

//		DaysOfWeek d=DaysOfWeek.valueOf("MONDAY");
//		System.out.println(d);;
//		System.out.println(Arrays.toString(DaysOfWeek.values()));
		
//		Month m3=Month.MARCH;			//only one month 
//		System.out.println();
//		m3.printCalendarOfMonthsX();
		
		Month[] arm=Month.values();   //цілий календар
		for (Month month : arm) {
			month.printCalendarOfMonthsX();
		}
		
		
		
		
		
		
		
		
		}
	}

