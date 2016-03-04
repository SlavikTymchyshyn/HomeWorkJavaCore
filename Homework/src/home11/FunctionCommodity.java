package home11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IllegalFormatException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FunctionCommodity {

	boolean number=true;
	boolean Auth = true;
	boolean Book = true;
	boolean Pages = true;
	boolean Year = true;
	boolean menu = true;

	private List<Commodity> commodities = new ArrayList<>();

	public int typeInt() {
		Scanner Int = new Scanner(System.in);
		String regex="[0-4]{1}";
		
		String s = Int.nextLine();
		if (s.isEmpty())
			s = "0";
		if(s.matches(regex)){
		return Integer.parseInt(s);}
		
		return Integer.parseInt(s);
	}

	public String typeString() {
		String s=null;
		Scanner str = new Scanner(System.in);
		String regex="[Andre,Berke,Jack London,Rej Bredberi,Kostova,Hemingway,Dracula,Straus,White Fang,Mars,Graf Dracula,TheOldManAndTheSea]{5,18}";
//		Pattern p=Pattern.compile(regex.toLowerCase());
//		Matcher m=p.matcher(s.toLowerCase());
		
		if(str.hasNextLine())

		{s=str.nextLine().toLowerCase();
		if(s.isEmpty()){System.out.println("ви нічого не ввели");}
		else if(s.matches(regex.toLowerCase())) {return s;}
		else{System.out.println("введіть символьне(не цифри):");}
			}
		return s;
		}
	
	public String typeStringForAdd() {
		String s=null;
		Scanner str = new Scanner(System.in);
		
		if(str.hasNextLine())
		{s=str.nextLine();
		if(s.isEmpty()){System.out.println("ви нічого не ввели");}
		else  {return s;}
					}
		return s;
		}
		
		 
//		return (str.hasNextLine()) ? s = str.nextLine() : typeString();
	

	public Commodity newCommodity(/*
								 * String nameAuthor,String nameBook,int
								 * pageAmount,int yearOfPublic
								 */) {
		System.out.println("Type nameAuthor:");
		String nameAuthor = typeStringForAdd();
		System.out.println("Type nameBook:");
		String nameBook = typeStringForAdd();
		System.out.println("Type pageAmount:");
		int pageAmount = typeInt();
		System.out.println("Type yearOfPublic:");
		int yearOfPublic = typeInt();
		return new Commodity(nameAuthor, nameBook, pageAmount, yearOfPublic);
	}

	public List<Commodity> newList() {
		System.out.println("Type size of List");
		int indx = typeInt();
		List<Commodity> commodities = new ArrayList<>();
		do {
			commodities.add(newCommodity());
		} while (commodities.size() != indx);
		return commodities;
	}

	// 1
	public void addCommodity(List<Commodity> commodities) {
		// System.out.println("enter size of list:");
		// int number=typeInt();
		// while(commodities.size()!=number)
		{
			commodities.add(newCommodity());
		}
		System.out.println(commodities);
	}

	// 2
	public void commodityDelBy(List<Commodity> commodities) {

		// System.out.println(commodities);
		System.out.println();
		System.out.println("Type nameAuthor for equal:");
		String nameAuthor = typeString();
		System.out.println("Type nameBook for equal:");
		String nameBook = typeString();
		System.out.println("Type pageAmount for equal:");
		int pageAmount = typeInt();
		System.out.println("Type yearOfPublic for equal:");
		int yearOfPublic = typeInt();

		Iterator<Commodity> iter1 = commodities.iterator();
		while (iter1.hasNext()) {
			Commodity tmp = iter1.next();
			if (tmp.getNameAuthor().equalsIgnoreCase(nameAuthor)) {
				iter1.remove();
				// System.out.println(commodities);
			} else if (tmp.getNameBook().equalsIgnoreCase(nameBook)) {
				iter1.remove();
				// System.out.println(commodities);
			} else if (tmp.getPageAmount() == pageAmount) {
				iter1.remove();
				// System.out.println(commodities);
			} else if (tmp.getYearOfPublic() == yearOfPublic) {
				iter1.remove();
			}
		}
		System.out.println(commodities);
	}

	// 3
	public void changeItem (List<Commodity> commodities) {
		System.out.println(commodities);
		System.out.println();
		System.out.println("Enter Number of item to change:");
		int porjadok = typeInt();
		porjadok -= 1;
		System.out.println(commodities.get(porjadok));
//		commodities.set(porjadok, newCommodity());
		do{
			System.out.println("1. імя автора");
			System.out.println("2. імя книжки");
			System.out.println("3. рік");
			System.out.println("4. число сторінок");
			System.out.println("5. все");
		System.out.println();
			System.out.println("щО хочете міняти?");
		int change=typeInt();
		S1:						//мітка для переходу якщо ще щось
		switch (change) {
		
		case 1:{
			System.out.println("Введіть нове імя автора");
			String nameAU=typeStringForAdd();
			commodities.get(porjadok).setNameAuthor(nameAU);
			System.out.println(commodities.get(porjadok));
			System.out.println("Ще щось?(Y/N)");
			String ask=typeStringForAdd();
			String regex="[yn]{1}";
				if(ask.matches(regex))
					{if(ask.equalsIgnoreCase("Y")){break S1;}
					else if(ask.equalsIgnoreCase("n")){return;}}
			else{System.out.println("не той символ");}
			return;
		}
		case 2:{
			System.out.println("Введіть нове імя книжки");
			String nameBook=typeStringForAdd();
			commodities.get(porjadok).setNameBook(nameBook);
			System.out.println(commodities.get(porjadok));
			System.out.println("Ще щось?(Y/N)");
			String ask=typeStringForAdd();
			String regex="[yn]{1}";
			if(ask.matches(regex))
					{if(ask.equalsIgnoreCase("Y")){break S1;}
					else if(ask.equalsIgnoreCase("n")){return;}}
			else{System.out.println("не той символ");}
			return;
		}
		case 3:{
			System.out.println("Введіть рік книжки");
			int rik=typeInt();
			commodities.get(porjadok).setYearOfPublic(rik);
			System.out.println(commodities.get(porjadok));
			System.out.println("Ще щось?(Y/N)");
			String ask=typeStringForAdd();
			String regex="[yn]{1}";
			if(ask.matches(regex))
					{if(ask.equalsIgnoreCase("Y")){break S1;}
					else if(ask.equalsIgnoreCase("n")){return;}}
			else{System.out.println("не той символ");}
			return;
		}
		case 4:{
			System.out.println("Введіть число сторінок");
			int page=typeInt();
			commodities.get(porjadok).setPageAmount(page);
			System.out.println(commodities.get(porjadok));
			System.out.println("Ще щось?(Y/N)");
			String ask=typeStringForAdd();
			String regex="[yn]{1}";
			if(ask.matches(regex))
					{if(ask.equalsIgnoreCase("Y")){break S1;}
					else if(ask.equalsIgnoreCase("n")){return;}}
			else{System.out.println("не той символ");}
			return;
		}
		case 5:{
			commodities.set(porjadok, newCommodity());			
			System.out.println(commodities.get(porjadok));
			return;
				}
			}
		}
		while(menu);
	}

	// 4 Посортувати по всьому (при натисканні повинне випасти меню, яке
	// запропонує по якому полю посортувати. Після вибору поля обрати напрям
	// сортування). Створити усі необхідні компаратори.

	public void sortCommList(List<Commodity> commodities) {
		do {
			System.out.println("1. sort by Author:");
			System.out.println();
			System.out.println("2. sort by Book:");
			System.out.println();
			System.out.println("3. sort by Pages:");
			System.out.println();
			System.out.println("4. sort by Year:");
			System.out.println();
			System.out.println("Choose number:");
			try{
			int num = typeInt();
			System.out.println();
		
		switch (num) {

		case 1: {
			do {
				System.out.println(" 	 1. sort Author by increase:");
				System.out.println();
				System.out.println("	 2. sort Author by decrease:");
				System.out.println();
				System.out.println("	 Type number:");
				int A1 = typeInt();
			switch (A1) {
			case 1: {
				Collections.sort(commodities, new CompAuthorP());
				System.out.println(commodities);//Auth=false;
				return;
			}
			case 2: {
				Collections.sort(commodities, new CompAuthorM());
				System.out.println(commodities);
				return;
				}
			}
			
			} while (Auth);
		}

		case 2: {
			do {
				System.out.println(" 	 1. sort Book by increase:");
				System.out.println();
				System.out.println("	 2. sort Book by decrease:");
				System.out.println();
				System.out.println("	 Type number:");
				int B1 = typeInt();
			switch (B1) {
			case 1: {
				Collections.sort(commodities, new CompBookP());
				System.out.println(commodities);//Auth=false;
				return;
			}
			case 2: {
				Collections.sort(commodities, new CompBookM());
				System.out.println(commodities);
				return;
				}
			}
			
			} while (Book);
		}
	
		case 3:{
			 do{
				 	System.out.println(" 	 1. sort Pages by increase:");
					System.out.println();
					System.out.println("	 2. sort Pages by decrease:");
					System.out.println();
					System.out.println("	 Type number:");
					int P1 = typeInt();
				switch (P1) {
				case 1: {
					Collections.sort(commodities, new CompPageP());
					System.out.println(commodities);//Auth=false;
					return;
				}
				case 2: {
					Collections.sort(commodities, new CompPageM());
					System.out.println(commodities);
					return;
					}
				}
				
			 } while(Pages);
		}
		case 4:{
			do{
				System.out.println(" 	 1. sort Year by increase:");
				System.out.println();
				System.out.println("	 2. sort Year by decrease:");
				System.out.println();
				System.out.println("	 Type number:");
				int Y1 = typeInt();
			switch (Y1) {
			case 1: {
				Collections.sort(commodities, new CompYearP());
				System.out.println(commodities);//Auth=false;
				return;
			}
			case 2: {
				Collections.sort(commodities, new CompYearM());
				System.out.println(commodities);
				return;
				}
			}
				
				}while(Year);
			}
		}
			}catch(NumberFormatException e){System.err.println("не вводьте symbol а цифру треб");}
		}
		while(menu);
	}
	
	public void menuAll(List<Commodity> commodities){
		do{
		try{
			System.out.println("1. Додати товар в ліст.");
			System.out.println("2. Видалити товар з ліста (вказати або всі необіхідні параметри, або по якомусь критерію).");
			System.out.println("3. Замінити товар в лісті.");
			System.out.println("4. Посортувати по всьому (при натисканні повинне випасти меню, яке запропонує по якому полю посортувати.\n Після вибору поля обрати напрям сортування). Створити усі необхідні компаратори.");
			System.out.println("0. Вихід з програми.");
			System.out.println();
			System.out.println("Type number:");
			int m1 = typeInt();
			switch (m1) {
			case 1:{addCommodity(commodities);break;}
			case 2:{commodityDelBy(commodities);break;}
			case 3:{changeItem (commodities);break;}
			case 4:{sortCommList(commodities);break;}		//якшо return тоо виходить з меню взагалі
			case 0:{System.exit(0);}
				}
			}
		catch(NumberFormatException e){System.err.println("не вводьте symbol а цифру треб");}
		}	
		while(menu);

	}
}