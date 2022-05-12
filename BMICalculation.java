
public class BMICalculation {
	
	double height;
	double weight;
	double bmi;
	UserInput userInput = new UserInput();
	
	public BMICalculation()
	{
		this.weight = userInput.weightInKg();
		this.height = userInput.heightInMeters();
	}
	
	double getHeight() {
		return height;
	}

	double getWeight() {
		return weight;
	}

	public void calculateBMI()
	{
		//userInput = new UserInput();
		//weight = userInput.weightInKg();
		//height = userInput.heightInMeters();
		
		bmi = weight / Math.pow(height, 2);
		
		//System.out.println(bmi);
		//userInput.printMeasures();
		System.out.printf("Your BMI is: %.2f%n%n", bmi);
	}
	
	

}
