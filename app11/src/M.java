class M
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 1;
		w1: 
		while (i <= 5)
		{
			System.out.println("loop body begin:" + i);
			for(int j = 101; j <= 105; j++)
			{
				System.out.println("for loop body begin:" + i + ", " + j);
				if (j == 102)
				{
					continue w1;
				}
				System.out.println("for loop body end:" + i + ", " + j);
			}
			System.out.println("loop body end:" + i);
			i++;
		}
		System.out.println("main end:" + i);
	}
}