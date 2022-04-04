package programs;

public class SplitStringToArray
{
	public static void main(String[] args)
	{
		String a= "abcd" ;
		String b= "xyz" ;
		String c = "abcd xyz klmn 1234 4567";
		
	    String [] arrSplit  = arrSplit = c.split(" ",5);
	 
	    for (int i=0; i < arrSplit.length; i++)
	    {
	      System.out.println( "arrSplit[" + i+ "] = " + arrSplit[i]);
	    }
	    
	    System.out.println( arrSplit.length ==4 || arrSplit.length == 5 );
	    
	    System.out.println( arrSplit[0].equals(a));
	    
	    System.out.println( !arrSplit[0].equals(arrSplit[2]));	    	    	    	   	    	    					
	}
}
