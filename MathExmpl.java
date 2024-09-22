package basicprograms;

public class MathExmpl
{
	public static void main(String[]args)
	{
	System.out.println(Math.addExact(20,30));
	System.out.println(Math.addExact(34235777687l,7959835738l));
	System.out.println(Math.subtractExact(20000,800));
	System.out.println(Math.subtractExact(34235777687l,7959835738l));
	System.out.println(Math.min (20,30));
	System.out.println(Math.min(6,30));
	System.out.println(Math.max(200,30));
	System.out.println(Math.max(20032.76,3009.867));
	System.out.println(Math.multiplyExact(12,3));
	System.out.println(Math.abs(-890.465));
	System.out.println(Math.abs(-8682698328l));
	
	for(int i=1; i>=5; i++)
	{
	System.out.println(Math.random());
	//Thread.sleep(3000);
	}
	
	}
}