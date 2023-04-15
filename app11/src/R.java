class R
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 1;
		do
		{
			System.out.println("body begin");
			if (i == 3)
			{
				break;
			}
			System.out.println("body end");
			i++;
		}
		while (i <= 5);
		System.out.println("main end");
	}
}