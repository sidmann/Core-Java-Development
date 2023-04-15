class L
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if(false)
		{
			System.out.println("if block");
		}
		else 
		{
			System.out.println("else block begin");
			if(false)
			{
				System.out.println("else if block");
			}
			else
			{
				System.out.println("else2-begin");
				if(true)
				{
					System.out.println("else2-if");
				}
				System.out.println("else2-end");
			}
			System.out.println("else block end");
		}
		System.out.println("main end");
	}
}