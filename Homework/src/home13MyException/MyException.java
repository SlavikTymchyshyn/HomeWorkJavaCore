package home13MyException;

public class MyException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = -838107663361169778L;
	
	public MyException(Throwable e) { 
	        initCause(e); // �������� ������� ��������� ������� ����������� ��������
	        System.err.println("my erroR a>0,b>0");
	    } 

}
