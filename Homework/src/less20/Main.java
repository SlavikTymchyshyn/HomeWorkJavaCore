package less20;

import home13MyException.Methods;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import less13.Person;

public class Main {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException {
//		String a="aaa"; //€кщо так створювати стрычки то всы будуть посилатись на одне мысце в пам€ты 
		Person p=new Person(null,0);
		Person p1=Person.class.newInstance(); //створюэ екземпл€р класу по замовчуванню дл€ цього маэ бути порожнiй конструктор
		//  пустий конструктор тыки тоды по замовчуванню сам приймаэтьс€ €кщо нема взагалы ны€кого створено
		System.out.println(p);
		System.out.println(p1);
//		Person.class //рефлексы€ 1
//		p.getClass();//рефлексы€ 2
		
		Field[] f= Person.class.getDeclaredFields(); 	// так д≥знаЇтьс€ вс≥ пол€ в клас≥
		for (Field field : f) {
			System.out.println(field);
		}
		Method[] m= Person.class.getDeclaredMethods();	//вс≥ методи €к≥ Ї задекларован≥
		for (Method method : m) {
			System.out.println(method);
		}
	//–ефлекс≥€ це коли працювти з тим чого ще нема	
		Field age= Person.class.getDeclaredField("age"); // €кшо багато то без s “ут вит€гуэтьс€ поле по ≥мен≥
		age.setAccessible(true); //встановити можлив≥сть доступу до пол€(дл€ private бо буде просити кидати помилки)
		age.setInt(p1, 34);
		System.out.println(p1);
		
		Field name= Person.class.getDeclaredField("name");
		name.setAccessible(true); 
		name.set(p1, "Ivan");	//€кшо тип даних не прим≥тивний а обЇкт наприклад String то set(object,..) 
		System.out.println(p1);
		
		Method setName =Person.class.getDeclaredMethod("setName", String.class);
		setName.invoke(p1, "Petro");
		System.out.println(p1);
		
		Method setAge =Person.class.getDeclaredMethod("setAge", int.class );
		setAge.invoke(p1, 20);
		System.out.println(p1);
	}
}
