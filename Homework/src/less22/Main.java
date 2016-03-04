package less22;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
	//default це метод який написаний реалізований в самому інтерфейсі але не має доступу ні до чого крім що бачить інтерфейс
	//static також мона в інтерфейсі з логікою  
	//метод foreach наприклад прописаний в інтерфесі коллекшн
	public static void main(String[] args) {
		List<String> list= new ArrayList<>();
		list.add("Mykola");
		list.add("Ivan");
		list.add("Petro");
		list.add("Ivan");
		list.add("Petro");
		list.forEach((/*String*/ s) -> System.out.println(s));	//спочатку вхыдны параметри а після -> то шо хочем реалізувати 1 
		list.forEach(new Consumer<String>(){		//це реалізація через анонімний клас
			@Override
			public void accept (String t){
				System.out.println(t);
			}
		});
		
		list.sort((o1,o2)-> o1.compareTo(o2));
		System.out.println();
		list.forEach(System.out::println); //лямбда вміє ітак замість 1го бо він знає що ми передаєм 1елемент колекції тому передаєм по ссилці на метод println через ::
	
		list.stream();//обект типу стрім параметризваний так як і колекція він має ті ж самі обєкти але в іншому порядку ніж в лісті хоч він знає як там було і він копіює всі елементи звідти
//		int count=0;
//		for (String string : list) {
//			if(string.equals("Ivan"))
//				count++;
//				System.out.println(string);
//		}
//		System.out.println(count+" ivaniv e");
		long count=0;
		count=list.stream().filter((s)->s.equals("Ivan"))./*filter((наступні фільтри якшо треба...)).*/count();		//.count енергiйний метод тобто запускаe те що написано все перед ним на виконання 
		System.out.println(count); 	
		
		
//		List<String> newlist=list.stream().map((p)->p.getName())
//		.collect(Collector.toList());
		//створюэ newlist в який скидає імена персонів з ліста(list) персонів
		
		//видалення з аррайліста дуже довго краще переписати в лінкедЛіст то що треба лишити
		//pallelstream B для обчислення в паралельних потоках лістів але це коли вони важкі а комп сильний. паралельних потоків створюється стіки скіки реальних ядер в конкретному процесорі
		
		//java fx ch уроки in google
	}
}
