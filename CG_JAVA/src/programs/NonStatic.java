package programs;

public class NonStatic
{
	public void add()
	{
		int a=5;
		int b=10;
		int c = a + b;
		System.out.println("Addition of 2 numbers");
		System.out.println(c);
		
	}	
	public static void main(String[] args)
	{
		new NonStatic().add();		
	}		
}
