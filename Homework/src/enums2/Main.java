package enums2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	static Scanner scanner;
	
	static void printPipl(){
		People [] p=People.values(); 
		for(int i=0;i<p.length;i++){
		System.out.println(p[i]);}
	} 
	
	public static void main(String[] args) {
		DaysOfWeek m=DaysOfWeek.MONDAY;
		System.out.println("name "+m.name()+" order "+m.ordinal()+1);
		
		System.out.println(DaysOfWeek.valueOf("FRIDAY"));
		if(m!=DaysOfWeek.valueOf("MONDAY")){System.out.println("Good Day");};
		System.out.println(m);
		
//!massive of seasons
		System.out.println();
		//Season [] seasons= Season.values();
		//for (int i=0;i<seasons.length;i++){System.out.println(seasons[i]);}
//або foreach-ом
		for (Season season : Season.values()) {
			System.out.print(season+" ");
		}
	System.out.println();
	System.out.println();	
//!massive of months
		Month[] name=Month.values();
		for(int i1=0;i1<name.length;i1++){
			System.out.println(name[i1]);}
//		
	//System.out.println();
//!massive of days 1st way of display
//		for (DaysOfWeek daysOfWeek: DaysOfWeek.values()){
//		System.out.print(""+daysOfWeek+" ");
//		}
	System.out.println();
//!!!massive of days 2nd way of display
//	System.out.println(Arrays.toString(DaysOfWeek.values())); 
	
//
	String [] s=Month.viewMonths(30);
	for (String s1 : s) {
		System.out.print(s1+" ");
	}
	System.out.println();
	List<Month> months =new ArrayList<>();
	Month.viewMonths(30);
	System.out.print(Arrays.toString(Month.values()));

		/*Integer integer =new Integer(54);
		//int i =54;
		String str= "232";
		int i =Integer.parseInt(str);
		System.out.println(i+integer);*/
			
		//printPipl();
		//Month.viewMonths();
		//		
//		System.out.println(People.Natasha);
//		
//		scanner =new Scanner(System.in);
//		System.out.println("Print");
//		if(scanner.hasNextInt()){int str=scanner.nextInt();
//		System.out.println(str);}
//		else{
//			System.out.println("error");
//			//Main main = new Main();
//			main(new String []{}); // рекурсiя заворот класа на самого себе знову
//			}
////		String str =scanner.next();//read only one word
//		System.out.println(str);
	}
}
