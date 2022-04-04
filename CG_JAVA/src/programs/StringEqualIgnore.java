package programs;

public class StringEqualIgnore
{
	public static void main(String[] args)
	{
		String A= "Vijay" ;
		String C= "viJAY" ;
	
		boolean Length_of_A = (A.equalsIgnoreCase(C));
		System.out.println(Length_of_A);
		
		
		if(A.equalsIgnoreCase(C))
		{
			System.out.println("String A is equals to String C irrespective of the case");
		}
		
		else
		{
			System.out.println("String A is not equals to String C");
		}		
	}			
}
