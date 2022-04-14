import java.util.Scanner;

public class BMICalculation {
	
	Scanner input = new Scanner(System.in);
	
	double height;
	double weight;
	double bmi;
	UserInput userInput;
	
	public void calculateBMI()
	{
		userInput = new UserInput();
		weight = userInput.weightInKg(input);
		height = userInput.heightInMeters(input);
		
		bmi = weight / Math.pow(height, 2);
		System.out.printf("Your BMI is %.2f", bmi);
	}

}
