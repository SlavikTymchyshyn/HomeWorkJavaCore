package homeInputOutput;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class ZooClubIO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 9184749281674082918L;
	private Map<PersonIO, List<PetIO>> map;

	public ZooClubIO(Map<PersonIO, List<PetIO>> map) {
			this.map = new HashMap<>(); 
	}
	
	  String stringType() {
		String str = null;
		Scanner scStr = new Scanner(System.in);
		str = scStr.next();
		return str;
	}
	
	  Integer typeInt() {
		Integer i;
		String str = null;
		Scanner scInt = new Scanner(System.in);
		String regex = "[0-9]{1,2}";
		while (scInt.hasNext()) {

			str = scInt.next();
			if (str.isEmpty()) {
				return 0;
			} else if (str != null && str.matches(regex)) {
				i=Integer.parseInt(str);
				if(i==0){System.out.println("enter between 1-99");
				return 0;}else
				return Integer.parseInt(str);
			} else {
				System.out.println("enter between 1-99");
				return 0;
			}
		}
		return Integer.parseInt(str);
	}
	
	  Integer typeIntMenu() {
		Integer i;
		String str = null;
		Scanner scInt = new Scanner(System.in);
		String regex = "[1-9,0-2]{1,2}";
		while (scInt.hasNext()) {

			str = scInt.next();
			if (str.isEmpty()) {
				return 0;
			} else if (str != null && str.matches(regex)) {
				i=Integer.parseInt(str);
				if(i==0){System.out.println("enter between 1-12");
				return 0;}else
				return Integer.parseInt(str);
			} else {
				System.out.println("enter between 1-12");
				return 0;
			}
		}
		return Integer.parseInt(str);
	}
	
//		Додати учасника клубу
	 void addPerson(Map<PersonIO, List<PetIO>> map){
		System.out.println(map);
		map.put(new PersonIO(), new ArrayList<>());
		System.out.println(map);
	}
	
//		Додати тваринку до учасника клубу
	 void viewListOfPersons(Map<PersonIO, List<PetIO>> map){
		Set<Entry<PersonIO, List<PetIO>>> set=map.entrySet();
		Iterator<Entry<PersonIO, List<PetIO>>> entrIt=set.iterator();
		while(entrIt.hasNext()){
			Entry<PersonIO, List<PetIO>> entry=entrIt.next();
			System.out.print(entry.getKey()+" ");
			System.out.println(entry.getValue()+" ");
		}
	}
	
	 PersonIO checkIfPersonExist(Map<PersonIO, List<PetIO>> map){
		PersonIO p=null;
		System.out.println("choose one of members above:");
		String name=stringType().toLowerCase();
		Set<Entry<PersonIO, List<PetIO>>> set=map.entrySet();
		Iterator<Entry<PersonIO, List<PetIO>>> entrIt1=set.iterator();
		while(entrIt1.hasNext()){
			Entry<PersonIO, List<PetIO>> entry1=entrIt1.next();
			if(entry1.getKey().getName().toLowerCase().equals(name)){
				p=entry1.getKey();}
//			else{System.out.println("there are no such Person");}
		}
		return p;
	}
	
	 void addPetToPerson(Map<PersonIO, List<PetIO>> map){
		viewListOfPersons(map);
		PersonIO p=checkIfPersonExist(map);
		
		System.out.println("what pet:");
		String animal=stringType().toLowerCase();
		System.out.println("name pet:");
		String nameAnimal=stringType().toLowerCase();
		try{
		if(map.get(p).equals(null)){
		map.put(p,new ArrayList<>());
		map.get(p).add(new PetIO(animal,nameAnimal));
		}
		else{
			map.get(p).add(new PetIO(animal,nameAnimal));
			}
	}catch(NullPointerException e){System.err.println("нема такого імені в списку");}
		System.out.println(map);
		}

		
//		Видалити тваринку з учасника клубу
	 void delPetFromPerson(Map<PersonIO, List<PetIO>> map){
		viewListOfPersons(map);
		PersonIO p1=checkIfPersonExist(map);
		
		System.out.println("Введіть яку тваринку хочете Видалити:");
		String animal=stringType().toLowerCase();
//		System.out.println(map.get(p1));
		Set<Entry<PersonIO, List<PetIO>>> set=map.entrySet();
		Iterator<Entry<PersonIO, List<PetIO>>> entrIt1=set.iterator();
		while(entrIt1.hasNext()){
			Entry<PersonIO, List<PetIO>> entry1=entrIt1.next();
			if(entry1.getKey().equals(p1)){
				Iterator <PetIO> itvalUe=entry1.getValue().iterator();
				while(itvalUe.hasNext()){
					PetIO tmp=itvalUe.next();
					if(tmp.getAnimal().equalsIgnoreCase(animal)){
						itvalUe.remove();
						}
					}
				}
			}
		System.out.println(map);
	}
	
	
	
