package theoryLec16_OOPWithExceptionHandling;


public class ExceptionHandling {
	public static void main(String[] args) throws AmarException, Exception{
	
		System.out.println("Start");
		int myValue = 10;
		if(myValue < 100)
			throw new AmarException("Not possible");
		
		System.out.println("End");
		/*
		try {
			int value = 10/0;
			//int[] arr = new int[5];
			//arr[6] = 10;
			
		} 
		catch(ArithmeticException e) {
			System.out.println(e);
			e.printStackTrace();
		}
		finally{
			System.out.println("Ajib Block");
		}
		*/
		
	}
}

class AmarException extends Exception{
	AmarException(String errorMessage){
		super(errorMessage);
	}
}


