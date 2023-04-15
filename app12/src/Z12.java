class Z12
{
	public static void main(String[] args)
	{
		System.out.println("main begin");
		String c1 = test1();
		System.out.println("main end: " + c1);
	}
	public static String test1()
	{
		System.out.println("from a test1");
		return "abc";
	}
}
