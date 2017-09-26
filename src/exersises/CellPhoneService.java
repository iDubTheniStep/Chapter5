package exersises;

import java.util.Scanner;

public class CellPhoneService 
{

	public static void main(String[] args) 
	{
	
		int TalkMin;
		int Texts;
		double gigsUsed;
		int planA = 49;
		int planB = 55;
		int planC = 61;
		int planD = 70;
		int planE = 79;
		int planF = 87;
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("How many minutes have you talked on the phone this month?");
		TalkMin = input.nextInt();
		
		System.out.println("How many texts have you sent out this month?");
		Texts = input.nextInt();
		
		System.out.println("How many gigs of data have you used in the last month?");
		gigsUsed = input.nextDouble();
		
		if(TalkMin <= 500 && Texts == 0  && gigsUsed == 0  )
		{
			System.out.println("You should take plan A which is "+planA+"$ a month");
		}
		
		if(TalkMin <= 499 && Texts >= 0  && gigsUsed == 0  )
		{
			System.out.println("You should take plan B which is "+planB+"$ a month");
		}
		
		if(TalkMin >= 499 && Texts <= 0  && gigsUsed == 0   )
		{
			System.out.println("You should take plan C which is "+planC+"$ a month");
		}
		
		if(TalkMin >= 499 && Texts >= 100  && gigsUsed == 0  )
		{
			System.out.println("You should take plan D which is "+planD+"$ a month");
		}
		
		if(TalkMin >= 0 && Texts >= 0  && gigsUsed <= 2  )
		{
			System.out.println("You should take plan E which is "+planE+"$ a month");
		}
		if(TalkMin >= 0 && Texts >= 0  && gigsUsed >= 2  )
		{
			System.out.println("You should take plan F which is "+planF+"$ a month");
		}


	}

}
