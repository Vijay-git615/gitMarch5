package programs;

public class StringConcat
{
	public static void main(String[] args)
	{
		String a= "abcd" ;
		String b= "xyz" ;
		String c= "abcd xyz klmn 1234 4567" ;
	
		int Length_of_a = (a.length());
		System.out.println("String a lenth  is : " +Length_of_a);
		
		int Length_of_b = (b.length());
		System.out.println("String b lenth  is : " +Length_of_b);
		
		int Length_of_c = (c.length());
		System.out.println("String c lenth  is : " +Length_of_c);
		
		String String_ab = (a.concat(b));
		System.out.println("Concatination of String a & b is : " + String_ab);
		
		int Length_of_ab = (String_ab.length());
		System.out.println("Concatinated String ab length  is : " + Length_of_ab);
		
		if( Length_of_ab < Length_of_c && Length_of_ab > 5 )
		{
			System.out.println("Concatinated String_ab length is lesser than String_c AND"
					+ " greater than 5");
		}		
	}		
}
