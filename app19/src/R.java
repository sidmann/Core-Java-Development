class R
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			System.out.println("try begin");
			int[] elements = {10, 20, 30};
			int i = elements[3];
			System.out.println("try end");
		}
		catch (ArrayIndexOutOfBoundsException ex) //Throwable
		{
			System.out.println("from catch");
		}
		System.out.println("main end");
	}
}
