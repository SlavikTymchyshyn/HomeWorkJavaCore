package less16;

public class M1 {

	public static void main(String[] args) throws Throwable {
		try {
            Throwable t = new Exception(); // � ������ ����� Exception//��� Throwable(������) ��� ������ �� ���� ��� �� ����������� ����
            throw t; // �� ��� ������ ���������� 
        } catch (Exception e) {
            System.out.println("�����������!");
        }
    }  
	}


