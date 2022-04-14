import java.util.*;

public class UserInput {
	
	Scanner input;
	double height;
	double weight;
	
	public double weightInKg(Scanner input)
	{
		System.out.println("Enter your weight in kg (decimals are alllowed):");
		String weightInput = input.nextLine();
		
		if(weightInput.contains("."))
		{
			weightInput.replace('.', ',');
		}
		
		weight = Double.parseDouble(weightInput);
		
		return weight;
	}
	
	public double heightInMeters(Scanner input)
	{
		System.out.println("Enter your height in meters (decimals are alllowed):");
		String heightInput = input.nextLine();
		
		if(heightInput.contains("."))
		{
			heightInput.replace('.', ',');
		}
		
		height = Double.parseDouble(heightInput);
		
		return height;
	}
	
	public void printMeasures()
	{
		System.out.printf("You are %s meters high.%nYou weigh %s kg.", height, weight);
	}
}
