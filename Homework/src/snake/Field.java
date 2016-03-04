package snake;

import java.io.IOException;
import java.util.Scanner;

	
 abstract class Field implements Move {
		
	public String typeString() {
		String str=null;
		String regex="[wasdWASDô³âöÔ²ÂÖÔÛÂÖôûâö]{1}";
		Scanner sc=new Scanner(System.in);
		
			str=sc.next();
		
		if(str!=null&&!str.matches(regex)){
			System.out.println("enter {w,a,s or d}");
		}
		else if(str!=null&&str.matches(regex)){
			return str;
		}
		
		else {System.out.println("enter {w,a,s or d}");}
		return str;
	}
	
	
}