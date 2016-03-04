package home9a;

import static java.lang.Math.*;

import java.util.Scanner;

public class Ifelse3 {
		
	
	static void scan(){
		
	double a=0;
	double b=0;
	double c=0;
	
	Scanner asc=new Scanner(System.in);
	Scanner bsc=new Scanner(System.in);
	Scanner csc=new Scanner(System.in);
	
//	System.out.println("Type a:");
//	if(asc.hasNextDouble()){ a=asc.nextDouble();System.out.println("a="+a);
//	}else{System.out.println("Type double for a: ");scan();}
//	System.out.println("Type b:");
//	if(bsc.hasNextDouble()){b=bsc.nextDouble();System.out.println("b="+b);
//	}else{System.out.println("Type double for b: ");scan();}
//	System.out.println("Type c:");
//	if(csc.hasNextDouble()){c=csc.nextDouble();System.out.println("c="+c);
//	}else{System.out.println("Type double for c: ");scan();}
	
//	чому в нижній реалізації треба по 2раза значення вводити ---о тре break;
//	do{System.out.println("Type a:");a=asc.nextDouble();break;}while(!asc.hasNextDouble());
//	do{System.out.println("Type b:");b=bsc.nextDouble();break;}while(!bsc.hasNextDouble());
//	do{System.out.println("Type c:");c=csc.nextDouble();break;}while(!csc.hasNextDouble());
	
// через лог операнди зм!нна=лог!ка ? вираз1(if yes) : вираз2(if no)
	System.out.println("Type a:");
	a= asc.hasNextDouble()?asc.nextDouble():bsc.nextDouble();
	System.out.println("Type b:");
	b= bsc.hasNextDouble()?bsc.nextDouble():csc.nextDouble();
	System.out.println("Type c:");
	c= csc.hasNextDouble()?csc.nextDouble():asc.nextDouble();
	
	double x1 = (sqrt(pow(b, 2) - 4 * a * c) - b) / (2 * a);
	double x2 = (sqrt(pow(b, 2) - 4 * a * c) + b) / (2 * a);
	
	if (Double.isNaN(x1)) {
		System.out.print("there is No result For x1; ");
	} else {
		System.out.print("x1 = " + x1 + ";");
	}
	if (Double.isNaN(x2)) {
		System.out.println("there is No result For x2;");
	} else {
		System.out.println(" x2 = " + x2 + ";");
	}
//	double a1[]={x1,x2};
//	return a1;
	}
	
	static void check2(){
		double e1=0;
		double e2=0;
		int u=10;
		Scanner esc=new Scanner(System.in);
		Scanner dsc=new Scanner(System.in);
		System.out.println("Type e1:");
		if(esc.hasNextDouble()){e1=esc.nextDouble();System.out.println("e1="+e1);
		}else{System.out.println("Type double for e1: ");check2();}
		System.out.println("Type e2:");
		if(dsc.hasNextDouble()){e2=dsc.nextDouble();System.out.println("e2="+e2);
		}else{System.out.println("Type double for e2: ");check2();}
		if((e1-u)>(e2-u)){System.out.println("е2 ближче до 10");}
		else{System.out.println("е1 ближче до 10");}
	}
	
	static void check1(){
		double e3=0;
		Scanner es=new Scanner(System.in);
		System.out.println("Type e3:");
		if(es.hasNextDouble()){e3=es.nextDouble();System.out.println("e3="+e3);
		}else{System.out.println("Type double for e3: ");check1();}
		if((e3%2)==0){System.out.println("число (even) парне");}
		else{System.out.println("число (odd) Heпарне");}
	}
	
	public static void main(String[] args) {
		
		scan();
		//check1();

	}
//4 6 2 works
}
