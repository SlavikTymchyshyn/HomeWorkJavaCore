package addonless200216;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Singleton {
	
	private static Singleton instance=new Singleton();
	
	private Singleton (){
		}
	
	public static Singleton getInstance(){
		/*if(instance==null){instance=new Singleton();}
		else{instance=new Singleton();}*/
		return instance;
	}
	
	public Date parseToDate(String date){
		SimpleDateFormat formatter =new SimpleDateFormat();
		try{
			return formatter.parse(date);
		}catch (ParseException e){
			return null;
			}
		}
	
	public String parseToString(Date date){
		SimpleDateFormat formatter=new SimpleDateFormat();
		return formatter.format(date);
		}



}
	
