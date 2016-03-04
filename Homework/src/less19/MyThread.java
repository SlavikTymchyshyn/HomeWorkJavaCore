package less19;

public class MyThread implements Runnable {

	@Override
	public void run() {
		// тут буде виконуватись метод в ыншому потоці

		Singleton s=Singleton.getInstance();
		
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
			s.print();
			try {
				Thread.sleep(300);// приспить потiк виконання який буде читати цей метод(вивів значення і зупинився на 300мс)
				} catch (InterruptedException e) {
			}
		}
	}
}
