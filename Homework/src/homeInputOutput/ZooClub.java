package homeInputOutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class ZooClub {
	
	private Map<Person, List<Pet>> map;

	public ZooClub() {
			this.map = new HashMap<>(); 
	}
	
	public  String stringType() {
		String str = null;
		Scanner scStr = new Scanner(System.in);
		str = scStr.next();
		return str;
	}
	
	public  Integer typeInt() {
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
	
//		������ �������� �����
	public void addPerson(Map<Person, List<Pet>> map){
		System.out.println(map);
		map.put(new Person(), new ArrayList<>());
		System.out.println(map);
	}
	
//		������ �������� �� �������� �����
	public void viewListOfPersons(Map<Person, List<Pet>> map){
		Set<Entry<Person, List<Pet>>> set=map.entrySet();
		Iterator<Entry<Person, List<Pet>>> entrIt=set.iterator();
		while(entrIt.hasNext()){
			Entry<Person, List<Pet>> entry=entrIt.next();
			System.out.print(entry.getKey()+" ");
			System.out.println(entry.getValue()+" ");
		}
	}
	
	public Person checkIfPersonExist(Map<Person, List<Pet>> map){
		Person p=null;
		System.out.println("choose one of members above:");
		String name=stringType().toLowerCase();
		Set<Entry<Person, List<Pet>>> set=map.entrySet();
		Iterator<Entry<Person, List<Pet>>> entrIt1=set.iterator();
		while(entrIt1.hasNext()){
			Entry<Person, List<Pet>> entry1=entrIt1.next();
			if(entry1.getKey().getName().toLowerCase().equals(name)){
				p=entry1.getKey();}
//			else{System.out.println("there are no such Person");}
		}
		return p;
	}
	
	public void addPetToPerson(Map<Person, List<Pet>> map){
		viewListOfPersons(map);
		Person p=checkIfPersonExist(map);
		
		System.out.println("what pet:");
		String animal=stringType().toLowerCase();
		System.out.println("name pet:");
		String nameAnimal=stringType().toLowerCase();
		if(map.get(p).equals(null)){
		map.put(p,new ArrayList<>());
		map.get(p).add(new Pet(animal,nameAnimal));}
		else{
			map.get(p).add(new Pet(animal,nameAnimal));
			}
		System.out.println(map);
		}

		
//		�������� �������� � �������� �����
	public void delPetFromPerson(Map<Person, List<Pet>> map){
		viewListOfPersons(map);
		Person p1=checkIfPersonExist(map);
		
		System.out.println("������ ��� �������� ������ ��������:");
		String animal=stringType().toLowerCase();
//		System.out.println(map.get(p1));
		Set<Entry<Person, List<Pet>>> set=map.entrySet();
		Iterator<Entry<Person, List<Pet>>> entrIt1=set.iterator();
		while(entrIt1.hasNext()){
			Entry<Person, List<Pet>> entry1=entrIt1.next();
			if(entry1.getKey().equals(p1)){
				Iterator <Pet> itvalUe=entry1.getValue().iterator();
				while(itvalUe.hasNext()){
					Pet tmp=itvalUe.next();
					if(tmp.getAnimal().equalsIgnoreCase(animal)){
						itvalUe.remove();
						}
					}
				}
			}
		System.out.println(map);
	}
	
	
	
//		�������� �������� �����
	public void delPerson(Map<Person, List<Pet>> map){
		viewListOfPersons(map);
		Person p2=checkIfPersonExist(map);
		
		Set<Entry<Person, List<Pet>>> set=map.entrySet();
		Iterator<Entry<Person, List<Pet>>> entrIt2=set.iterator();
		while(entrIt2.hasNext()){
			Entry<Person, List<Pet>> entr2=entrIt2.next();
			if(entr2.getKey().equals(p2)){
				entrIt2.remove();
			}
		}
		viewListOfPersons(map);
	}
	
//		�������� ��������� �������� � ��� ��������

	public void delPetFromAll(Map<Person, List<Pet>> map){
		viewListOfPersons(map);
		System.out.println("������ ��� �������� ������ ��������:");
		String animal=stringType().toLowerCase();
		
		Set<Entry<Person, List<Pet>>> set=map.entrySet();
		Iterator<Entry<Person, List<Pet>>> entrIt2=set.iterator();
		while(entrIt2.hasNext()){
			Entry<Person, List<Pet>> entr2=entrIt2.next();
			Iterator <Pet> itvalue=entr2.getValue().iterator();
				while(itvalue.hasNext()){
					Pet tmp=itvalue.next();
					if(tmp.getAnimal().toLowerCase().equals(animal)){
						itvalue.remove();
				}
			}
		}
		viewListOfPersons(map);
	}
	
//		������� �� ����� �������
	public void seeMapZoo(Map<Person, List<Pet>> map){
		viewListOfPersons(map);
	}
	
//	���������� ��������� ����, ����� ����� ��� ����� ����:
	public void menu(Map<Person, List<Pet>> map){
		viewListOfPersons(map);
		System.out.println();
		do{
			System.out.println("1.������ �������� �����");
			System.out.println("2.������ �������� �� �������� �����");
			System.out.println("3.�������� �������� � �������� �����");
			System.out.println("4.�������� �������� �����");
			System.out.println("5.�������� ��������� �������� � ��� ��������");
			System.out.println("6.������� �� ����� �������");
			System.out.println("7.����� � ��������");
			System.out.println();
			System.out.println("choose number:");
			int menu=typeInt();
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
		case 7:{System.exit(0);}
			}	
		}
		while(true);
	}
	
	public String iterViewMap(Map<Person, List<Pet>> map){
		String s=null;
	Set<Entry<Person, List<Pet>>> set=map.entrySet();
	Iterator<Entry<Person, List<Pet>>> entrIt1=set.iterator();
	while(entrIt1.hasNext()){
		Entry<Person, List<Pet>> entry1=entrIt1.next();
				Iterator <Pet> itvalUe=entry1.getValue().iterator();
				System.out.println(entry1);
				s=entry1.toString();
			}
	return s;
	}
	
	
//		�������� � �������
	public void dopusatU(){
		
		
		
		
	}
//		������������ � �������
	public void rewrite(){
		
		
		
		
	}
//		������� � �������� �� �������
	public void readFromNoteput (){
		
	}
	
//	�������� ���������� 
	
	public void serializacia(Map<Person, List<Pet>> map) throws IOException{
		File f=new File("d:\\noteSerial.out");
		OutputStream os =new FileOutputStream(f); //��� ������ �� �����
		ObjectOutputStream oos= new ObjectOutputStream(os);
		oos.writeObject(iterViewMap(map)); //
		oos.flush();// ����i��� ����i���� �������� ����� ����� � ��� ��� ���� ����� ������ � �������� ������ �������� ��� ������� �����
		oos.close();// �������� ������� ���������� �� ���� ������ ������������� ������ ��������� �� 
		os.close();
		
	}
	
//	�������� ������������.
		
	public void deSerializacia(Map<Person, List<Pet>> map) throws ClassNotFoundException, IOException{
		File f=new File("d:\\noteSerial.out");
		InputStream is= new FileInputStream(f);
		ObjectInputStream ois =new ObjectInputStream(is);
		String s=iterViewMap(map);
		s=(String) ois.readObject();
		ois.close();
		is.close();
		
	}
	

	public Map<Person, List<Pet>> getMap() {
		return map;
	}

	public void setMap(Map<Person, List<Pet>> map) {
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
		ZooClub other = (ZooClub) obj;
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
