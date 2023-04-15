class Y
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 10 / 0;
		try
		{
			System.out.println("try begin");
			System.out.println("try end");
		}
		catch (NumberFormatException ex) //Throwable
		{
			System.out.println("from catch");
		}
		System.out.println("main end");
	}
}
