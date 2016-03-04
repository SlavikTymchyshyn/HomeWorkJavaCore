package home4;

public class Main {
	
	static void pr(Pet pet)
	{System.out.print(pet.getClass().getSimpleName()+" ");
	pet.Voice();}
	
	public static void main(String[] args) {
//		Dog d=new Dog();
//		d.Voice();
	pr(new Dog());
	pr(new Cat());
	pr(new Cow());
	}

}
