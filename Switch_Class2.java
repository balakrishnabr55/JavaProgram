package basicprograms;

import java.util.Scanner;

public class Switch_Class2 
{

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter 1 for Monday");
		System.out.println("Please enter 2 for Tuesday");
		System.out.println("Please enter 3 for Wednesday");
		System.out.println("Please enter 4 for Thursday");
		System.out.println("Please enter 5 for Friday");
		System.out.println("Please enter 6 for Satuday");
		System.out.println("Please enter 7 for Sunday");
		
		int day= sc.nextInt();
		sc.close();
		
		switch (day)
		{
		
		case 1: System.out.println("Monday");
		break;
		case 2: System.out.println("Tuesday");
		break;
		case 3: System.out.println("Wednesday");
		break;
		case 4: System.out.println("Thurday");
		break;
		case 5: System.out.println("Friday");
		break;
		case 6: System.out.println("Saturday");
		break;
		case 7: System.out.println("Sunday");
		break;
		default:
			System.out.println("Your selection is wrong, Please enter valid input. ");
		}
		
		
	}

}
