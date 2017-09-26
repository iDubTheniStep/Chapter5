package exersises;

import java.util.Scanner;

public class CondoSales 
{

	public static void main(String[] args)
	{
		
		int ParkView = 150000;
		int ParkViewWGarage = 155000;
		int GolfCondo = 170000;
		int GolfCondoWGarage = 175000;
		int LakeView = 210000;
		int LakeViewWGarage = 215000;
		int userChoice = 0;
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("please choose 1 for park view, 2 for gold view, or 3 for lake view.");
		userChoice = input.nextInt();
		
		if(userChoice == 1)
		{
			System.out.println("A park view costs " + ParkView + "with a garage is " + ParkViewWGarage );
		} 
		if(userChoice == 2)
		{
			System.out.println("A golf view condo costs " + GolfCondo + "with a garage is " + GolfCondoWGarage);
		} 
		if(userChoice == 3)
		{
			System.out.println("A lake view condo costs " + LakeView + "with a garage is " + LakeViewWGarage);
		} 
		if(userChoice!=1||userChoice!=2||userChoice!=3)
		{
			System.out.println("dude, thats not an answer.");
		}
		
		
	}

}
