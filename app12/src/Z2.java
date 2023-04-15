class Z2
{
	public static void main(String[] args)
	{
		System.out.println("main");
		int b1 = test();
		System.out.println("main end:" + b1);
	}
	public static int test()
	{
		System.out.println("test");
		return 100;
	}
}
