package less20;

import home13MyException.Methods;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import less13.Person;

public class Main {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException {
//		String a="aaa"; //���� ��� ���������� ������� �� ��� ������ ���������� �� ���� ����� � ������ 
		Person p=new Person(null,0);
		Person p1=Person.class.newInstance(); //������� ��������� ����� �� ������������ ��� ����� ��� ���� ������i� �����������
		//  ������ ����������� ���� ���� �� ������������ ��� ����������� ���� ���� ������� ������� ��������
		System.out.println(p);
		System.out.println(p1);
//		Person.class //��������� 1
//		p.getClass();//��������� 2
		
		Field[] f= Person.class.getDeclaredFields(); 	// ��� �������� �� ���� � ����
		for (Field field : f) {
			System.out.println(field);
		}
		Method[] m= Person.class.getDeclaredMethods();	//�� ������ �� � ������������
		for (Method method : m) {
			System.out.println(method);
		}
	//�������� �� ���� �������� � ��� ���� �� ����	
		Field age= Person.class.getDeclaredField("age"); // ���� ������ �� ��� s ��� ����������� ���� �� ����
		age.setAccessible(true); //���������� ��������� ������� �� ����(��� private �� ���� ������� ������ �������)
		age.setInt(p1, 34);
		System.out.println(p1);
		
		Field name= Person.class.getDeclaredField("name");
		name.setAccessible(true); 
		name.set(p1, "Ivan");	//���� ��� ����� �� ���������� � ���� ��������� String �� set(object,..) 
		System.out.println(p1);
		
		Method setName =Person.class.getDeclaredMethod("setName", String.class);
		setName.invoke(p1, "Petro");
		System.out.println(p1);
		
		Method setAge =Person.class.getDeclaredMethod("setAge", int.class );
		setAge.invoke(p1, 20);
		System.out.println(p1);
	}
}
