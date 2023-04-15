class H
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		for(int i = 10000; i >= 1; i = i / 2)
		{
			System.out.println("loop " + i);
		}
		System.out.println("main end");
	}
}
