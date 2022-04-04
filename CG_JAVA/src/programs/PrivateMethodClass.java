package programs;

public class PrivateMethodClass
{
	void privateMethod()
	{
        System.out.print("Method not accessible outside this class");
    }
	
   public void publicMethod()
   {
      // access private method, no problem
      privateMethod();
   }		  		  
}
