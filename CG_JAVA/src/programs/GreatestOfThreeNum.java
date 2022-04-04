package programs;

public class GreatestOfThreeNum
{
	public static void main(String[] args)
	{
        int a = 35;
        int b = 28;
        int c = 5;

        if (a > b && a > c)
        {
            System.out.println(a + " is the greatest number");
        }
        
        else if (b > c)         	
        	{
            System.out.println(b + " is the greatest number");
        	} 
        		else
        		{
        			System.out.println(c + " is the greatest number");
        		}
    }
}
	

