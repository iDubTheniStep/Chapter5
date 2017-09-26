package exersises;

import java.util.Scanner;

public class AscendingAndDescending
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int userInt1;
		int userInt2;
		int userInt3;
		int LargestNum = 0;
		int SecondLargest = 0;
		int smallestNum = 0; 
		
		System.out.println("Please enter your first int");
		userInt1 = input.nextInt();
		System.out.println("Please enter your second int");
		userInt2 = input.nextInt();
		System.out.println("Please enter your third int");
		userInt3 = input.nextInt();
		
		if(userInt1 >= userInt2 && userInt1 >=userInt3)
		{
			LargestNum = userInt1;
		}
		if(userInt2 >= userInt1 && userInt2 >= userInt3)
		{
			LargestNum = userInt2;
		}
		if(userInt3 >= userInt2 && userInt3 >= userInt2)
		{
			LargestNum = userInt3;
		}
		
		if(userInt1 >= userInt2 && userInt1 <= userInt3|| userInt1 >= userInt3 && userInt1 <= userInt2 )
		{
			SecondLargest = userInt1;
		}
		if(userInt2 >= userInt1 && userInt2 <= userInt3|| userInt2 >= userInt3 && userInt2 <= userInt1 )
		{
			SecondLargest = userInt2;
		}
		if(userInt3 >= userInt1 && userInt3 <= userInt2 || userInt3 >= userInt2 && userInt3 <= userInt1 )
		{
			SecondLargest = userInt3;
		}
		
		if(userInt1 <= userInt2 && userInt1 <= userInt3)
		{
			smallestNum = userInt1;
		}
		if(userInt2 <= userInt1 && userInt2 <= userInt3)
		{
			smallestNum = userInt2;
		}
		if(userInt3 <= userInt2 && userInt3 <= userInt2)
		{
			smallestNum = userInt3;
		}
		
		
		
			System.out.println("Your numbers in Ascend is ;");
			System.out.println(smallestNum);
			System.out.println(SecondLargest);
			System.out.println(LargestNum);
			
			System.out.println("Your numbers decending is ;");
			System.out.println(LargestNum);
			System.out.println(SecondLargest);
			System.out.println(smallestNum);
		
	}

}
