package programs;

public class StringStartsEnds
{
	public static void main(String[] args)
	{
		String a= "abcd" ;
		String b= "xyz" ;
	
		boolean Length_of_a = (a.startsWith("ab"));
		System.out.println(Length_of_a +  " : String A starts with ab " );
		
		boolean Length_of_b = (!b.endsWith("yz"));
		System.out.println(Length_of_b +  " : String B endss with yz " );			
	}
}
