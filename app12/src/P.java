class P
{
	public static void test1() 
	{
		System.out.println("test1 begin");
		if (true)
		{
			System.out.println("from if");
			return;
		}
		System.out.println("test1 end");
	}
	public static void main(String[] args)
	{
		System.out.println("main begin");
		test1();
		System.out.println("main end");
	}

}
