package lesssGeneric2;

import java.util.Collection;



public class Container<E, T extends Collection<E>> {

	private T element;
	
	public <N extends Person> N add(N n){
		n.setAge(n.getAge()+1);
		return n;
	}

	public T getElement() {
		return element;
	}

	public void setElement(T element) {
		this.element = element;
	}
}
