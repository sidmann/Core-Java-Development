class Z28
{
	public static void main(String[] args)
	{
		System.out.println("main begin");
		int i = 1;
		test(i);
		System.out.println("main end:" + i);
	}
	public static void test(int i)
	{
		System.out.println("test:" + i);
		i = 2;
	}
}
