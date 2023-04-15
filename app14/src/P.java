class P
{
	static int i;
	static int j = i; // direct read
	static int k = P.i; // indirect read
	static int l = test();
	static int test()
	{
		return i; // indirect read
	}
	public static void main(String[] args)
	{
		System.out.println("done");
	}
}
