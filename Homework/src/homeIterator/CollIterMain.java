package homeIterator;

import homeIterator.Collection.Collclass3;

public class CollIterMain {
	

	public static void main(String[] args) {
		Collection col=new Collection();
		col.getObject();
		
		Collection.Collclass1 class1=col.new Collclass1();	//inner classes внутрішні класи 1 і 2й класи
		Collection.Collclass2 class2=col.new Collclass2();	//звтчайні потребують екзмплра зовн класу
		Collection.Collclass3 class3=new Collclass3();		 // StaticNestedClass(вложений) не потребує екзпляра ЗовнКласу перед new для створення
		System.out.println();
		class1.next();
		System.out.println();
		class2.next();
		System.out.println();
		
		Object[] object=new Object[40];	//for StaticNestedClass треба тут ініціалізувати масив бо він не бачить зовн класу в себе
		class3.next(object);
		System.out.println();
		col.localClass();			//local class інніціалізується просто по назві бо я всередині його методу зробив його екзмплр
		
		Iterator it=new Iterator(){				//anonymous class -без власної назви реалізує інтерфейс або абсатр клас будь де на місці в 1му екзмплрі
			int i=object.length-1;
			@Override
			public boolean hasNext() {
				while(i-->0){
					return true;}
				return false;
			}

			@Override
			public Object[] next() {
				System.out.println();
				while(i-->0){
					object[i]=i;
					if((i-1)%3==0){
						if((Integer)(object[i])%2!=0)
						System.out.print(object[i]+" ");
					}
				}
				System.out.println("--Anonymous Class(Перевірити кожен третій елемент масиву від останнього чи він непарний,\n якщо так то вивести дані елементи на консоль)");
				return object;
			}
		};
		
		if(it.hasNext())it.next();	//--- ВИКЛИК АНОНІМНОГО КЛАСУ
		
//		Прогнати від останнього до першого
//		елементу масиву. Перевірити кожен третій елемент масиву від останнього чи він непарний, якщо так то вивести дані елементи на консоль.
		
		
		
		
		
		
		
		
		
	}

}
