package basicprograms;

public class Assertion_Class 
{

	public static void main(String[] args) 
	{
	
		int age=19;
		//assert age>=18;// this way we can write or we can follow next step.
		assert age>=18:"Sorry but the age of the person is not as expected";
		//above line will execute only when then line is failing and it will return assertionError.
		
		System.out.println("The age of the person is "+age);
		
	}

}
