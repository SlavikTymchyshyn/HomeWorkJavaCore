package home9;

import java.util.Arrays;
	
	public class MainNabyr {
	
	public static void main(String[] args) {
//		Studnt s20=new Studnt("Petrov Yuriy");
//		Studnt s1=new Studnt("Dodik Yuriy");
		
		Group.grEP1.getStudnt()[0]=new Studnt("Petrov Yuriy");
		Group.grEP1.getStudnt()[1]=new Studnt("Volkov Yuriy");
		Group.grEP1.getStudnt()[2]=new Studnt(null);
		Group.grEP1.getStudnt()[3]=new Studnt("teterov Yuriy");
		Group.grEP1.getStudnt()[4]=new Studnt("Dredov Yuriy");
		System.out.println(Group.grEP1);
//		System.out.println();
//		System.out.println(Group.grPM1);
//		Group.grPM1.ChangeLimitGroup(Group.grPM1.getStudnt(),7);
//		Group.grPM1.getStudnt()[0]=new Studnt(null);
//		Group.grPM1.getStudnt()[1]=new Studnt();

//		System.out.println(Group.grPM1);
		if(Arrays.toString(Kafedra.values()).contains("ITRE"))
		{System.out.println("yes");}
		else
		{System.out.println("nothing");}
		
		System.out.println(Group.valueOf(Fackultet.class, "ITRE"));
//		System.out.println(Arrays.toString(Kafedra.class.getEnumConstants()));
//		System.out.println(Kafedra.valueOf("AC"));
//		System.out.println(Kafedra.valueOf(Kafedra.class, "AC"));
//		System.out.print(Arrays.toString(Kafedra.values()));
		
//		System.out.println(Group.grPM1);
//		Group.display("gr");
		
		
		
	}

}
