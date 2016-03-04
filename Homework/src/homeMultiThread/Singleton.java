package homeMultiThread;

public class Singleton {
 
	private static Singleton instance;
	/*static*/ volatile int from; //volatile видимий для всіх потоків але тыльки для Singleton класу тут працює без статік
	
	private Singleton (){
	}
	
	public static Singleton getInstance(){	//використовуэться для потоків він осилається сам на свій обєкт в любому випадку
		if(instance==null){
			instance=new Singleton();
			return instance;
			}
					else{
				return instance;
			}
		}
	
	public synchronized void print(){			//це монітор synchronized method робить його таким
		
		from++;
//		for (int i=0;i<200;){
		{
			System.out.println("synchronized "+from);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	}

