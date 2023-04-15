class Z18
{
	public static void main(String[] args)
	{
		System.out.println("main begin");
		Runnable i = test();
		System.out.println("main end: " + i);
	}
	public static Runnable test()
	{
		System.out.println("test");
		return null;
	}
}
