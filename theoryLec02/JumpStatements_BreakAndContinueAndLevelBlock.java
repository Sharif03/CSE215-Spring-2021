package theoryLec02;

public class JumpStatements_BreakAndContinueAndLevelBlock {

	public static void main(String[] args) {
		// c) Jump: break, continue & level-block(Level Name: { })
		
		/*
		// Jump Statement(Break && Continue && Level-block)
		// Break
		for(int i=0; i<5; i++) {
			if(i == 3)
				break;
			System.out.println(i);
		}
		
		// Continue
		for(int i=0; i<5; i++) {
			if(i == 3)
				continue;
			System.out.println(i);
		}
		*/
		
		
		// Level-block
		boolean truthValue = true;
		System.out.println("Hello");
		a:{
			b:{
			   c:{
				truthValue = false;
				if(truthValue == false)
					break c;
				System.out.println("Block C");
			   }
			 System.out.println("Block B");
			}
		 System.out.println("Block A");
		}
		System.out.println("Normal");
	
	}

}
