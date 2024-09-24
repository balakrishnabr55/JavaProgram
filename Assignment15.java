package basicprograms;
class AddSubMul
{
	void add(int a, int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}

	void sub(double a, double b)
	{
		double sub=a-b;
		System.out.println(sub);
	}

	void mul(double a, float b)
	{
		double mul=a*b;
		System.out.println(mul);
	}
}
public class Assignment15 extends AddSubMul
{
	
	void div(double a, int b)
	{
		double div=a/b;
		System.out.println(div);
	}
	void mod(int a, float b)
	{
		double mod=a%b;
		System.out.println(mod);
	}
	
	public static void main(String[] args) 
	{
		Assignment15 a2=new Assignment15();
		a2.add(10,40);
		a2.sub(85, 53);
		a2.mul(567.8767, 10.6f);
		a2.div(545.765,56);
		a2.mod(245,56.6f);
		
	}

}
