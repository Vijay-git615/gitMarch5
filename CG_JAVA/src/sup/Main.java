package sup;


class Addition
{	
	Addition()
	{
		int a=2;
		int b=3;
		int c=a+b;
		
		System.out.println("Addition of 2 numbers = " + c);
		
	}
}

class Child extends Addition
{
	
	Child()
	{
		// invoke or call parent class constructor		
		super();
		
		System.out.println("I am Child class Constructor");
		
	}
}

class Main
{
	public static void main(String[] args)
	{
		Child c = new Child();
	}
}

