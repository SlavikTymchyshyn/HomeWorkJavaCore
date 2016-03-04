package enums3;

import java.util.Arrays;
public enum Month {

	JANUARY(Season.WINTER,31),	FEBRUARY(Season.WINTER,28),	MARCH(Season.SPRING,31),	APRIL(Season.SPRING,30),
	MAY(Season.SPRING,31),	JUNE(Season.SUMMER,30),	JULE(Season.SUMMER,31),	AUGUST(Season.SUMMER,31),
	SEPTEMBER(Season.AUTUMN,30),  OCTOBER(Season.AUTUMN,31),	NOVEMBER(Season.AUTUMN,30),	DECEMBER(Season.WINTER,31);
	
		
	private Season season;
	private int Days;
	private DaysOfWeek daysOfWeek;
	
	private Month(Season season, int days) {
		this.season = season;
		Days = days;
	}
	
	public void printCalendarOfMonthsX(){
		System.out.printf("%40s",getSeason().name()+"  "+name());
		System.out.println();
		getDaysOfWeek();
		System.out.println(Arrays.toString(DaysOfWeek.values()));
		System.out.println();
		for(int i=1;i<=Days;i++){if(i<10)//System.out.print("     "+i+"   ");
			System.out.printf("%9s",i+"   ");
		else {System.out.print("     "+i+"  ");}
			if(i%7==0){System.out.println("\n");}
		}System.out.println();
	}
	
	
	
	public DaysOfWeek getDaysOfWeek() {
		return daysOfWeek;
	}

	public void setDaysOfWeek(DaysOfWeek daysOfWeek) {
		this.daysOfWeek = daysOfWeek;
	}

	public Season getSeason() {
		return season;
	}

	public void setSeason(Season season) {
		this.season = season;
	}

	public int getDays() {
		return Days;
	}

	public void setDays(int days) {
		Days = days;
	}
	
	
	
		
	
}
