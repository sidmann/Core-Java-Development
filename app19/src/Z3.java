class Z3 
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println(1);
			int i = 10;
			System.out.println(2);	
		}
		catch (ArithmeticException ex)
		{
			i = 20;
		}
		System.out.println("main end:" + i);
	}
}
