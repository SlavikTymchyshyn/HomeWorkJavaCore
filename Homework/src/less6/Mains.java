package less6;

public class Mains {

	public static void main(String[] args) {

		Human vasyl = new Human(188, 80); // vasyl можна з великої але принято з
											// малої.. якщо доставити
		Human ivan = new Human();// місця в памяті для них різні
		System.out.println(vasyl.getHeight());
		System.out.println(vasyl.getWeight());// через точку ми маєм доступ до
												// читання і зміни полів метода
		vasyl.setHeight(178);
		vasyl.setWeight(70);
		System.out.println(vasyl.getHeight());
		System.out.println(vasyl.getWeight());
		vasyl.talk();
		int a = vasyl.ideal();
		System.out.println("Тут буде ідеальна вага: " + a);
		System.out.println(ivan);// викликаe назвy пакета класу і місце в памяті
		System.out.println(vasyl);
		Student petro = new Student();
		petro.ideal();
//
		System.out.println();
		Human fsd=new Student("POlitekhinka","ART");//батько може брати констуктор сина а навпаки не можна
		System.out.println();
		System.out.println(fsd);
		fsd.setHeight(165);
		fsd.setWeight(65);
		System.out.println(fsd);
	}

}
