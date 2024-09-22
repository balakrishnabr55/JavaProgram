package basicprograms;

import java.util.Scanner;

public class Switch_Class 
{

	public static void main(String[] args) 
	{
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter 1 for Chrome ");
		System.out.println("Please enter 2 for firbox ");
		System.out.println("Please enter 3 for edge ");
		System.out.println("Please enter 4 for Safari ");
		int input= sc.nextInt();
		
		sc.close();
		
		switch (input)
		{
		case 1: System.out.println("Launching Chrome browser");
			break;
		case 2: System.out.println("Launching firefox broser");
		break;
		case 3: System.out.println("Launching edge browser");
		break;
		case 4: System.out.println("Launching Safari browser");
		break;
		default:
			System.out.println("Your selection is wrong, Can you please try again");
			
		}
	}
	
}
