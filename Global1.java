package basicprograms;

import java.util.Scanner;

public class Global1 
{
	Scanner sc=new Scanner(System.in);
	
	int a=			sc.nextInt();
	int b=			sc.nextInt();
	
		static void add()
		{
			
			Global1 g1=new Global1();
			System.out.println("addition of two numbers");
			int sum=g1.a+g1.b;
			System.out.println(sum);
		}
		static void sub()
		{
			Global1 g1=new Global1();
			System.out.println("subtraction of two numbers");
			int sub=g1.a-g1.b;
			System.out.println(sub);
		}
		static void multi()
		{
			Global1 g1=new Global1();
			System.out.println("multiplication of two numbers");
			int mult=g1.a*g1.b;
			System.out.println(mult);
		}
		static void div()
		{
			Global1 g1=new Global1();
			System.out.println("division of two numbers");
			int div=g1.a/g1.b;
			System.out.println(div);
		}
		static void mod()
		{
			Global1 g1=new Global1();
			System.out.println("modulus of two numbers");
			int mod=g1.b%g1.a;
			System.out.println(mod);
		}

		
	public static void main(String[] args)
	{
		
		add();
		sub();
		multi();
		div();
		mod();
		

		}
		
}
