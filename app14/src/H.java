class H
{
	static int i = test();
	static
	{
		System.out.println("sib: " + i);
		i += 10;
	}
	static int test()
	{
		System.out.println("from test: " + i);
		i += 5;
		return i + 200;
	}
	public static void main(String[] args) 
	{
		System.out.println("main: " + i);
	}
}