//		Видалити учасника клубу
	 void delPerson(Map<PersonIO, List<PetIO>> map){
		viewListOfPersons(map);
		PersonIO p2=checkIfPersonExist(map);
		
		Set<Entry<PersonIO, List<PetIO>>> set=map.entrySet();
		Iterator<Entry<PersonIO, List<PetIO>>> entrIt2=set.iterator();
		while(entrIt2.hasNext()){
			Entry<PersonIO, List<PetIO>> entr2=entrIt2.next();
			if(entr2.getKey().equals(p2)){
				entrIt2.remove();
			}
		}
		viewListOfPersons(map);
	}
	
//		Видалити конкретну тваринку зі всіх власників

	 void delPetFromAll(Map<PersonIO, List<PetIO>> map){
		viewListOfPersons(map);
		System.out.println("Введіть яку тваринку хочете Видалити:");
		String animal=stringType().toLowerCase();
		
		Set<Entry<PersonIO, List<PetIO>>> set=map.entrySet();
		Iterator<Entry<PersonIO, List<PetIO>>> entrIt2=set.iterator();
		while(entrIt2.hasNext()){
			Entry<PersonIO, List<PetIO>> entr2=entrIt2.next();
			Iterator <PetIO> itvalue=entr2.getValue().iterator();
				while(itvalue.hasNext()){
					PetIO tmp=itvalue.next();
					if(tmp.getAnimal().toLowerCase().equals(animal)){
						itvalue.remove();
				}
			}
		}
		viewListOfPersons(map);
	}
	
//		Вивести на екран зооклуб
	 void seeMapZoo(Map<PersonIO, List<PetIO>> map){
		viewListOfPersons(map);
	}
	
//	Реалізувати консольне меню, таким чином щоб можна було:
	 void menu(Map<PersonIO, List<PetIO>> map) throws ClassNotFoundException, IOException{
		viewListOfPersons(map);
		System.out.println();
		do{
			System.out.println("1.Додати учасника клубу");
			System.out.println("2.Додати тваринку до учасника клубу");
			System.out.println("3.Видалити тваринку з учасника клубу");
			System.out.println("4.Видалити учасника клубу");
			System.out.println("5.Видалити конкретну тваринку зі всіх власників");
			System.out.println("6.Вивести на екран зооклуб");
			System.out.println("7.Дописати в блокнот");
			System.out.println("8.Перезаписати в блокнот");
			System.out.println("9.Зчитати з блокноту на консоль");
			System.out.println("10.Провести серіалізацію");
			System.out.println("11.Провести десеріалізацію");
			System.out.println("12.Вийти з програми");
				System.out.println();
			System.out.println("choose number:");
			int menu=typeIntMenu();
		switch(menu){
		case 1:{addPerson(map);
		break;}
		case 2:{addPetToPerson(map);
		break;}
		case 3:{delPetFromPerson(map);
		break;}
		case 4:{delPerson(map);
		break;}
		case 5:{delPetFromAll(map);
		break;}
		case 6:{seeMapZoo(map);
		break;}
		case 7:{dopusatU(map);
		break;}
		case 8:{rewrite(map);
		break;}
		case 9:{readFromNoteput(map);
		break;}
		case 10:{serializacia(map);
		break;}
		case 11:{deSerializacia(map);
		break;}
		case 12:{System.exit(0);}
			}	
		}
		while(true);
	}
	
	 String iterViewMap(Map<PersonIO, List<PetIO>> map){
		String s=null;
	Set<Entry<PersonIO, List<PetIO>>> set=map.entrySet();
	Iterator<Entry<PersonIO, List<PetIO>>> entrIt1=set.iterator();
	while(entrIt1.hasNext()){
		Entry<PersonIO, List<PetIO>> entry1=entrIt1.next();
				Iterator <PetIO> itvalUe=entry1.getValue().iterator();
				System.out.println(entry1);
				s=entry1.toString();
			}
	return s;
	}
	
	
