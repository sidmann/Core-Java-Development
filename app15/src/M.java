class M
{
	int i;

	static void test()
	{
		M m1 = new M();
		m1.i = 9090;
		System.out.println("m1.i:" + m1.i);
	}

	public static void main(String[] args)
	{
		System.out.println("main begin");
		M m1 = new M();
		test();
		System.out.println("main end:" + m1.i);
	}
}
