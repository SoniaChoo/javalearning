class Demo
{	
	public static void func() throws Exception
	{
			throw  new Exception();
			//System.out.println("A");
	}
	public static void main(String[] args)
	{
		try
		{
			func();
		}
		catch(Exception e)
		{
			System.out.println("C");
		}
		System.out.println("D");
	}
}