//		Дописати в блокнот
	 void dopusatU(Map<PersonIO, List<PetIO>> map) throws IOException, ClassNotFoundException{
		Map<PersonIO, List<PetIO>> now=new HashMap<>();
		try{
				File f=new File("d:\\notePadMap.txt");
		
					InputStream is= new FileInputStream(f);
		ObjectInputStream ois =new ObjectInputStream(is);
		now=(Map<PersonIO, List<PetIO>>) ois.readObject();
		ois.close();
		is.close();
		System.out.println(now);
		 
		if (now!=null&&now.equals(map)){System.out.println("нема шо дописувати");}
		else if(now!=null&&!now.equals(map)){
			OutputStream os =new FileOutputStream(f); //даэ доступ до файлу
			ObjectOutputStream oos= new ObjectOutputStream(os);
			oos.writeObject(map); //
			oos.flush();// потрiбно термiново виконати запис краще з ним тоді воно запис робить в окремому потоці особенно для великих файлів
			oos.close();// закриття ресурсів обовязково бо буде падати продуктивнысь падати оператива бо 
			os.close();

			System.out.println("дописано");
			}
		else{System.out.println("null is expected");}
		}catch(FileNotFoundException e){System.err.println("не найшло файла");}
		
	}
	
//		Перезаписати в блокнот
	
	 void rewrite(Map<PersonIO, List<PetIO>> map) throws IOException{  //work
//		String str=iterViewMap(map);
		File f=new File("d:\\notePad.txt");
		try(FileWriter fw= new FileWriter(f)){
			fw.write(map.toString());
			fw.flush();
			fw.close();
		}catch(IOException e){
		}
		System.out.println("data rewrited");
	}
	
	 void rewrite2(Map<PersonIO, List<PetIO>> map) throws IOException{  //work
//		String str=iterViewMap(map);
			File f=new File("d:\\notePad.txt");
		try(FileWriter fw= new FileWriter(f)){
			fw.write(map.toString());
			fw.flush();
			fw.close();
		}catch(IOException e){
				}
		 System.out.println("data rewrited");
	}
	
//		Зчитати з блокноту на консоль
	 void readFromNoteput (Map<PersonIO, List<PetIO>> map) throws IOException, ClassNotFoundException{
		
		File f=new File("d:\\notePadMap.txt");
		OutputStream os =new FileOutputStream(f); //даэ доступ до файлу
		ObjectOutputStream oos= new ObjectOutputStream(os);
		oos.writeObject(map); //
		oos.flush();// потрiбно термiново виконати запис краще з ним тоді воно запис робить в окремому потоці особенно для великих файлів
		oos.close();// закриття ресурсів обовязково бо буде падати продуктивнысь падати оператива бо 
		os.close();
		InputStream is= new FileInputStream(f);
		ObjectInputStream ois =new ObjectInputStream(is);
		map=(Map<PersonIO, List<PetIO>>) ois.readObject();
		System.out.println(map);
		ois.close();
		is.close();
	
	}
	
//	Провести серіалізацію //work
	
	 void serializacia(Map<PersonIO, List<PetIO>> map) throws IOException{
		File f=new File("d:\\noteSerial.out");
		OutputStream os =new FileOutputStream(f); //даэ доступ до файлу
		ObjectOutputStream oos= new ObjectOutputStream(os);
		oos.writeObject(map); //
		oos.flush();// потрiбно термiново виконати запис краще з ним тоді воно запис робить в окремому потоці особенно для великих файлів
		oos.close();// закриття ресурсів обовязково бо буде падати продуктивнысь падати оператива бо 
		os.close();
		System.out.println("серіалізація зроблена");
	}
	
//	Провести десеріалізацію. //work
		
	 void deSerializacia(Map<PersonIO, List<PetIO>> map) throws ClassNotFoundException, IOException{
		File f=new File("d:\\noteSerial.out");
		InputStream is= new FileInputStream(f);
		ObjectInputStream ois =new ObjectInputStream(is);
		String s=iterViewMap(map);
		map=(Map<PersonIO, List<PetIO>>) ois.readObject();
		ois.close();
		is.close();
		System.out.println("Десеріалізація зроблена");
		
	}
	

	public Map<PersonIO, List<PetIO>> getMap() {
		return map;
	}

	public void setMap(Map<PersonIO, List<PetIO>> map) {
		this.map = map;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((map == null) ? 0 : map.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ZooClubIO other = (ZooClubIO) obj;
		if (map == null) {
			if (other.map != null)
				return false;
		} else if (!map.equals(other.map))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ZooClub map=" + map + "\n";
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
