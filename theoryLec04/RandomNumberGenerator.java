package theoryLec04;

public class RandomNumberGenerator {

	public static void main(String[] args) {
		
		
		int randomValue = (int)(Math.random() *100);
		//System.out.println(randomValue);
		
		int min = 50;
		int max = 100;
		int newRandomValue = (int) (min+Math.random() * (max-min+1)); 
		System.out.println(newRandomValue);
		
		// Inclusive 
		int inclusiveValue = (int) (min+Math.random() * (max-min+1));
		
		// Exclusive
		int exclusiveValue = (int) (min+Math.random() * (max-min-1));
		
		
		
		
		// 0.650771291935203
		// 0.5273759342194437
		// 0.7587023132553588
		
		/*
		//OTP Generator
		int min = 111111;
		int max = 999999;
		int newRandomValue = (int) (min+Math.random() * (max-min+1));
		System.out.println(newRandomValue);
		*/
		
	}
	  public static char getRandomCharacter(char ch1, char ch2) {
		    return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
	 }

	

}
