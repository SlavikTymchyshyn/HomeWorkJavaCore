package homeMultiThread;

import java.util.IllegalFormatException;
import java.util.Scanner;

import less19.Singleton;

public class MyThread extends Thread{
	
	public MyThread(){
//		System.out.println(this);
		run();
	}
	
	public /*synchronized*/ int typeInt(){
		System.out.println("type num:");
		String str=null;
		Integer i=0;
		Scanner strIn=new Scanner(System.in);
		str=strIn.next();
		try{
		i=Integer.parseInt(str);
		}catch(NumberFormatException e){System.out.println("type int");}
		return i;
	}
//	
//	 int k=typeInt();
//	
//	public void Fibo(int k){
//		int a=0;
//		int b=1;
//		int s=1;
//		for(int i=0;i<k;i++){
//			System.out.print(s+" ");
//			s=a+b;
//			a=b;
//			b=s;
//		}
//	}
	
	
	@Override
	public void run() {
//		Integer k=0;
//		String str=null;
//		
//		Scanner strIn=new Scanner(System.in);
//		str=strIn.next();
//		 k=Integer.parseInt(str);
		
		
		
		
		int k=7;
		int a=0;
		int b=1;
		int s=1;
		System.out.print("поток thr Thread:");
		for(int i=0;i<k;i++){
			System.out.print(" "+s+" ");
//			s1.print();
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			s=a+b;
			a=b;
			b=s;
			}

		}			
	}


