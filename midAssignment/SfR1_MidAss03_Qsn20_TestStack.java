package midAssignment;

public class SfR1_MidAss03_Qsn20_TestStack {

	public static void main(String[] args) {
		Stck s = new Stck(5);
		s.push(1);
		s.push(5);
		s.push(8);
		s.push(80);
		s.push(2);
		
		s.pop();
		s.pop();
	
		s.displayStack();
		System.out.println("\nThe size of the stack: " + s.getStackSize());
	}
}

class Stck {
	private int top = -1;
	private int arr[];
	             
	public Stck() {
		arr = new int[10];
		for (int i=0; i<arr.length; i++) {
			arr[i] = 0;
		}
	}
	public Stck(int a) {
		arr = new int[a];
		for (int i=0; i<arr.length; i++) {
			arr[i] = 0;
		}
	}
	
	public void push(int a) {
		if(top == (arr.length-1))
			System.out.println("Stack is Full.");
		else
			arr[++top] = a;
	}
	
	public int pop() {
		if(top < 0) {
			System.out.println("Stack is Empty.");
			return 0;
		}
		else
			return arr[top--];
	}
	
	public int getStackSize() {
		return top+1;
	}
	
	public void displayStack() {
		for (int i=0; i<top+1; i++) {
			System.out.println(arr[i] + " ");
		}
	}
	
}
