class Z3
{
	public static void main(String[] args)
	{
		System.out.println("main");
		int b1 = test();
		System.out.println("main1: " + b1);
		System.out.println("-------------");
		System.out.println("main2: " + test());
	}
	public static int test()
	{
		System.out.println("test");
		return 100;
	}
}
