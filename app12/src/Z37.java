class Z37
{
	public static void main(String[] args)
	{
		System.out.println("main begin");
		test(10, true, 400);
		System.out.println("main end");
	}
	static void test(int i, boolean j, int k)
	{
		System.out.println("test" + i + ", " + j + ", " + k);
	}
}
