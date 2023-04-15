class Z16
{
	public static void main(String[] args)
	{
		System.out.println("main begin");
		short i = test();
		System.out.println("main end: " + i);
	}
	public static short test()
	{
		System.out.println("test");
		return 400;
	}
}
