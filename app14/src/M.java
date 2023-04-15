class M
{
	static int i;
	static
	{
		System.out.println(i); // direct read
		i = 10; // direct write
		System.out.println(M.i); // indirect read
		M.i = 10; // indirect write
	}
	public static void main(String[] args)
	{
		System.out.println("done");
	}
}
