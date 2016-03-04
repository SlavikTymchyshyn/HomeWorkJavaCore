package enums2;

public enum Season {
	
	WINTER(Month.December,Month.January,Month.February),
	SPRING(Month.March,Month.April,Month.May),
	SUMMER(Month.June,Month.July,Month.August),
	AUTUMN(Month.September,Month.October,Month.November);

	private Month month;
//	private static Month month;
	//private Season season;
	
   private Season(Month month,Month month2,Month month3) {  
	   this.month=month;
	   this.month=month2;
	   this.month=month3;
	}

public Month getMonth() {
	return month;
}

public void setMonth(Month month) {
	this.month = month;
}

@Override
	public String toString() {
		return "Season is "+name()+"-ordering by "+(ordinal()+1);}
}
   

