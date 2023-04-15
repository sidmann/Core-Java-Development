class B
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
			System.out.println("else block end");
		}
		System.out.println("main end");
	}
}