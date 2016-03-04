package enums2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum Month{
	
	January(31,DaysOfWeek.values()),February(29,DaysOfWeek.values()),March(31,DaysOfWeek.values()),
	April(30,DaysOfWeek.values()),May(31,DaysOfWeek.values()),June(30,DaysOfWeek.values()),July(31,DaysOfWeek.values()),
	August(31,DaysOfWeek.values()),	September(30,DaysOfWeek.values()),October(31,DaysOfWeek.values()),
	November(30,DaysOfWeek.values()),December(31,DaysOfWeek.values());	
	
	private DaysOfWeek[] daysOfWeek;
				
	private Month(int Days,DaysOfWeek[] daysOfWeek) {
		this.daysOfWeek=new DaysOfWeek[Days];
		
		
//		for (int i=0;i<daysOfWeek.length;i++){daysOfWeek[i]=DaysOfWeek.values();}
	}
	
	
	static String[] viewMonths(int day){
		String[] m=new String[day];
		//for (int i=0;i<m.length;i++){m[i]=null;}
		for (int i=0;i<1;i++){m[i]=DaysOfWeek.MONDAY.name();}
		for (int i=1;i<2;i++){m[i]=DaysOfWeek.TUESDAY.name();}
		for (int i=2;i<3;i++){m[i]=DaysOfWeek.WEDNESDAY.name();}
		for (int i=3;i<4;i++){m[i]=DaysOfWeek.THURSDAY.name();}
		for (int i=4;i<5;i++){m[i]=DaysOfWeek.FRIDAY.name();}
		for (int i=5;i<6;i++){m[i]=DaysOfWeek.SATURDAY.name();}
		for (int i=6;i<7;i++){m[i]=DaysOfWeek.SUNDAY.name();}
		return m;
		}
	List<DaysOfWeek> viewMonths2 (int days){
	List<DaysOfWeek> daysOfWeeks=new ArrayList<>(days);	
	for (DaysOfWeek daysOfWeek : daysOfWeeks) {
		return daysOfWeeks;
	}
			return daysOfWeeks;
	}
	

	public DaysOfWeek[] getDaysOfWeek() {
		return daysOfWeek;
	}

	public void setDaysOfWeek(DaysOfWeek[] daysOfWeek) {
		this.daysOfWeek = daysOfWeek;
	}

	@Override
	public String toString(){

			return "Months "+name()+/*"--"+Arrays.toString(Season.class.getEnumConstants())+*/" "+Arrays.toString(daysOfWeek);}
	
	
}
