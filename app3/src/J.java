class J
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 100;
		if (false)
		{
		   System.out.println("if-block-stmt1");
		   i++;
		   System.out.println("if-block-stmt4:" + i);
		}
		System.out.println("main end:" + i);
	}
}
