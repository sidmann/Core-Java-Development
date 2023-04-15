class X
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			System.out.println("try begin");
			main(null);
			System.out.println("try end");
		}
		catch (StackOverflowError ex) //Throwable
		{
			System.out.println("from catch");
		}
		System.out.println("main end");
	}
}
