package theoryLec16_OOPWithExceptionHandling;

public class ExceptionHandling05_ThrowWithThrows {

	public static void main(String[] args) throws MyErrorClass1 {
		int a = 6;
		if(a>5) {
			throw new MyErrorClass1("It's an error");
		}
		else
			System.out.println("Hello");	
	}
}
class MyErrorClass1 extends Exception{
	MyErrorClass1(String msg){
		super(msg);
	}	
}
