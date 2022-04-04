package programs;

class NestedFor
{
	 public static void main(String s[])	
	    {
	        for(int i = 2; i <= 5; i++ )
	        {
	            for(int j = i; j <= 5; j++ )

	            {
	                System.out.println("i = " + i + " j = " + j);    
	            }
	        }
	    }
	}