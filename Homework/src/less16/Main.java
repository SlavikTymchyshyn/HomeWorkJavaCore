package less16;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) /*throws FileNotFoundException, IOException, ClassNotFoundException */{
//	File f=new File("F:\\error - копия.png");
	File f=new File("F:\\error - sddsa.txt");
//	System.out.println(f.exists());//if file exist
//	System.out.println(f.canRead());//якшо файл доступний для читання
//	System.out.println(f.canWrite());//доступний для запису
//	//System.out.println(f.delete()); видаляє файл
//	System.out.println(f.canExecute());//може виконати
//	BufferedImage bi=ImageIO.read (new FileInputStream(new File("F:\\error - 2.png")));
//	ImageIO.write(bi, "png", f);
			//за доппомогою нього BufferedImage(інтерфейсу)дуже зручно працювати з картинками
	
	//Серіалізація це збереження обктів після закриття мейна краще бо для джава легше ныж тримати його в памяты
	
//	OutputStream os =new FileOutputStream(f); //даэ доступ до файлу
//	ObjectOutputStream oos= new ObjectOutputStream(os);
//	oos.writeObject(new Person("Ivan",25)); //
//	oos.flush();// потрiбно термiново виконати запис краще з ним тоді воно запис робить в окремому потоці особенно для великих файлів
//	oos.close();// закриття ресурсів обовязково бо буде падати продуктивнысь падати оператива бо 
//	os.close();
//	InputStream is= new FileInputStream(f);
//	ObjectInputStream ois =new ObjectInputStream(is);
//	Person p=(Person) ois.readObject();
//	ois.close();
//	is.close();
//	System.out.println(p);

	try(FileWriter fw= new FileWriter  	//???????????????????????????????????????????????????????????????
		(new File("D:/dfsf.txt"))){ 
		//fw.append("\n kjhkjhkjhkjhkj"); //можлвість як можна записати не  з початку файла
			fw.write("Hello\nfdsfs");
		fw.flush();
		//fw.close(); мона не закриватидо закынчення роботи програми якшо не закривати файл то write i append дописує до нього
	}catch(IOException e){
			}
	try(Scanner sc=new Scanner (new File("D:/dfsf.txt"))){
		String s=sc.next(); //читаэ тільки до пропуску розділового знака а наступний раз читає вже там де попередній раз зупинилось...a nextLine() на слідуючу строку йде наступним викликом
		System.out.println(s);
		s=sc.next();
		System.out.println(s);
			}catch(IOException e){}
		}
	}
	
	//null це коли не ініціалізовано , isEmpty це коли 0-довжина
	
	
	
	


