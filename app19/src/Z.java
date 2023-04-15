class Z
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			System.out.println("try begin");
			int i = 10 / 0;
			System.out.println("try end");
		}
		catch (ArithmeticException ex) //Throwable
		{
			System.out.println("from catch begin");
			int i = 10 / 0;
			System.out.println("from catch end");
		}
		System.out.println("main end");
	}
}
