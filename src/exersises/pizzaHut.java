package exersises;
import java.util.Scanner;
public class pizzaHut
{
	Scanner input = new Scanner(System.in);

	public static void main(String[] args) 
	{
		
		String choiceYes;
		String toppingChoice;
		String size;
		String pizzaKind;
		String choiceHotDog;
		double mediumCost = 9.99;
		double largeCost = 12.99;
		double smallCost = 6.99;
		
		Scanner input = new Scanner(System.in);

		
	
		System.out.println("Would you like a pizza? Please enter yes or no.");
		choiceYes = input.nextLine();
		if("Yes".equals(choiceYes)||"yes".equals(choiceYes)||"Y".equals(choiceYes)||"y".equals(choiceYes))
		{
		System.out.println("You said "+(choiceYes)+ " to having a pizza");
			System.out.println("please choose a size. small, medium, or large");
			size=input.nextLine();
			if("small".equals(size)|| "Small".equals(size))
			{
				System.out.println("You said "+size+" size piza.");
				System.out.println("What kind of pizza would you like? Pepperoni, Sausage, Cheese?");
				pizzaKind = input.nextLine();
				if("Pepperoni".equals(pizzaKind)||"pepperoni".equals(pizzaKind)||"Sausage".equals(pizzaKind)||
						"sausage".equals(pizzaKind)||"Cheese".equals(pizzaKind)||"cheese".equals(pizzaKind))
				{
					System.out.println("You choose "+pizzaKind+" pizza type");
					System.out.println("Your total order is a "+size+" size pizza with"+ pizzaKind+"for your toppings. "+smallCost+" is your total");
				}
			}
			if("Medium".equalsIgnoreCase(size))
			{
				System.out.println("You said "+size+" size piza.");
				System.out.println("What kind of pizza would you like? Pepperoni, Sausage, Cheese?");
				pizzaKind = input.nextLine();
				if("Pepperoni".equals(pizzaKind)||"pepperoni".equals(pizzaKind)||"Sausage".equals(pizzaKind)||
						"sausage".equals(pizzaKind)||"Cheese".equals(pizzaKind)||"cheese".equals(pizzaKind))
				{
					System.out.println("You choose "+pizzaKind+" pizza type");
					System.out.println("Your total order is a "+size+" size pizza with"+ pizzaKind+"for your toppings. "+mediumCost+" is your total");
				}
			}
			
			if("large".equalsIgnoreCase(size))
			{
				System.out.println("You said "+size+" size piza.");
				System.out.println("What kind of pizza would you like? Pepperoni, Sausage, Cheese?");
				pizzaKind = input.nextLine();
				if("Pepperoni".equals(pizzaKind)||"pepperoni".equals(pizzaKind)||"Sausage".equals(pizzaKind)||
						"sausage".equals(pizzaKind)||"Cheese".equals(pizzaKind)||"cheese".equals(pizzaKind))
				{
					System.out.println("You choose "+pizzaKind+" pizza type");
					System.out.println("Your total order is a "+size +" size pizza with"+ pizzaKind +"for your toppings. "+largeCost+" is your total");
				}
			}
		}
		
		
		

	}

}
