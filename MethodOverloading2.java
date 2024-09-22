package basicprograms;

public class MethodOverloading2 
{
	void division(int c, int d)
	{
		int div=c/d;
		System.out.println(div);
	}
	void division(int c, float d)
	{
		float div=c/d;
		System.out.println(div);
	}
	void division(double c, float d)
	{
		double div=c/d;
		System.out.println(div);
	}
	void division(char m, boolean t, String r)
	{
		System.out.println('M'+" "+ "Name of the employee "+ r);
	}
	void division(double c, int d)
	{
		double div=c/d;
		System.out.println(div);
	}

	public static void main(String[]args)
	{
		MethodOverloading2 m1=new MethodOverloading2();
		m1.division(567,25);
		m1.division(300,15.5f);
		m1.division(500.675,17.7f);
		m1.division('M',true,"Vinay");
		m1.division(665.4321,35);
	}

}
