package gameZone;
import java.util.Random;
import java.util.Scanner;
public class RockPaperScissors 
{

	public static void main(String[] args) 
	{

		String RPS = null;
		String ORPS = null;
		
		int userChoice;
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		int n = rand.nextInt(3)+1;
		
		System.out.println("Please put 1 for rock 2 for paper or 3 for scissors.");
		userChoice = input.nextInt();
		
		
		if(userChoice == 1)
		{
			RPS= "Rock";
		}
		if(userChoice == 2)
		{
			RPS= "Paper";
		}
		if(userChoice == 3)
		{
			RPS= "Scissors";
		}
		
		if(n == 1)
		{
			ORPS= "Rock";
		}
		if(n == 2)
		{
			ORPS= "Paper";
		}
		if(n == 3)
		{
			ORPS= "Scissors";
		}
		
		
		if(n == userChoice)
		{
			System.out.println("You choose "+ RPS + " your oppenent choose "+ORPS + " so it is a tie." );
		}
		if(n == 1 && userChoice == 2 )
		{
			System.out.println("You choose "+ RPS + " your oppenent choose "+ORPS + " so you win." );
		}
		if(n == 1 && userChoice == 3 )
		{
			System.out.println("You choose "+ RPS + " your oppenent choose "+ORPS + " so you loose." );
		}
		if(n == 2 && userChoice == 3 )
		{
			System.out.println("You choose "+ RPS + " your oppenent choose "+ORPS + " so you win." );
		}
		if(n == 2 && userChoice == 1 )
		{
			System.out.println("You choose "+ RPS + " your oppenent choose "+ORPS + " so you loose." );
		}
		if(n == 3 && userChoice == 2 )
		{
			System.out.println("You choose "+ RPS + " your oppenent choose "+ORPS + " so you loose." );
		}
		if(n == 3 && userChoice == 1 )
		{
			System.out.println("You choose "+ RPS + " your oppenent choose "+ORPS + " so you win." );
		}
		if(userChoice >= 4 )
		{
			System.out.println("That was not an option you loose by default. ");
		}
		
		
	}

}
