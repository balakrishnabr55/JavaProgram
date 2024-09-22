package basicprograms;

import java.util.Scanner;

public class AreaofCircle 
	{
	public static void main(String []args)
	{
		
	
		Scanner s1=new Scanner(System.in);
		
		
		System.out.println("Enter the r value  " );
		int r=s1.nextInt();
		
		
		System.out.println("Enter the pi value " );
		double pi=s1.nextDouble();
		
		double area=pi*r*r;
		System.out.println("Area of Circle is--> "+ area);
		
		s1.close();
	}
	 

}