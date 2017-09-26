package gameZone;
import java.util.Random;
import java.util.Scanner;
public class RandomGuess 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int userInt;
		Random rand = new Random();
		int n = rand.nextInt(10)+1;
		
		System.out.println("Please guess a number from 1-10.");
		userInt = input.nextInt();
		
		if(n < userInt)
		{
			System.out.println("Too high");
		}
		if(n > userInt)
		{
			System.out.println("Too low");
		}
		if(n == userInt)
		{
			System.out.println("You got it!!");
		}
	}

}
