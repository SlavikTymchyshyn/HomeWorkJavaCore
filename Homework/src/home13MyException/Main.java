package home13MyException;

public class Main {
	
	BeforeMain beforeM;
	Methods methods;
	
	public Main() throws Exception{									//конструктор класса мейн
		methods=new Methods();
		beforeM=new BeforeMain(methods);
	}
	
	public static void main(String[] args) throws Exception {
		new Main();
	}
}
