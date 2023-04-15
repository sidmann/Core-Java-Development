class Z4
{
	public static void main(String[] args)
	{
		System.out.println("main begin");
		System.out.println("main end: " + test() + ":" + test() + ":" + test());
	}
	public static int test()
	{
		System.out.println("test");
		return 100;
	}
}
