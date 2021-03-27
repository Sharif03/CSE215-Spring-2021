package theoryLec12_OOPWithNestedClass_Inheritence_ThisAndSuper;

public class TestEnumClass {

	public static void main(String[] args) {
		Day d1 = Day.MONDAY;
		EnumClass e1 = new EnumClass(Day.MONDAY); 
		e1.myWeekDaysAre();
	}

}

enum Day { 
	SATURDAY, SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY; 
} 


class EnumClass{ 
    Day d; 
  
    
    public EnumClass(Day d) { 
        this.d = d; 
    } 
  
    public void myWeekDaysAre(){
    	
        switch (d) {   
        case WEDNESDAY: 
        case THURSDAY: 
            System.out.println("Weekends are best."); 
            break; 
        case FRIDAY: 
            System.out.println("Friday is better."); 
            break;
        case SATURDAY: 
            System.out.println("Saturday is bad."); 
            break;
        default: 
            System.out.println("Mid-week days are work day."); 
            break; 
        } 
    } 
}
  