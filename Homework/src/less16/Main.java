package less16;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) /*throws FileNotFoundException, IOException, ClassNotFoundException */{
//	File f=new File("F:\\error - �����.png");
	File f=new File("F:\\error - sddsa.txt");
//	System.out.println(f.exists());//if file exist
//	System.out.println(f.canRead());//���� ���� ��������� ��� �������
//	System.out.println(f.canWrite());//��������� ��� ������
//	//System.out.println(f.delete()); ������� ����
//	System.out.println(f.canExecute());//���� ��������
//	BufferedImage bi=ImageIO.read (new FileInputStream(new File("F:\\error - 2.png")));
//	ImageIO.write(bi, "png", f);
			//�� ���������� ����� BufferedImage(����������)���� ������ ��������� � ����������
	
	//���������� �� ���������� ����� ���� �������� ����� ����� �� ��� ����� ����� ��� ������� ���� � ������
	
//	OutputStream os =new FileOutputStream(f); //��� ������ �� �����
//	ObjectOutputStream oos= new ObjectOutputStream(os);
//	oos.writeObject(new Person("Ivan",25)); //
//	oos.flush();// ����i��� ����i���� �������� ����� ����� � ��� ��� ���� ����� ������ � �������� ������ �������� ��� ������� �����
//	oos.close();// �������� ������� ���������� �� ���� ������ ������������� ������ ��������� �� 
//	os.close();
//	InputStream is= new FileInputStream(f);
//	ObjectInputStream ois =new ObjectInputStream(is);
//	Person p=(Person) ois.readObject();
//	ois.close();
//	is.close();
//	System.out.println(p);

	try(FileWriter fw= new FileWriter  	//???????????????????????????????????????????????????????????????
		(new File("D:/dfsf.txt"))){ 
		//fw.append("\n kjhkjhkjhkjhkj"); //�������� �� ����� �������� ��  � ������� �����
			fw.write("Hello\nfdsfs");
		fw.flush();
		//fw.close(); ���� �� ����������� ���������� ������ �������� ���� �� ��������� ���� �� write i append ������ �� �����
	}catch(IOException e){
			}
	try(Scanner sc=new Scanner (new File("D:/dfsf.txt"))){
		String s=sc.next(); //����� ����� �� �������� ���������� ����� � ��������� ��� ���� ��� ��� �� ��������� ��� ����������...a nextLine() �� ������� ������ ��� ��������� ��������
		System.out.println(s);
		s=sc.next();
		System.out.println(s);
			}catch(IOException e){}
		}
	}
	
	//null �� ���� �� ������������ , isEmpty �� ���� 0-�������
	
	
	
	


