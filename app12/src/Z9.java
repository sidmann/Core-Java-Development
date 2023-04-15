class Z9
{
	public static void main(String[] args)
	{
		System.out.println("main begin");
		boolean c1 = test1();
		System.out.println("main end:" + c1);
	}
	public static boolean test1()
	{
		System.out.println("from a test1");
		return true;
	}
}
