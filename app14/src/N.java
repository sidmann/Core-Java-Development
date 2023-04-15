class N
{
	static int i;
	static
	{
		test();
	}
	static void test()
	{
		System.out.println(i); // indirect read
		i = 10; // indirect write
		System.out.println(N.i); // indirect read
		N.i = 10; // indirect write
	}
	public static void main(String[] args)
	{
		System.out.println("done");
	}
}
