package less16;

public class M1 {

	public static void main(String[] args) throws Throwable {
		try {
            Throwable t = new Exception(); // и лететь будет Exception//тип Throwable(батька) але методи в≥д сина так €к конструктор його
            throw t; // но тут ошибка компил€ции 
        } catch (Exception e) {
            System.out.println("ѕерехвачено!");
        }
    }  
	}


