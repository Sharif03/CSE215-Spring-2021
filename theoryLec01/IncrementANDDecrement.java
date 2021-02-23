package theoryLec01;

public class IncrementANDDecrement {

	public static void main(String[] args) {
		// Increment & Decrement
		int a = 10;
		a = a + 5;
		a = a - 4;
		
		// Pre-Increment & Post-Increment
		int b = 20;
		int c;
		c = ++b;
		c = b++;
		
		//System.out.println(c);
		//System.out.println(b);
		
		// Pre-Decrement & Post-Decrement
		int x = 25;
		int y;
		y = --x;
		y = x--;
		
		//System.out.println(y);
		//System.out.println(x);
		
		
		int p = 21;
		int q;
		int r;
		
		r = p++;      // r = 21   p = 22
		p = --r;      // p = 20   r= 20
		
		p = p++;      // p = 20  p = 21
		r = --r + 2;  // r = 21  r = 19
		q =  ++p + --r; // q = 21 + 20 = 41    p=21
		
		System.out.println("P: " + p);
		System.out.println("Q: " + q);
		System.out.println("R: " + r);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
