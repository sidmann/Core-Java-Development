class B
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if(false)
		{
			System.out.println("if1 begin");
			if(true)
			{
				System.out.println("if2");
			}
			else
			{
				System.out.println("else2");
			}
			System.out.println("if1 end");
	     }
		 else
		{
			 System.out.println("else1");
		}
		System.out.println("main end");
	}
}