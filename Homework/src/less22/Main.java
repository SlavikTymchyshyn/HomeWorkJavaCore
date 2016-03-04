package less22;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
	//default �� ����� ���� ��������� ����������� � ������ ��������� ��� �� �� ������� � �� ���� ��� �� ������ ���������
	//static ����� ���� � ��������� � ������  
	//����� foreach ��������� ���������� � �������� ��������
	public static void main(String[] args) {
		List<String> list= new ArrayList<>();
		list.add("Mykola");
		list.add("Ivan");
		list.add("Petro");
		list.add("Ivan");
		list.add("Petro");
		list.forEach((/*String*/ s) -> System.out.println(s));	//�������� ������ ��������� � ���� -> �� �� ����� ���������� 1 
		list.forEach(new Consumer<String>(){		//�� ��������� ����� �������� ����
			@Override
			public void accept (String t){
				System.out.println(t);
			}
		});
		
		list.sort((o1,o2)-> o1.compareTo(o2));
		System.out.println();
		list.forEach(System.out::println); //������ �쳺 ���� ������ 1�� �� �� ��� �� �� ������� 1������� �������� ���� ������� �� ������ �� ����� println ����� ::
	
		list.stream();//����� ���� ���� ��������������� ��� �� � �������� �� �� � � ��� ����� ��� � ������ ������� �� � ��� ��� �� ��� �� ��� ���� � �� ����� �� �������� �����
//		int count=0;
//		for (String string : list) {
//			if(string.equals("Ivan"))
//				count++;
//				System.out.println(string);
//		}
//		System.out.println(count+" ivaniv e");
		long count=0;
		count=list.stream().filter((s)->s.equals("Ivan"))./*filter((������� ������� ���� �����...)).*/count();		//.count �����i���� ����� ����� �������e �� �� �������� ��� ����� ��� �� ��������� 
		System.out.println(count); 	
		
		
//		List<String> newlist=list.stream().map((p)->p.getName())
//		.collect(Collector.toList());
		//������� newlist � ���� ����� ����� ������� � ����(list) �������
		
		//��������� � ��������� ���� ����� ����� ���������� � �����˳�� �� �� ����� ������
		//pallelstream B ��� ���������� � ����������� ������� ���� ��� �� ���� ���� ���� � ���� �������. ����������� ������ ����������� ���� ���� �������� ���� � ����������� ��������
		
		//java fx ch ����� in google
	}
}
