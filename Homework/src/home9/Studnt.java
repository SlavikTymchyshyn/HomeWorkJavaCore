package home9;

import java.util.Scanner;

public class Studnt {
	
	//private Group[] group;
	private String StdntName;
	//private int number;
	
	public Studnt() {System.out.println("Not All fields are filled");
		SdtntNameType();
	}
	
	public Studnt(String stdntName) {
		this.StdntName = stdntName;
	}
	
	public void SdtntNameType(){
		Scanner sc=new Scanner(System.in);
		if(sc.hasNextLine()){this.StdntName = sc.nextLine();}
		else{System.out.println("Type more names-->");SdtntNameType();}
	}
//	public Studnt(Group[] group, String stdntName) {
//		this.group = group;
//		StdntName = stdntName;
//	}
	
//    public static Scanner scan; 
//	public void TypeData_manually(int n){
//		int rez=0;
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Введіть Прізвище Ініціали студента: ");
//		if(rez<=n&&scan.hasNextLine()){this.StdntName = scan.nextLine();rez++;
//		System.out.println("Ви ввели: "+this.StdntName);setStdntName(this.StdntName);TypeData_manually(n-1);}
//		
//		else if(!scan.hasNextLine()){System.out.println("Type Correct symbols: ");
//		TypeData_manually(n);
//		}
//		else{System.out.println("you must type more names");
//		TypeData_manually(n);
//		}
//	}
	
	public String getStdntName() {
		return StdntName;
	}

	public void setStdntName(String stdntName) {
		StdntName = stdntName;
	}
		
	@Override
	public String toString() {
		return  StdntName;
	}
	
	
}
