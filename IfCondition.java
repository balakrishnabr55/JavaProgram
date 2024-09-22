package basicprograms;

import java.util.Scanner;

public class IfCondition 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		sc.close();
		
		if(a>b)
		{
			System.out.println("1st");
		}
		
		if(a<b)
		{
			System.out.println("2nd");
		}
		
		if(a==b)
		{
			System.out.println("3rd");
		}
		
		if(a>=b)
		{
			System.out.println("4th");
		}
		
		if(a<=b)
		{
			System.out.println("5th");
		}
		
		if(a!=b)
		{
			System.out.println("6th");
		}

		
	}

}
