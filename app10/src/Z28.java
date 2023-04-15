class Z28
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		for(int i = 1; (i % 2 == 0 || i <= 40); i++)
		{
			System.out.println(i + ", ");
		}
		System.out.println("main end");
	}
}
