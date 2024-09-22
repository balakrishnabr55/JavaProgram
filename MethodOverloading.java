package basicprograms;

public class MethodOverloading 
{

	static void addition(int a, int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
	
	static void addition(double a,double b)
	{
		double sum=a+b;
		System.out.println(sum);
	}
	void addition(double a, float b)
	{
		double sum=a+b;
		System.out.println(sum);
	}
	
	public static void main(String[] args)
	{
		
		MethodOverloading me=new MethodOverloading();
		me.addition(22.5879, 46.5f);
		addition(10,20);
		addition(456.7789,3525.498797);
		System.out.println("Static and non static methods used with methodoverloading concept");
		
	}

}
