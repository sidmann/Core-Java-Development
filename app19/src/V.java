class V
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			System.out.println("try begin");
			StringBuffer[] elements = new StringBuffer[999999999];
			for (int i = 0; i < elements.length; i++)
			{
				elements[i] = new StringBuffer("abc");
			}
			System.out.println("try end");
		}
		catch (OutOfMemoryError ex) //Throwable
		{
			System.out.println("from catch");
		}
		System.out.println("main end");
	}
}
