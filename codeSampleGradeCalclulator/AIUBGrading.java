package codeSampleGradeCalclulator;

public class AIUBGrading implements IGradingPolicey{

	public float gradingCalculation(String grade) {
 	   System.out.println("AIUB");
 	   
 	   float gradePoint = 0.0f;
 	   if(grade.equals("A"))
 		   gradePoint = 4.00f;
			else if(grade.equals("A-"))
				gradePoint = 3.75f;
			else if(grade.equals("B+"))
				gradePoint = 3.33f;
			else if(grade.equals("B"))
				gradePoint = 3.00f;
			else if(grade.equals("B-"))
				gradePoint = 2.75f;
			else if(grade.equals("C+"))
				gradePoint = 2.50f;
			else if(grade.equals("C"))
				gradePoint = 2.22f;
			else if(grade.equals("C-"))
				gradePoint = 2.00f;
			else if(grade.equals("D"))
				gradePoint = 1.00f;
			else if(grade.equals("F"))
				gradePoint = 0.00f;
			
 	   return gradePoint;
    }
    
}
