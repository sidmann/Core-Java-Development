class Z5
{
	public static void main(String[] args)
	{
		System.out.println("main begin");
		System.out.println("sum:" + 500 + test());
		System.out.println(500 + test() + " is sum");
		System.out.println("sum:" + test() + test());
		System.out.println(test() + test() + " is sum");
	}
	public static int test()
	{
		System.out.println("test");
		return 100;
	}
}
