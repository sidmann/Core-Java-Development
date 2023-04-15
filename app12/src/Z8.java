class Z8
{
	public static void main(String[] args)
	{
		System.out.println("main begin");
		char c1 = test1();
		System.out.println("main end:" + c1);
	}
	public static char test1()
	{
		System.out.println("from a test1");
		return 'w';
	}
}
