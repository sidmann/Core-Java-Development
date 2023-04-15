class H
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if (false)
		{
		   System.out.println("if-block-stmt1");
		   int i = 100;
		   i++;
		   System.out.println("if-block-stmt4:" + i);
		}
		System.out.println("main end:" + i);
	}
}
