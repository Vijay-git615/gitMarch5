package programs;

public class PrivateMethodAccess
{
	public void anotherMethod() 
	{
        PrivateMethodClass obj = new PrivateMethodClass();
        // access public method, no problem
        obj.publicMethod();  
        // access private method, error!!!
        obj.privateMethod();
     }
}
