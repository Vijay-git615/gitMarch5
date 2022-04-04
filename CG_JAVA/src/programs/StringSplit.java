package programs;

public class StringSplit
{
	public static void main(String[] args)
	{
		String a= "abcd" ;
		String b= "xyz" ;
		String c = "abcd xyz klmn 1234 4567";

	    String [] arrSplit  = c.split(" ");
	    for (int i=0; i < arrSplit.length; i++)
	    {
	      System.out.println(arrSplit[i]);
	    }	    
	    int LengthofArray = arrSplit.length;
	   	    
	    if(LengthofArray == 4 || LengthofArray == 5)
	    {
	    	System.out.println("Length of Array is : " + LengthofArray);
	    }					
	}
}
