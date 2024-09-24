package basicprograms;

class Name1 //parent class.
{

	static void add(int a, int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
	static void sub(double a, int b)
	{
		double sub=a-b;
		System.out.println(sub);
	}
	
	static void manchester()
	{
		for(int i=1; i<=3; i++)
		{
			System.out.println("It is a city in England "+ i);
		}
	}
}

public class Assignment14 extends Name1 // sub class/Child class.
{

	static void city(int a, String city1)
	{
		System.out.println(a+" Delhi");
	}
	
	static void place(String name, char c)
	{
		System.out.println("Location" +c);
	}
	
	static void mod(double a, double b)
	{
		double mod=a%b;
		System.out.println(mod);
	}
	
	public static void main(String[] args) 
	{
		manchester();
		city(330,"Capital of India");
		place("Banaswadi", 'F');
		mod(55.4353, 05.445);
		add(10,20);
		sub(34.4332,23);
		
	}
	
}
