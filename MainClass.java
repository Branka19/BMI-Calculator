
public class MainClass {

	public static void main(String[] args) {
				
		BMICalculation bmiCalculation = new BMICalculation();
		bmiCalculation.calculateBMI();
		
		BMRCalculation bmrCalculation = new BMRCalculation();
		bmrCalculation.calculateBMR(bmiCalculation.getWeight(), bmiCalculation.getHeight());
	}
}
