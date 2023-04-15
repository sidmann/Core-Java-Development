class S
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
		catch (ArrayIndexOutOfBoundsException ex) //Throwable
		{
			System.out.println("from catch");
		}
		System.out.println("main end");
	}
}
