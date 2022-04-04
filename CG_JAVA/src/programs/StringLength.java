package programs;

public class StringLength
{
	public static void main(String[] args)
	{
		String a= "abcd" ;
		String b= "xyz" ;
		String c= "abcd xyz klmn 1234 4567" ;
	
		int Length_of_a = (a.length());
		System.out.println(Length_of_a);
		
		int Length_of_b = (b.length());
		System.out.println(Length_of_b);
		
		int Length_of_c = (c.length());
		System.out.println(Length_of_c);
		
		if( Length_of_a > Length_of_b )
		{
			System.out.println("String_a length is greater than String_b");
		}
		
		else
		{
			System.out.println("String_a length is not greater than String_c");
		}
		
		if( Length_of_a < Length_of_c )
		{
			System.out.println("String_a length is lesser than String_c");
		}	
	}		
}
