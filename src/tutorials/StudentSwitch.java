package tutorials;
import java.util.Scanner;
public class StudentSwitch 
{

	public static void main(String[] args) 
	{

		int user;

		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your student number.");
		user = input.nextInt();
		
		switch(user)
		{
		case 311508:
			System.out.println("you ok");
			break;
		case 132043:
			System.out.println("you ok");
			break;
		case 201524:
			System.out.println("Cool dude 8) ");
			break;
		case 131512:
			System.out.println("dull memes");
			break;
		case 179978:
			System.out.println("You ok");
			break;
		case 138455:
			System.out.println("you ok");
			break;
		case 313011:
			System.out.println("you ok");
			break;
		case 666:
			System.out.println("Hello satan :)");
			break;
		}
	}

}
