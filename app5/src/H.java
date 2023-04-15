class H
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 0;
		if (true)
		{
			System.out.println("if:" + i);
			i++;
		}
		else
		{
			System.out.println("else-stmt1");
			System.out.println("else-stmt2:" + i);
			i += 9;
			System.out.println("else-stmt3:" + i);
	    }
		System.out.println("main end:" + i);
	}
}
