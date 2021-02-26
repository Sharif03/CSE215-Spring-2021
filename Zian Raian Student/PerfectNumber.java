package myJavaLab;
import java.util.*;
public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int x= sc.nextInt();
		int sum=0, i;
		
		for(i=1 ; i<=(x/2) ; i++){
			
			if (x%i==0) {
				sum=sum+i;
			}
				
		}
		
		if (sum==x) {
			System.out.println("Your entered number is perfect.");
			
		}
		
		else
			System.out.println("Your entered number is not perfect.");
		
		
	}

}
