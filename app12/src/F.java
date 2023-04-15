class F
{
	public static void test1() 
	{
		System.out.println("from test1");
	}
	public static void main(String[] args)
	{
		System.out.println("main begin");
		test1();
		System.out.println("----------");
		test2();
		System.out.println("main end");
	}
	public static void test2() 
	{
		System.out.println("from test2");
	}

}
