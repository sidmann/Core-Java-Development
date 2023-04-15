class D
{
	static int i = test();
	static int j = test();
	static int test()
	{
		System.out.println("from test: " + i + ", " + j);
		i = i + j + 1;
		j = i + j + 2;
		return i + j + 3;
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println("main: " + i + ", " + j);
		System.out.println("main end");
	}
}
