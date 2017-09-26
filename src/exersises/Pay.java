package exersises;

import java.util.Scanner;

public class Pay 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		double userPay = 0;
		double hoursWorked;
		double overtime = 0;
	
		int skillLevel;
		double insurance1 = 0;
		double insurance2 = 0;
		double insurance3 = 0;
		double R;

		
		
		
		System.out.println("Please enter your Skill level from 1-3");
		skillLevel = input.nextInt();
		if(skillLevel == 1) 
		{
			System.out.println("Your hourly pay is 17.00");
			userPay = 17.00;
		}
		
		if(skillLevel == 2) 
		{
			System.out.println("Your hourly pay is 20.00");
			userPay = 20.00;
		}
		
		if(skillLevel == 3) 
		{
			System.out.println("Your hourly pay is 22.00");
			userPay = 22.00;
		}
		
		
		
		if(skillLevel >= 2 && skillLevel <= 3)
		{
			System.out.println("");
			System.out.println("You have the options for insurance please choose. 1 for yes 0 for no");
			
			System.out.println("Option 1: Medical Insureance at 32.50 a week.");
			insurance1 = input.nextDouble();
			double insurance1pay = insurance1 * 32.50;
			System.out.println("Option 2: Dental insurance. $20.00 a week");
			insurance2 = input.nextDouble();
			double insurance2pay = insurance2 * 32.50;
			System.out.println("Option 3: Long-term disability. $10.00 a week");
			insurance3 = input.nextDouble();
			double insurance3pay = insurance3 * 32.50;
			System.out.println("");
		}
		if(skillLevel == 3)
		{
			System.out.println("Would you like to participate in our retirement plan? 3% of your gross pay. 1 for yes, 0 for no. ");
			R = input.nextDouble();
		}
		
		System.out.println("how many hours have you worked this week?");
		 hoursWorked = input.nextDouble();
		 if(hoursWorked < 40)
		 {
			 overtime = hoursWorked - 40;
		 }
		 
			double Pay40 = hoursWorked * userPay;
			double overTime = (userPay *1.5)*overtime;
			double totalPay = Pay40 + overTime;
			double deductions = insurance1 +insurance2 +insurance3;
			double afterDeductions = totalPay - deductions;
			
		System.out.println("");
		System.out.println("You have worked "+ hoursWorked + " hours this week.");
		System.out.println("With an wage of "+ userPay + " an hor");
		System.out.println("you worked "+ hoursWorked+" at " +userPay+ "so you've made" + Pay40 );
		System.out.println("you've made " + overTime+ "in overtime this week.");
		System.out.println("You've made " + totalPay + "total this week. ");
		System.out.println("Your total after dedctions is " + afterDeductions);
		
		

	}

}
