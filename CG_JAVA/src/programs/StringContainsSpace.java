package programs;

public class StringContainsSpace
{
	public static void main(String[] args)
	{
		String a= "abcd" ;
		String b= "xyz" ;
		String c = "abcd xyz klmn 1234 4567";
	
		boolean Length_of_c = (c.contains(" "));
		System.out.println(Length_of_c +  " : C variable contains space " );
		
		boolean Length_of_c1 = (!c.contains("9"));
		System.out.println(Length_of_c1 +  " : C variable does not contains 9 " );
					
	}
}
