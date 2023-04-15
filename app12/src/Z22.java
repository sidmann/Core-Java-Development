class Z22
{
	public static void main(String[] args)
	{
		System.out.println("main begin");
		test(10);
		System.out.println("main end:"  + i);
	}
	public static void test(int i)
	{
		System.out.println("test:" + i);
		i = 20;
	}
}
