package exersises;
import java.util.Scanner;
public class IFStatements 
{
	public static void main(String[] args)
	{
		int age; //
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your age? >>>>>");
		age = input.nextInt();
		if(age <= 18)
		{
			System.out.println("User is less than 18.");
		}
		if (age >= 23 & age <= 30)
		{
			System.out.println("Say something about your age.");
		}
		if (age >= 31 & age <= 50)
		{
			System.out.println("Don't have a midlife crises..");
		}
		if (age >= 50 & age <= 65)
		{
			System.out.println("You're old af.");
		}
		if (age >= 66 & age <= 100)
		{
			System.out.println("Your time is limited.");
		}
	}
}

