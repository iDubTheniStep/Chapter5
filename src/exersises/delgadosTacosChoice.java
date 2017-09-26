package exersises;
import java.util.Scanner;
public class delgadosTacosChoice 
{
	public static void main(String[]args)
	{
		int choice1;
		Scanner input = new Scanner(System.in);
		System.out.println("Please choose a 1 for raco or 2 for burrito");
		choice1 = input.nextInt();
			if(choice1==1)
			{
				System.out.println("You chose a taco");
			}
			if(choice1 == 2)
			{
				System.out.println("You chose a Burrito");
			}
			if(choice1 >= 3)
			{
				System.out.println("i said 1 or 2 not" + choice1);
			}
			if(choice1 >= 1000 && choice1 <= 9999) 
			{
				System.out.println("TF DUDE");
			}
			if(choice1 >= 2147000000)
			{
				System.out.println("Man computers dont go that high");
			}
			}
}
