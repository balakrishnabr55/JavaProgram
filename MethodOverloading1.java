package basicprograms;

public class MethodOverloading1 
{
	static void subtraction(int c, int d)
	{
		int sub=c-d;
		System.out.println(sub);
	}
	static void subtraction(int c, float d)
	{
		float sub=c-d;
		System.out.println(sub);
	}
	static void subtraction(double c, float d)
	{
		double sub=c-d;
		System.out.println(sub);
	}
	static void subtraction(char m, boolean t, String r)
	{
		System.out.println('M'+" "+ "Name of the employee "+ r);
		System.out.println(t);
	}
	static void subtraction(int c, float d,double l)
	{
		double sub=c-d-l;
		System.out.println(sub);
	}

	public static void main(String[]args)
	{
		subtraction(30,20);
		subtraction(30,15.5f);
		subtraction(500.67543,200.7f);
		subtraction('M',true,"Sravan");
		subtraction(1000,230.3f,665.4321);
	}
}