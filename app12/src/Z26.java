class Z26
{
	public static void main(String[] args)
	{
		System.out.println("main begin");
		int k;
		test(k = 180);
		System.out.println("main end");
	}
	public static void test(int i)
	{
		System.out.println("test:" + i);
	}
}
