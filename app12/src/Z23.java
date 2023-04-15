class Z23
{
	public static void main(String[] args)
	{
		System.out.println("main begin");
		test(10);
		test(20);
		test(30);
		test(-20);
		System.out.println("main end");
	}
	public static void test(int i)
	{
		System.out.println("test:" + i);
	}
}
