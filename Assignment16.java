package basicprograms;

class inheritance1
{
	static void colour()
	{
		System.out.println("Blue");
	}
	
	void planet()
	{
		System.out.println("Earth");
	}
	
	void ocean()
	{
		System.out.println("Bay of bengal");
	}
	
}

class inheritance2 extends inheritance1

{
	void add(int a, int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
	
	static void sub(double a, int b)
	{
		double sub=a-b;
		System.out.println(sub);
	}
	
}

class inheritance3 extends inheritance2

{
	void mul(int a, int b)
	{
		int mul=a*b;
		System.out.println(mul);
	}
	
	static void div(double a, int b)
	{
		double div=a/b;
		System.out.println(div);
	}
	
}

public class Assignment16 extends inheritance3

{
	public static void main(String[] args) 
	{
		Assignment16 a1=new Assignment16();
		colour();
		a1.planet();
		a1.ocean();
		a1.add(10, 30);
		sub(20,15);
		a1.mul(5, 16);
		div(45,3);

		System.out.println("static and non static multi level inheritance printed using 4 classes");
		
	}
}
