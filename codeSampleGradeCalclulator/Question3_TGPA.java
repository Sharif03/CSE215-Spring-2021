package codeSampleGradeCalclulator;
public class Question3_TGPA {

	public static void main(String[] args) {
		AIUBGrading aiub = new AIUBGrading();
		NSUGrading nsu = new NSUGrading();
		
		GradingPolicey grading = new GradingPolicey(nsu);
		grading.gradeCalculator();
	}
}
