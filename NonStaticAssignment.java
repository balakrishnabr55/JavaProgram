package basicprograms;

public class NonStaticAssignment 
{

	void addition()
	{
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println(sum);	
	}
	
	void subtraction() 
	{
		int a=10;
		int b=5;
		int sub=a-b;
		System.out.println(sub);
	}
	void multiplication()
	{
		int a=20;
		int b=50;
		int multi=a*b;
		System.out.println(multi);
	}
	void division()
	{
		int a=245;
		int b=5;
		int div=a/b;
		System.out.println(div);
	}
	void modulus()
	{
		int a=40;
		int b=6;
		int mod=a%b;
		System.out.println(mod);
	}
	
	public static void main(String[] args) 
	{
		NonStaticAssignment n1=new NonStaticAssignment();
		n1.addition();
		n1.subtraction();
		n1.multiplication();
		n1.division();
		n1.modulus();
		System.out.println("Above are the non static methods");
		
	}

}