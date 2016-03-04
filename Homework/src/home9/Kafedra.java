package home9;

import java.util.Scanner;

public enum Kafedra {
	AC(Fackultet.ICCT),ZC(Fackultet.ICCT),OC(Fackultet.ICCT),EP(Fackultet.ITRE),TK(Fackultet.ITRE),
	REPS(Fackultet.ITRE),PM(Fackultet.IMFN),OMP(Fackultet.IMFN),NGG(Fackultet.IMFN),TPP(Fackultet.INPP),
	KMP(Fackultet.INPP),PSY(Fackultet.INPP),AFM(Fackultet.IPDO),TU(Fackultet.IPDO),LOC(Fackultet.IPDO);
	
	private Fackultet fackultet;

//	private Kafedra(){}
	
	private Kafedra(Fackultet fackultet) {
		this.fackultet = fackultet;
	}

//	Fackultet scan(){
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Enter fackultet:");
//		this.fackultet=null;
//		while (scan.hasNextLine()){String k=scan.nextLine();this.fackultet=Fackultet.valueOf(k);
//		if(this.fackultet.equals(fackultet.name())){return this.fackultet;}
//		else{System.out.println("Enter correct name of fackultet:");scan();}
//		
//		}
//		return fackultet;
//	}
	
	public Fackultet getFackultet() {
		return fackultet;
	}

	public void setFackultet(Fackultet fackultet) {
			this.fackultet = fackultet;
	}
	@Override
	public String toString(){
		return "Kafedra is "+name()+". Facultet is "+fackultet.name();
	}
	
	
}
