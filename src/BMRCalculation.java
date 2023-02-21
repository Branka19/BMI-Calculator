public class BMRCalculation {
	
	UserInput userInput;
	private double weight;
	private double height;
	private String gender;
	private int age;
	
	public BMRCalculation(UserInput userInput)
	{
		this.age = userInput.age;
		this.gender = userInput.gender;
		this.weight = userInput.weight;
		this.height = userInput.height;
	}
	
	public void calculateBMR()
	{		
		double bmr = 0;
		
		switch (gender) {
		case "male":
			//male BMR: 66 + (13.7 * weight in kg) + (5 * height in cm) - (6.8 * age)
			bmr = 66 + (13.7 * weight) + (5 * height) - (6.8 * age);
			break;

			
		case "female":
			//female BMR: 655+(9.6 x weight in kg)+(1.8 x height in cm) - (4.7 x age)
			bmr = 655 + (9.6 * weight) + (1.8 * height) - (4.7 * age);
			break;
			
		default:
			System.out.println("We cannot calculate BMR based on your input!");
			break;
		}
		
		System.out.printf("Your Basal Metabolic Rate (BMR) is: %.2f\n", bmr);
	}


}
