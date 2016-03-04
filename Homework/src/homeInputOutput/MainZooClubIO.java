package homeInputOutput;



import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainZooClubIO {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Map<PersonIO, List<PetIO>> map=new HashMap<>();
		PersonIO p1=new PersonIO("Vasya",23);
		PersonIO p2=new PersonIO("Olya", 23);
		PersonIO p3=new PersonIO("Petro", 34);
		PersonIO p4=new PersonIO("Olena", 45);
		PersonIO p5=new PersonIO("Ira", 15);
		List<PersonIO> persList=new ArrayList<>();
		persList.add(p1);
		persList.add(p2);
		persList.add(p3);
		persList.add(p4);
		persList.add(p5);
		
//		System.out.println(persList);
		System.out.println();
		
		map.put(new PersonIO("Vasya",23), new ArrayList<>());
		map.get(p1).add(new PetIO("dog","Sharik"));
		map.get(p1).add(new PetIO("cat","Sadon"));
		map.put(new PersonIO("Olya", 23), new ArrayList<>());
		map.get(p2).add(new PetIO("rat","Fir"));
		map.get(p2).add(new PetIO("cat","Los"));
		map.put(new PersonIO("Petro", 34), new ArrayList<>());
		map.get(p3).add(new PetIO("rat","Best"));
		map.get(p3).add(new PetIO("cat","Kold"));
		map.put(new PersonIO("Olena", 45), new ArrayList<>());
		map.get(p4).add(new PetIO("bober","Fiory"));
		map.get(p4).add(new PetIO("dog","Rex"));
		
		map.put(new PersonIO("Ira", 15), new ArrayList<>());
		map.get(p5).add(new PetIO("dog","Rjabko"));
		map.get(p5).add(new PetIO("fishes","Akula"));
		
		ZooClubIO z0=new ZooClubIO(map);
//		z.getMap().put(key, value)
		
//		System.out.println(z.checkIfPersonExist(map));

//System.out.println(map);
//	z0.addPerson(map);
//	z0.addPetToPerson(map);
//	z0.delPetFromPerson(map); 
//	z0.delPerson(map);
//	z0.delPetFromAll(map);	
//	
//		z0.serializacia(map);
//		z0.deSerializacia(map);
//		z0.rewrite2(map);
//		z0.readFromNoteput(map);
//		z0.dopusatU(map);
//	
//	
		z0.menu(map);
	
	
	
	
	
	
	
	}

}
