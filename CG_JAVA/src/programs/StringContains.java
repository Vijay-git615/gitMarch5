package programs;

public class StringContains
{
	public static void main(String[] args)
	{
		String A= "VijayCD" ;
	
		boolean Length_of_A = (A.contains("CD"));
		System.out.println(Length_of_A);
		
		boolean Length_of_A1 = (A.contains("XY"));
		System.out.println(Length_of_A1);
		
		
		if(A.contains("CD"))
		{
			System.out.println("String A contains characters CD");
		}
		
		else
		{
			System.out.println("String A doesnt contains characters CD");
		}	
		
		if(A.contains("XY"))
		{
			System.out.println("String A contains characters XY");
		}
		
		else
		{
			System.out.println("String A doesnt contains characters XY");
		}		
	}			
}
