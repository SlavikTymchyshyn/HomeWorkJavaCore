package home9;

import java.util.Arrays;
import java.util.Scanner;

public enum Group {
	grAC1(Kafedra.AC,10), grAC2(Kafedra.AC,12), grZC1(Kafedra.ZC,10), grZC2(Kafedra.ZC,5), grOC1(Kafedra.OC,15),					
	grOC2(Kafedra.OC,14), grEP1(Kafedra.EP,5), grEP2(Kafedra.EP,10), grTK1(Kafedra.TK,15), grTK2(Kafedra.TK,8), 
	grREPS1(Kafedra.REPS,11), grREPS2(Kafedra.REPS,10), grPM1(Kafedra.PM,5), grPM2(Kafedra.PM,8),  grOMP1(Kafedra.OMP,9),
	grOMP2(Kafedra.OMP,10), grNGG1(Kafedra.NGG,10),grNGG2(Kafedra.NGG,5), grTPP1(Kafedra.TPP,5),grTPP2(Kafedra.TPP,8),
	grKMP1(Kafedra.KMP,9),grKMP2(Kafedra.KMP,9), grPSY1(Kafedra.PSY,9),grPSY2(Kafedra.PSY,6),grPSY3(Kafedra.PSY,7),
	grAFM1(Kafedra.AFM,6),grAFM2(Kafedra.AFM,7), grTU1(Kafedra.TU,8),grTU2(Kafedra.TU,5),
	grLOC(Kafedra.LOC,12);

	/*grAC1 це константи, Kafedra.AC це посилання на константу(його можна міняти), 10 це просто число яке можна міняти 
	 * Kafedra kafedra тут якби було static final то ту ссилку при введенні не можна було міняти*/	
	
	
	private Kafedra kafedra;
	private int number; 
	private Studnt[] studnt;

	private Group(){}
	
	private Group(Kafedra kafedra,int number) {
		this.kafedra = kafedra;
		this.studnt=new Studnt[this.number=number];
	}
//метод change limit of group
	void ChangeLimitGrouP(Studnt[] studnt,int numb){
		System.out.println("limit of group is "+getNumber());
		this.studnt =new Studnt[numb];
		this.number=numb;
		System.out.println("Current limit of group is "+getNumber());
	} 
	Studnt[] ChangeLimitGroup(Studnt[] studnt,int numb){
		System.out.println("limit of group is "+getNumber());
		this.studnt =new Studnt[numb];
		this.number=numb;
		System.out.println("Current limit of group is "+getNumber());
		return studnt;
	} 
	
	static String typeSearchWord(){
		System.out.println("TypeFindWord: ");
		Scanner f= new Scanner(System.in);
		String g=null;
		return(f.hasNextLine())?g=f.nextLine():typeSearchWord();
//		else{System.out.println("Enter correct word");typeSearchWord();}
//	return g;
	
	}
	
	static void display(String g){
		String c=Group.valueOf("grREPS1").toString();
		boolean Display=false;
		if(Group.valueOf("grREPS1").equals(grREPS1)){
			Display=true;
		System.out.println("equal");
		if(Display){System.out.println(Group.typeSearchWord());}}
		else if(g.compareTo(c)<0){System.out.println("word is shorter");}
		else if(g.compareTo(c)>0){System.out.println("word is longer");}
	}
	
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Kafedra getKafedra() {
		return kafedra;
	}

	public void setKafedra(Kafedra kafedra) {
		this.kafedra = kafedra;
	}
	
	public Studnt[] getStudnt() {
		return studnt;
	}

	public void setStudnt(Studnt[] studnt) {
		this.studnt = studnt;
	}

	@Override
	public String toString(){
		return "Факультет-"+kafedra.getFackultet().name()+", Кафедра-"+kafedra.name()+", Группа: "+name()+", MAx.Number of students: "+number+ " {Імена студентів "+Arrays.toString(studnt)+" }";
	}
}
