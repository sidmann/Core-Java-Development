class A
{
	static int i = test();
	static int test()
	{
		System.out.println("from test");
		return 100;
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println("main:" + i);
		System.out.println("main end");
	}
}
