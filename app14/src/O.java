class O
{
	static int i;
	static int j = i; // direct read
	static int k = O.i; // indirect read
	public static void main(String[] args)
	{
		System.out.println("done");
	}
}
