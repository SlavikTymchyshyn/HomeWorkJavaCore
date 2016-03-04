package homeGeneric;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MyEntry<K, V> {

	private K key;
	private V value;

	
	public MyEntry(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	// Menu
	public void menUxa(Map<K, V> map) {
		do {
			MyMap<K, V> m = new MyMap<>();
			System.out.println("1.додаtи новий об’єкт в мапу");
			System.out.println("2.видалuTи об’єкт мапи за ключем(тобто немає ні ключа ні значення)");
			System.out.println("3.видалuTи об’єкт мапи за значенням(значенню об’єкта присвоюється нульова/n спилка, при цьому зберігається ключ)");
			System.out.println("4.виводили на екран Set ключів");
			System.out.println("5.Виводили на екран List значень");
			System.out.println("6.Виводили на екран цілу мапу");
			System.out.println("7.ВиxiD");
			System.out.println();
			System.out.println("Введіть цифру:");
			int men = m.typeInt();

			switch (men) {
			case 1: {
				m.addToMap(map);
				break;
			}
			case 2: {
				m.delTotallyFromMap(map, key);
				break;
			}
			case 3: {
				m.delByValueFromMap(map, key, value);
				break;
			}
			case 4: {
				m.getSetKeys(map);
				break;
			}
			case 5: {
				m.getListValue(map);
				break;
			}
			case 6: {
				m.getAllMap(map);
				break;
			}
			case 7: {
				System.exit(0);
			}
			}
		} while (true);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((key == null) ? 0 : key.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyEntry other = (MyEntry) obj;
		if (key == null) {
			if (other.key != null)
				return false;
		} else if (!key.equals(other.key))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MyEntry [key=" + key + ", value=" + value + "]";
	}

}
// Створити клас MyEntry<K,V>. Описати в ньому дженеріками –поля, гетери/сетери,
// toString. Створити клас MyMap<K,V>,
// в якому буде поле Set<MyEntry<K,V>>. Реалізвати в даному класі методи, які б:
// додавали новий об’єкт в мапу
// видаляли об’єкт мапи за ключем(тобто немає ні ключа ні значення)
// видаляли об’єкт мапи за значенням(значенню об’єкта присвоюється нульова
// спилка, при цьому зберігається ключ)
// виводили на екран Set ключів
// Виводили на екран List значень
// Виводили на екран цілу мапу