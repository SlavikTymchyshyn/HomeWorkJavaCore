package less18;

import java.util.List;

public class Container<T> {

	private T element;
	
	private List<T> list;
	
	public void print(){
		System.out.println(element);
	}

	public T getElement() {
		return element;
	}

	public void setElement(T element) {
		this.element = element;
	}
}
