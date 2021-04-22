package theoryLec16_OOPWithExceptionHandling;

public class ExceptionHandling04_ThrowWithThrowAndTryCatch {

	public static void main(String[] args) throws MyErrorClass{
		int a = 10;
		try {
			if(a>5) {
				throw new MyErrorClass("It's an error");
			}
			else
				System.out.println("Hello");	
		} catch(MyErrorClass e) {
			System.out.println(e);
			System.out.println("Catched Block");	
		}
	}

}


class MyErrorClass extends Exception{
	MyErrorClass(String msg){
		super(msg);
	}	
}
