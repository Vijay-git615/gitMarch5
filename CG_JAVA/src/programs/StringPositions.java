package programs;

public class StringPositions
{
	public static void main(String[] args)
	{
		String a= "abcd" ;
		String b= "xyz" ;
		String c = "abcd xyz klmn 1234 4567";
	
		char Length_of_c = (c.charAt(7));
		System.out.println(Length_of_c);
		
		if(Length_of_c == 'z' || Length_of_c == 'y')
		{
			System.out.println("Yes 7th position in C variable is : " + Length_of_c);
			
		}
		
		int Length_of_c1 = (c.indexOf("k"));
		System.out.println(Length_of_c1);
	
		if(Length_of_c1 == 10 || Length_of_c == 11)
		{
			System.out.println("K is available in 10th or 11th position" + Length_of_c);
			
		}
		
		else
		{
			System.out.println("No, K is not available in 10th or 11th position,"
					+ "it is available in Position :  " + Length_of_c1);
		}
					
	}
}
