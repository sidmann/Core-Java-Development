class T
{
	static int i = test();
	static int j = 10;

	static int test()
	{
		return j;
	}

	public static void main(String[] args)
	{
		System.out.println("main: " + i + ", " + j);
	}
}
