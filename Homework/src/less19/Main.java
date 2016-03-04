package less19;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	static ExecutorService executorService= Executors.newFixedThreadPool(10); //створюЇ 10 поток≥в кожен з €ких пот≥м зад≥€юэтьс€ дл€ чого скажетьс€
	
	public static void main(String[] args) {
		// implement  Runnable дл€ багатопоточност≥ зручн≥ше н≥ж Thread
		MyThread mt1=new MyThread();
		MyThread mt2=new MyThread();
		new Thread(mt1).start();//1 пот≥к
		new Thread(mt2).start();//2 пот≥к
		System.out.println("Main");//св≥й пот≥к
		//шоб робити реальну багатопоточн≥сть треба шоб мон≥тор був на клас≥ а звертанн€ було того то ж екзплпру вс≥х тих поток≥в
		executorService.shutdown();
	}
}
