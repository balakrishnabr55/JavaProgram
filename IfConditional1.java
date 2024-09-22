package basicprograms;

public class IfConditional1 
{

	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		
		if(a<b && a==10)
		{
			System.out.println("1");
		}

		if(a==b || a==10)
		{
			System.out.println("2");
		}

		if(!(a<b && a==10)) // it will reverse the output.
		{
			System.out.println("3");
		}

		if(!(a==b || a==10)) // it will reverse the output.
		{
			System.out.println("4");
		}
		
	}

}
