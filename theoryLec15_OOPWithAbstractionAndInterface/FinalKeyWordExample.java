package theoryLec15_OOPWithAbstractionAndInterface;

public class FinalKeyWordExample {

	public static void main(String[] args) {
		FinalKeyWord f = new FinalKeyWord();
		System.out.println(f.value);
	}

}
class ParentFinalKeyWord{
	public final void printIngo() {    // Final method = Don't override
		System.out.println("Parent class");
	}	
}
class FinalKeyWord extends ParentFinalKeyWord {
	final int value = 10;              // Final property = constant property
	FinalKeyWord(){

	}	
		
}
