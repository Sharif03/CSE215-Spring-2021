package theoryLec13_OOPWithWrapper_Enum_NestedClass_ObjectPassAndReturnOnMethod;

public class EnumTopic {
	

	public static void main(String[] args) {
		
		Membership  navin = new Membership();
		navin.name = "Tanvir Rahman";
		navin.email = "navin13@gmail.com";
		navin.status = MembershipStatus.Inactive;  // Active, Inactive, Blocked
		navin.emotion = Emotion.Happy;  // Happy, Sad, Angry
		
		System.out.println(navin.status);
		
		boolean paymentClear = true;
		if(paymentClear == true)
			navin.status = MembershipStatus.Active;
		else
			navin.status = MembershipStatus.Blocked;
			
	}

}

enum Emotion{
	Happy, Sad, Angry; 
}
enum MembershipStatus{
	Active, Inactive, Blocked;	
}

class Membership{
	String name;
	String email;
	MembershipStatus status;
	Emotion emotion;
	
	
}
