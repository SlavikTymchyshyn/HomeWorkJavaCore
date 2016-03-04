package homeMultiThread;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import less19.Singleton;

public class RunnableThread implements Runnable {

	Thread thread;
	
	RunnableThread(){
//		System.out.println();
//		thread=new Thread (this,"Поток Runnable");
//		thread.start();
		run();
	};
	
//	public void Fibo(int k){
//		int a=0;
//		int b=1;
//		int s=1;
//		for(int i=k-1;i>0;i--){
//			System.out.print(s+" ");
//			s=a+b;
//			a=b;
//			b=s;
//		}
//	}
	
	@Override
	public  void run() {
//		Integer k=0;
//		String str=null;
//		
//		Scanner strIn=new Scanner(System.in);
//		str=strIn.next();
//		 k=Integer.parseInt(str);
		System.out.println();
			
		int k=7;
	
		int from=-k;
		int to=0;
		double sF=Math.sqrt(5);
		double pos=(1+sF)/2;
		double neg=(1-sF)/2;
		int i=0;
		int n=to-from;
		System.out.print("поток RUN Thread2:");
		while(i++<n){
			double F=((Math.pow(pos, from)-Math.pow(neg, from))/sF);
			System.out.format(" %.0f",F);
			try {
				Thread.sleep(1000);
				}catch (InterruptedException e) {
				e.printStackTrace();
			}
				from++;
			}
		System.out.println();
		}			
					
				
			
		
		
	}


