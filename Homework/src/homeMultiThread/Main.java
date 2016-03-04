package homeMultiThread;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
	
	static ExecutorService executorService= Executors.newFixedThreadPool(2);
	static ExecutorService executorService2= Executors.newFixedThreadPool(2);
	
	public static void main(String[] args) {
		System.out.println("main");
	
		MyThread myThread=new MyThread();
		
//		myThread.start();
		
		RunnableThread runnableThread=new RunnableThread();
//
		new Thread(runnableThread).start();
		
		executorService.submit(new MyThread()); //виконати код 2 разa
		System.out.println();
		executorService.shutdown();
		
//		executorService2.submit(new RunnableThread());
//		executorService.execute(runnableThread);
//		System.out.println();
//		executorService2.shutdown();
		
//		RunnableThread runnableThread2=new RunnableThread();
//		new Thread(runnableThread2).start();
		
//		runn=new RunnableThread();
//		Thread mythrd=new Thread (runn);
//		mythrd.start();
	
	
	
	}

}
