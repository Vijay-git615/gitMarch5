package wrapper_class;

public class Autoboxing
{
	public static void main(String args[])
	{  
		//Converting int primitive into Integer object  
		
		int num=100;  
		
		Integer wrap = Integer.valueOf(num);  

		System.out.println(num+ " "+ wrap);  
	}
}
