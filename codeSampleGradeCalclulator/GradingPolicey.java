package codeSampleGradeCalclulator;

import java.util.Scanner;

public class GradingPolicey {
	public IGradingPolicey grading;
	public GradingPolicey(IGradingPolicey grading){
		this.grading = grading;
	}
	
	public void gradeCalculator() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number of Course: ");
		int numberOfCourse = input.nextInt();
		
		String[] courseNames = new String[numberOfCourse];
		float[] gradePoint = new float[numberOfCourse];
		int[] creditHour = new int[numberOfCourse];
		float[] perCourseTotalGradePoint = new float[numberOfCourse];
		
		float totalGradePoint = 0.0f;
		int totalCreditHour = 0;
		for (int i = 0; i < numberOfCourse; i++) {
			System.out.println("Enter Course name: ");
			courseNames[i] = input.next();
			
			System.out.println("Enter Grade: ");
			String grade = input.next();
			
			gradePoint[i] = this.grading.gradingCalculation(grade);
	
			System.out.println("Enter Credit Hour: ");
			creditHour[i] = input.nextInt();	
			perCourseTotalGradePoint[i] = gradePoint[i] * creditHour[i];
			
			totalGradePoint = totalGradePoint + perCourseTotalGradePoint[i];
			
			totalCreditHour = totalCreditHour + creditHour[i];
			
			System.out.println();
		}
		float tgpa = totalGradePoint/totalCreditHour;
		System.out.println("TGPA: " + tgpa);
	}

}
