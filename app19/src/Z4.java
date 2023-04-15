class Z4
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println(1);
			System.out.println(2);	
		}
		catch (ArithmeticException ex)
		{
			int i = 20;
		}
		System.out.println("main end:" + i);
	}
}
