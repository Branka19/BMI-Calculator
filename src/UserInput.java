import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInput {
	
	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	double height;
	double weight;
	int age;
	String gender;
	
	public double getWeight()
	{
		System.out.println("Enter your weight in kg (decimals are alllowed):");
		try
		{
			String weightInput = bf.readLine();
			
			if(weightInput.contains("."))
			{
				weightInput.replace('.', ',');
			}
			
			weight = Double.parseDouble(weightInput);
		}
		
		catch(IOException e)
		{
			e.printStackTrace();
		}

		return weight;
	}
	
	public double getHeight()
	{
		System.out.println("Enter your height in meters (decimals are alllowed):");
		try
		{
			String heightInput = bf.readLine();
			
			if(heightInput.contains("."))
			{
				heightInput.replace('.', ',');
			}
			
			height = Double.parseDouble(heightInput);
		}
		
		catch(IOException e)
		{
			e.printStackTrace();
		}
		return height;
	}
	
	public int getAge()
	{
		System.out.println("How old are you?");
		
		try
		{
			String ageInput = bf.readLine();
			
			age = Integer.parseInt(ageInput);
			
			if(age < 0 || age > 100)
				System.out.print("Invalid age!");
		}
		
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		return age;	
	}
	
	public String getGender()
	{
		System.out.println("Are you male or female?");
		
		try
		{
			String genderInput = bf.readLine();
			
			if(genderInput.equalsIgnoreCase("female") || genderInput.equalsIgnoreCase("male"))
				gender = genderInput.toLowerCase();
			
			else
				System.out.println("Invalid gender!");
				
			//method to check the gender method:
			//System.out.println("You are: " + genderInput);
		}
		
		catch(IOException e)
		{
			e.printStackTrace();
		}	
		
		return gender;
	}
	
	public void printMeasures(double myHeight, double myWeight, String myGender, int myAge)
	{
		System.out.printf("You are %s meters high.\nYou weigh %s kg.\nYou are a %s of %s.\n", myHeight, myWeight, myGender, myAge);
	}
}
