class Z12
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		for(int i = 1, j = 20; j >= -10 ; i += 5, j -= 3)
		{
			System.out.println("loop body:" + i + ", " + j);
		}
	}
}
