class Z27
{
	public static void main(String[] args)
	{
		System.out.println("main begin");
		int k = 1;
		test(k);
		System.out.println("main end:" + k);
	}
	public static void test(int i)
	{
		System.out.println("test:" + i);
		i = 2;
	}
}
