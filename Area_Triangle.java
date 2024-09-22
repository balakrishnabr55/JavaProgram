package basicprograms;

import java.util.Scanner;

public class Area_Triangle {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		double a=0.5;
		
		System.out.println("Enter the vslue of base ");
		double base=s1.nextDouble();
		
		System.out.println("Enter the value of hight ");
		double hight=s1.nextDouble();
		
		double triangle=a*base*hight;
		System.out.println("The area of triangle is "+ triangle);

		s1.close();
	}

}
