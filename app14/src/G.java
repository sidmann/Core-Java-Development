class G
{
	static int i = test();
	static
	{
		System.out.println("sib");
	}
	static int test()
	{
		System.out.println("from test");
		return 200;
	}
	public static void main(String[] args) 
	{
		System.out.println("main:" + i);
	}
}
