class Z10
{
	public static void main(String[] args)
	{
		System.out.println("main begin");
		byte c1 = test1();
		System.out.println("main end:" + c1);
	}
	public static byte test1()
	{
		System.out.println("from a test1");
		return 100;
	}
}
