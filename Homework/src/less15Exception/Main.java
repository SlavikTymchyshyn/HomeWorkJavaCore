package less15Exception;

import org.junit.Test;

public class Main {
	
	@Test(expected = Myexception.class)
	public void asdf() throws Myexception{
		Arithmatic.div(2, 0);
	}

	public static void main(String[] args) {
		try {
			System.out.println(Arithmatic.div(2, 0));
		} catch (Myexception e) {
			e.printStackTrace();
		}
	}
}
