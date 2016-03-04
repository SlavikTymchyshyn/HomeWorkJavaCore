package less15Exception;

public interface Arithmatic {
	
	public static int div(int a,int b) throws IllegalArgumentException{
		if(b==0){
			throw new IllegalArgumentException("Ділити на нуль не можна");
		}else{
			return a/b;
		}	
	}
}

