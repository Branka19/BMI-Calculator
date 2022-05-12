import java.util.*;

public class UserInput {
	
	Scanner input = new Scanner(System.in);
	double height;
	double weight;
	
	public double weightInKg()
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
	
	public double heightInMeters()
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
		System.out.printf("You are %s meters high. You weigh %s kg.\n", height, weight);
	}
	
	public String determineGender()
	{
		System.out.println("Are you male or female?");
		String gender = input.nextLine();

		return gender.toLowerCase();
	}
	
	public int determineAge()
	{
		System.out.println("How old are you?");
		int age = input.nextInt();
		
		return age;
	}
}
