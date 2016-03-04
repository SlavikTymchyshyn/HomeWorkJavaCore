package home9a;

import static java.lang.Math.*;

import java.util.Arrays;
import java.util.Random;

public class Loops extends Advance{
		
	public static void main(String[] args) {
			
// AVG Value   
//			int k=100;
//		   int s=200;
//		while(++k<--s);
//		System.out.println("avg "+s);
		
//		s1: for (int i=0;i<3;i++){System.out.print("хід "+i+" :");{
//		for(int j=0;j<99;j++){if(j==10)break s1;System.out.print(" "+j+" ");}
//		}
//		System.out.println();
//		}                                     //приклад з вложеними циклами break-мітки s1 для виходу з зовнішнього циклу
	//без мітки break можна завершити тільки смий внутрішній з вложених циклів
		
			
		Fibona4 f =new Fibona4();
		Advance a=new Advance();
		Loop l=new Loop();
		
//		Loop l1=new Loop();
//		Loop l2=l1;     
		
		/*equals i hashCode ізначально провіряють чи ссилки йдуть на один і той же обєкт не враховуючи*/ 
			/*полів тобто обєкти l і l1 хоч і однакові у них різні хешкоди і вони не еквівалентні тому що 
			 * різне місце в памяті. А l1 і l2 при equals і порівнянні хешКода дасть true тому що ссилка йде на один
			 * і той же обєкт. Інший варіант можна overrid'нути методи Object`a equals і hashCode()вручну а можна
			 * shift-alt-s редактором eclipse 
			 * hashCode() ізначально рендомне число в діапазоні інт для кожного обєкту своє і кожен раз інше при перезапуску програми
			 * */
		
//		if(l1.equals(l2)){System.out.println("true");}else {System.out.println("false");}
//		if(l1.hashCode()==l2.hashCode()){System.out.println("hashCode equal");}else {System.out.println("hashCode not equal");}
		

//		System.out.println(a.typeInChar());
//		a.Calculator();
//		f.Fibona_3(-10, 12);
//		f.Fibona44i();
//		System.out.println();
//		f.Fibona44i2();
		// System.out.println(fact(typeIn()));//факторіал
		// Alldivisors(typeIn());////всі позитивні дільники 8ме завдання
		
//		int []f=new int[4];
//		for (int i=0;i<f.length;i++){	f[i] = (int) (random() * (100 - 9) + 9);
//		}
//		System.out.println(Arrays.toString(f));
//		System.out.println(l.MassIncrease3(f));
//		l.sequence10();
//		System.out.println(l.fact(l.typeInInt())); //Factorial
//		l.FoundValue(12);
//		l.fibomy(11);
//		l.divisors(l.typeInInt());
//		l.poslidovn10(3);
//		a.EnterNumber(a.typeInInt());
//		double k=-4.0;
//		System.out.println("ceil="+ceil(k)+" floor="+floor(k));
//		 l.Aftermass1(l.typeInInt());
//		int number = new Random().nextInt(2) + 1;
//		System.out.println(number);
//		Integer number1 = new Integer((int) (random() * 2 + 1));
//		System.out.println(number1);
//		l.massMaxValue();
//		l.massIncrease();
//		l.mass9();
//		l.mass1();
//		l.add(l.typeInInt(),l.typeInInt());
//		l.threeNum(l.typeInDouble(),l.typeInDouble(),l.typeInDouble());
//		l.polindrom(l.typeInWord());
//		l.delCharInLine(l.typeInWord(),a.typeInWord());
//		l.LineToLowOrUpper(l.typeInWord());
//		l.Weekend(l.typeInWord());
//		l.MassIncrease2();
//		a.compareTo(a.typeInWord(), a.typeInWord());
	}
}
