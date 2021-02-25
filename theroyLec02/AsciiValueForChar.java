package theroyLec02;

/**
  * 
  * @author: Asif
  * 
  * */
public class AsciiValueForChar {

	public static void main(String[] args) {
		char ch1 = 65 + 32;   // A = 65  && a = 65 + 32 = 97
		char ch2 = 'A' + 32;
		
		System.out.println(ch1);
		System.out.println(ch2);
		
		// Literal
		int a = 5;
		double d = 2.3;
		char c = 'A';
		String str = "It's a literal";
		
		
		int val3 = 101;
		int result7 = val3 << 3;  
		             //1  0  1 0 0 0
		             //32 16 8 4 2 1  = 40
		System.out.println(result7);
	}
}



