package enums2;
//не задіяв цей клас пока шо
public class Time {
	
	private Month month;	
	private DaysOfWeek daysOfWeek;

	public Time() {
		}

	
	static Month[] Monthday111(){
		//DaysOfWeek[] s=DaysOfWeek.values();
		Month[] m=Month.values();
		
		for (int i=0;i<m.length;i++){m[i]=null;}
		return m;
	}
	
	public DaysOfWeek getDaysOfWeek() {
		return daysOfWeek;
	}
 

	public Month getMonth() {
		return month;
	}


	public void setMonth(Month month) {
		this.month = month;
	}


	public void setDaysOfWeek(DaysOfWeek daysOfWeek) {
		this.daysOfWeek = daysOfWeek;
	}



	@Override
	public String toString() {
		return "daysOfWeek is " + daysOfWeek +" Month is " +month;
	}
	
	
}
