package basicprograms;

import java.util.Scanner;

public class CircumferanceOfCircle 
{
	
	public static void main(String[]args)
	{
		Scanner s1=new Scanner(System.in);
		int a=2;
		System.out.println(a);
		
		System.out.println("Enter the pi value " );
		double pi=s1.nextDouble();
		
		System.out.println("Enter the r value ");
		double r=s1.nextInt();
		
		Double Circle = a*pi*r;
		System.out.println("The value of Circumferance of Circle is "+ Circle);
		
		s1.close();
	}
}
