package exersises;
import java.util.Scanner;
public class EvenOdd
{

	public static void main(String[] args)
	{
		int userInt,theRemander;
		
		System.out.println("Please enter an int ");
		Scanner input = new Scanner(System.in);
		userInt = input.nextInt();
		theRemander = userInt % 2;
		if(theRemander==0)
		{
			System.out.println(userInt + " is an even number.");	
		}
		else
		{
			System.out.println(userInt + " is an odd number.");
		}
		

	}

}
