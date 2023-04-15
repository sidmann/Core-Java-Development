class Z17
{
	public static void main(String[] args)
	{
		System.out.println("main begin");
		StringBuffer i = test();
		System.out.println("main end: " + i);
	}
	public static StringBuffer test()
	{
		System.out.println("test");
		return new StringBuffer("abc");
	}
}
