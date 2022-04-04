package wrapper_class;

public class Unboxing
{
	public static void main(String args[])
	{  
		//Creating Wrapper class object 
		Integer wrap = new Integer(50);  
			
		//Converting the wrapper object to primitive
		int num = wrap.intValue();

		System.out.println(num+ " "+ wrap);  
	}
}
