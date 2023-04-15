class Z13
{
	public static void main(String[] args)
	{
		System.out.println("main begin");
		Thread c1 = test1();
		System.out.println("main end: " + c1);
	}
	public static Thread test1()
	{
		System.out.println("from a test1");
		return new Thread();
	}
}
