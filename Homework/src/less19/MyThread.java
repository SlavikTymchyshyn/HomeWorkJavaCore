package less19;

public class MyThread implements Runnable {

	@Override
	public void run() {
		// ��� ���� ������������ ����� � ������ ������

		Singleton s=Singleton.getInstance();
		
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
			s.print();
			try {
				Thread.sleep(300);// �������� ���i� ��������� ���� ���� ������ ��� �����(���� �������� � ��������� �� 300��)
				} catch (InterruptedException e) {
			}
		}
	}
}
