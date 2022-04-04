package programs;

public class StringEquals
{
	public static void main(String[] args)
	{
		String A= "Vijay123" ;
		String B= "Capgemini6" ;
		String C= "Appium" ;
	
		boolean Length_of_A = (A.equals(B));
		System.out.println(Length_of_A);
		
		boolean Length_of_A1 = (A.equals(C));
		System.out.println(Length_of_A);
		
		if( A ==B && A==C )
		{
			System.out.println("String A is equals to String B & C");
		}
		
		else
		{
			System.out.println("String A is not equals to String B & C");
		}		
	}			
}
