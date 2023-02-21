
public class BMICalculation {
	
	private double weight;
	private double height;
	UserInput userInput;
	
	public BMICalculation(UserInput userInput)
	{
		this.weight = userInput.weight;
		this.height = userInput.height;
	}
	
	public double calculateBMI()
	{
		double bmi = weight / Math.pow(height/100, 2);
		System.out.printf("Your Body Mass Index (BMI) is: %.2f%n%n", bmi);
		return bmi;
	}
	
	public void bmiCategory(double bmi)
	{

		if(bmi > 0 && bmi < 18.5)
		{
			System.out.println("BMI Category: UNDERWEIGHT");
		}
		
		if(bmi >= 18.5 && bmi < 25)
		{
			System.out.println("BMI Category: HEALTHY");
		}
		
		if(bmi >= 25 && bmi < 30)
		{
			System.out.println("BMI Category: OVERWEIGHT");
		}
		
		if(bmi >= 30 && bmi < 40)
		{
			System.out.println("BMI Category: OBESE");
		}
		
	}
	
}
