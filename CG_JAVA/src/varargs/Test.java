package varargs;

class Test
{

	// Takes string as a argument followed by varargs
	static void varargs(String str, int... a)
	{
		System.out.println("String: " + str);
		System.out.println("Number of arguments : " + a.length);

		
		for (int i : a)
		{
			System.out.print(i + " ");
		}

		System.out.println();
	}

	public static void main(String args[])
	{
		varargs("JAVA",100, 200);
		varargs("PYTHON", 1, 2, 3, 4, 5);
		varargs("RUBY",5);
	}
}
