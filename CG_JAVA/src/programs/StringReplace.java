package programs;

public class StringReplace
{
	public static void main(String[] args)
	{
		String A= "abcdef" ;
		String B= "xyz1234" ;
		String C= "abcxy" ;
		
	
		String Length_of_B = (B.toUpperCase());
		System.out.println(Length_of_B);
		
		
		if(Length_of_B.contains("Z"))
		{
			System.out.println("String B contains Z");
		}
		
		else
		{
			System.out.println("String B does not contains Z");
		}	
		
		if(Length_of_B.contains("z"))
		{
			System.out.println("String B doesnot contains z");
		}
		
		else
		{
			System.out.println("String B does not contains z");
		}
	}		
}
