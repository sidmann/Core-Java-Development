class L
{
	int i;

	static void test()
	{
		L obj = new L();
		obj.i = 89;
		System.out.println("test:" + obj.i);
	}

	public static void main(String[] args)
	{
		System.out.println("main begin");
		test();
		System.out.println("main end");
	}
}
