class N
{
	int i;

	static void test(N obj)
	{
		System.out.println("test:" + obj.i);
		obj.i = 20;
	}

	public static void main(String[] args)
	{
		System.out.println("main begin");
		N n1 = new N();
		n1.i = 10;
		System.out.println("main1:" + n1.i);
		test(n1);
		System.out.println("main2:" + n1.i);
		System.out.println("main end");
	}
}
