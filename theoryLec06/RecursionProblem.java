package theoryLec06;

public class RecursionProblem {

	public static void main(String[] args) {
		
		System.out.println(f(5));
	
	}
	
	public static int f(int n) {
		if(n == 1)
			return 1;
		else
			return n * f(n-1);  
		
								// 5 * f(5-1) 
								// 5 * 4 * f(4-1)
		                        // 5 * 4 * 3 * f(3-1) 
		                        // 5 * 4 * 3 * 2 * f(1) 
		                        // 5 * 4 * 3 * 2 * 1  = 120
	}

}
