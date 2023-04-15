class M
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if (true)
		{
			System.out.println("if1 begin");
			if (false)
			{
				System.out.println("if2 begin");
				if (true)
				{
					System.out.println("if3");
				}
				System.out.println("if2 end");
			}
			System.out.println("if1 end");
		}
		System.out.println("main end");
	}
}
