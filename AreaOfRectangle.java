package basicprograms;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		
		System.out.println("Enter the value of length ");
		double l=s1.nextDouble();
		
		System.out.println("Enter the value of width ");
		double b=s1.nextDouble();
		
		double rectangle=l*b;
		System.out.println("The Area of rectangle is "+ rectangle);
		
		s1.close();
	}

}