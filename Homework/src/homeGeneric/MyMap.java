package homeGeneric;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MyMap<K, V> {
	
	private Set<MyEntry<K, V>> set=new HashSet<>();;//����� ����� ��� ��� � ������ MyMap<K,V> ������� � �� ����� ���
			
	public MyMap (){
	}
	
	//
	public  Integer typeInt() {

		String str = null;
		Scanner scInt = new Scanner(System.in);
		String regex = "[1-7]{1}";
		while (scInt.hasNext()) {

			str = scInt.next();
			if (str.isEmpty()) {
				return 0;
			} else if (str != null && str.matches(regex)) {
				return Integer.parseInt(str);
			} else {
				System.out.println("enter between 1-7");
				return 0;
			}
		}
		return Integer.parseInt(str);
	}

	public  String stringType() {
		String str = null;
		Scanner scStr = new Scanner(System.in);
		str = scStr.next();
		return str;
	}

//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	// �������� ����� �ᒺ�� � ����
	/**/
	public MyEntry<K,V> addToMap(Set<MyEntry<K,V>> set,K key,V value){	//!!!!!!!!!!! ���� �����
		MyEntry<K,V> m=new MyEntry(key,value);
		set.add(m);
		System.out.println("After add: " + set);
		return m;
	}
	
//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	// ������T� �ᒺ�� ���� �� ������(����� ���� � ����� � ��������)

	public void delTotallyFromMap(Set<MyEntry<K,V>> set,K key){
		System.out.println(set);
		Iterator<MyEntry<K,V>> ItEntr=set.iterator();
		while (ItEntr.hasNext()){
			MyEntry<K,V> entry=ItEntr.next();
			if (entry.getKey().equals(key)){
				ItEntr.remove();
			}
		}
		System.out.println("After totally delete: " + set);
	}
	

	
	// entry-������

//	public void delTotallyFromMap2(K key) {
//		System.out.println(map);
//		map.remove(key);// ����� �������� ��� ���� ��������� �� ��� ������
//		System.out.println("After totally delete: " + map);
//		
//	}
//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
// ������T� �ᒺ�� ���� �� ���������(�������� �ᒺ��� ������������ �������
// ������, ��� ����� ���������� ����)
		
	public void delByValueFromMap(Set<MyEntry<K,V>> set,V value) {
		System.out.println(set);
		Iterator<MyEntry<K,V>> interIt = set.iterator();
		while (interIt.hasNext()) {
			MyEntry<K,V> entr = interIt.next();
			if (entr.getValue().equals(value)) {
				entr.setValue(null); // 1 �����
				// interIt.next().setValue(null); //2 �� �������� ����� next()
				// ���� �������� � �������� ������
			}
		}
		System.out.println("After delete by value: " + set);
	}
	
	// Removes entry for the specified key only if it is currently mapped to the
	// specified value.
	
	
// ������ ����� � ��� ��� ���������� ����� ����� ���� �� ����� ����������
// ��������� ��������
	public void delByValueFromMap2( K key, V value) {
		System.out.println(set);
		set.remove(key);
		System.out.println("After delete by value: " + set);
		
	}

//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
// �������� �� ����� Set ������

	public void getSetKeys(Set<MyEntry<K,V>> set) {
		Set<K> setOfKeys = new HashSet<K>();
		Iterator<MyEntry<K,V>> iter = set.iterator();
		while (iter.hasNext()) {
			MyEntry<K,V> entry = iter.next();
			setOfKeys.add(entry.getKey());
		}
		System.out.println("Set of Keys: " + setOfKeys);
	}

//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
// �������� �� ����� List �������
	
	public void getListValue(Set<MyEntry<K,V>> set) {
		List<V> listOfValues = new ArrayList<V>();
		Iterator<MyEntry<K,V>> iter = set.iterator();
		while (iter.hasNext()) {
			MyEntry<K,V> entry = iter.next();
			listOfValues.add(entry.getValue());
		}
		System.out.println("list Of Values: " + listOfValues);
		
	}

//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
// �������� �� ����� ���� ����
	
	public void getAllMap(Set<MyEntry<K,V>> set) {
		for (MyEntry<K,V> myEntry : set) {
			System.out.print("key is - " + myEntry.getKey());
			System.out.println(", value is age " + myEntry.getValue());
		}
	}

	public Set<MyEntry<K, V>> getSet() {
		return set;
	}

	public void setSet(Set<MyEntry<K, V>> set) {
		this.set = set;
	}
	
	
	
	
	

}
// �������� ���� MyEntry<K,V>. ������� � ����� ���������� �����, ������/������,
// toString. �������� ���� MyMap<K,V>,
// � ����� ���� ���� Set<MyEntry<K,V>>. ��������� � ������ ���� ������, �� �:
