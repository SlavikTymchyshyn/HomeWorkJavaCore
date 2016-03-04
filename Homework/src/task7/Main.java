package task7;

import less6.Human;

public class Main {

	public static void main(String[] args) {
		Animals plazyn = new Animals("Плазун");
		Animals ssavci = new Animals("ССавці");
		Dogs bulldog = new Dogs("Бульдог", 20.6, 30.8);
		Dogs mops = new Dogs("Мопс", 6.2, 4.8);
		Dogs terjer = new Dogs("Терєр", 9.6, 15.7);
		Cats chiwur = new Cats("Чеширський", 5.5, 6.8);
		Cats egypt = new Cats("lysuj");
		Snakes kobra = new Snakes("Кобра", "Ядовита", 5.4);
		Snakes vug = new Snakes("Вуж", "неядовитий", 5.8);
		Snakes piton = new Snakes("Пітон", "ядовитий", 9.4);
		Snakes pitons = new Snakes("нотіП", "йитиводя", 4.9);
		Human kolya = new Human(160, 60);
		System.out.println();
		System.out.println(kolya);
		// System.out.println(ivan); не працює з main в тому ж пакеті що і human
		System.out.println("kolya вага = " + kolya.getWeight());
		System.out.println();
		System.out.println("довжина пітона " + piton.getLength());
		System.out.println("довжина вуж " + vug.getLength());
		System.out.println("maximal Length is "
				+ Math.max(piton.getLength(), vug.getLength()));
		System.out.println();
		System.out.println(piton);
		System.out.println(chiwur);
		System.out.println(vug);
		System.out.println(terjer);
		System.out.println();
		kolya.talk();
		System.out.println("ідеальна вага kolya " + kolya.ideal());
	}

}
