package codeSampleGradeCalclulator;

public class IUBGrading implements IGradingPolicey{

	public float gradingCalculation(String grade) {
		 System.out.println("IUB");
 	   float gradePoint = 0.0f;
 	   if(grade.equals("A+"))
 		   gradePoint = 4.00f;
			else if(grade.equals("A"))
				gradePoint = 3.75f;
			else if(grade.equals("A-"))
				gradePoint = 3.5f;
			else if(grade.equals("B+"))
				gradePoint = 3.25f;
			else if(grade.equals("B"))
				gradePoint = 3.00f;
			else if(grade.equals("B-"))
				gradePoint = 2.75f;
			else if(grade.equals("C+"))
				gradePoint = 2.50f;
			else if(grade.equals("C"))
				gradePoint = 2.25f;
			else if(grade.equals("D"))
				gradePoint = 2.00f;
			else if(grade.equals("F"))
				gradePoint = 0.00f;
			
 	   return gradePoint;
    }
}
