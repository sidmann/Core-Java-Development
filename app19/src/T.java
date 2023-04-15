class T
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			System.out.println("try begin");
			int i = Integer.parseInt("abc");
			System.out.println("try end");
		}
		catch (NumberFormatException ex) //Throwable
		{
			System.out.println("from catch");
		}
		System.out.println("main end");
	}
}
