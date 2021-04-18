package theoryClassAssignments;

public class Sec07And06_TheoryAss02_Task01_ComplexNumber {

	public static void main(String[] args) {
		Complex c1 = new Complex(3, 2);
		Complex c2 = new Complex(5, 1);
		
		Complex cx = c1.complexNumberAddition(c1, c2);
		System.out.println("Addition: " + cx.real + " + " + cx.imaginary + "i");	
		Complex cp = c1.complexNumberMultiplication(c1, c2);
		System.out.println("Multiplication: " + cp.real + " + " + cp.imaginary + "i");	

	}
}

class Complex{
	int real;
	int imaginary;
	public Complex(){
		
	}
	public Complex(int real, int imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	public Complex complexNumberAddition(Complex c1, Complex c2) {
		int aReal = c1.real + c2.real;
		int aImaginary = c1.imaginary + c2.imaginary;
		Complex c = new Complex(aReal, aImaginary);
		
		return c;
	}
	
	public Complex complexNumberMultiplication(Complex c1, Complex c2) {
		int aReal = (c1.real * c2.real) - (c1.imaginary * c2.imaginary);
        int aImaginary = (c1.real * c2.imaginary) + (c1.imaginary * c2.real); 
        Complex c = new Complex(aReal, aImaginary);
		
		return c;
	}
	
}
