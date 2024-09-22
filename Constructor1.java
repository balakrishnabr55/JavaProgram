package basicprograms;

public class Constructor1  
{
	Constructor1()
	{
		System.out.println("1st");
	}
	
	Constructor1(int a)
	{
		System.out.println("2nd");
	}
	
	Constructor1(int a,double b)
	{
		System.out.println("3rd");
	}
	
	Constructor1(double a, float f)
	{
		System.out.println("4th");
	}
	
	public static void main(String[] args) 
	{

		new Constructor1();
		new Constructor1(20);
		new Constructor1(20,30.33333);
		new Constructor1(20.5336,30.8f);
		
		
	}

}
