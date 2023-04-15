class Z36
{
	public static void main(String[] args)
	{
		System.out.println("main begin");
		//test(10);
		//test(10, 20);
		//test(10, 20, true);
		test(10, 20, 400);
		System.out.println("main end");
	}
	static void test(int i, int j, int k)
	{
		System.out.println("test" + i + ", " + j + ", " + k);
	}
}
