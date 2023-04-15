class Q
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		for(int i = 1; i <= 10; i++)
		{
			System.out.println("loop iteration begin with " + i);
			if(i == 5)
			{
				break;
			}
			System.out.println("loop iteration end with " + i);
		}
		System.out.println("main end");
	}
}
