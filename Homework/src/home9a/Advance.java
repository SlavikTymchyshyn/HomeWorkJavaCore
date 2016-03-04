package home9a;

import java.util.Scanner;

public class Advance extends Loop{
		
	public void Calculator(){
			Double num1=typeInDouble();		
			char znak=typeInChar();		
			Double num2=typeInDouble();		
			switch (znak){
			case '+':System.out.println(num1+"+"+num2+"="+(num1+num2));break;
			case '-':System.out.println(num1+"-"+num2+"="+(num1-num2));break;
			case '/':System.out.println(num1+"/"+num2+"="+(num1/num2));break;
			case '*':System.out.println(num1+"*"+num2+"="+(num1*num2));break;
			}
	}

	public static double Calculator(Double num1,char znak,Double num2){
//		Double num1=typeInDouble();		
//		char znak=typeInChar();		
//		Double num2=typeInDouble();	
		double num3=0;
		switch (znak){
		case '+':return num3=(num1+num2);
		case '-':return num3=(num1-num2);
		case '/':return num3=(num1/num2);
		case '*':return num3=(num1*num2);
		}
		return num3;
}




































}
