package basicprograms;

import java.util.Scanner;

public class AreaOfSquare {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		
		System.out.println("Enter the value of a ");
		double a=s1.nextDouble();
		
		double square=a*a;
		System.out.println("The area of square is "+square);
		
		s1.close();
	}

}