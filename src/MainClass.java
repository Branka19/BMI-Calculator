
public class MainClass {

	public static void main(String[] args) {
		
		UserInput ui = new UserInput();
		double h = ui.getHeight();
		double w = ui.getWeight();
		int a = ui.getAge();
		String g = ui.getGender();
		ui.printMeasures(h,w,g,a);
		
		BMICalculation bmiCalculation = new BMICalculation(ui);
		double bmi = bmiCalculation.calculateBMI();	
		bmiCalculation.bmiCategory(bmi);
		
		BMRCalculation bmrCalculation = new BMRCalculation(ui);
		bmrCalculation.calculateBMR();
	}
}
