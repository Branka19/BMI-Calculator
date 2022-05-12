
public class BMRCalculation {
	
	double bmr;
	UserInput userInput;
	String gender;
	int age;
	
	public void calculateBMR(double weight, double height)
	{
		
		userInput = new UserInput();
		
		gender = userInput.determineGender();
		age = userInput.determineAge();
		
		switch (gender) {
		case "male":
			
			bmr = 66.47 + (13.75 * weight) + (5.003 * height * 100) - (6.755 * age);
			break;

		case "female":
			
			bmr = 655.1 + (9.563 * weight) + (1.85 * height * 100) - (4.676 * age);
			break;
			
		default:
			System.out.println("You have entered invalid gender!");
			break;
		}
		
		System.out.printf("Your BMR is: %.2f\n", bmr);
		
	}


}
