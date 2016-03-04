package less19;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	static ExecutorService executorService= Executors.newFixedThreadPool(10); //������� 10 ������ ����� � ���� ���� ���������� ��� ���� ���������
	
	public static void main(String[] args) {
		// implement  Runnable ��� ��������������� ������� �� Thread
		MyThread mt1=new MyThread();
		MyThread mt2=new MyThread();
		new Thread(mt1).start();//1 ����
		new Thread(mt2).start();//2 ����
		System.out.println("Main");//��� ����
		//��� ������ ������� ��������������� ����� ��� ������ ��� �� ���� � ��������� ���� ���� �� � �������� ��� ��� ������
		executorService.shutdown();
	}
}
