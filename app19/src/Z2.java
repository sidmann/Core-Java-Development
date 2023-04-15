class Z2 
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		try
		{
			System.out.println(3);
			int i = 10 / 0;
			System.out.println(4);
		}
		catch (ArithmeticException ex)
		{
			System.out.println(5);
			try
			{
				System.out.println(6);
				int i = Integer.parseInt("abc");
				System.out.println(7);
			}
			catch (NumberFormatException ex1)
			{
				System.out.println(8);
			}
			System.out.println(9);
		}
		System.out.println(2);
	}
}
