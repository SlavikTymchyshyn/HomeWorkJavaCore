package homeMultiThread;

public class Singleton {
 
	private static Singleton instance;
	/*static*/ volatile int from; //volatile ������� ��� ��� ������ ��� ������ ��� Singleton ����� ��� ������ ��� �����
	
	private Singleton (){
	}
	
	public static Singleton getInstance(){	//���������������� ��� ������ �� ��������� ��� �� ��� ���� � ������ �������
		if(instance==null){
			instance=new Singleton();
			return instance;
			}
					else{
				return instance;
			}
		}
	
	public synchronized void print(){			//�� ������ synchronized method ������ ���� �����
		
		from++;
//		for (int i=0;i<200;){
		{
			System.out.println("synchronized "+from);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	}

