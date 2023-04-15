class R
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 0;
		if(++i == i++ && ++i == i++)
		{
			System.out.println("if:" + i);
			i += 3;
		}
		else
		{
			System.out.println("else-stmt1:" + i);
			i += 5;
		}
		System.out.println("main end:" + i);
	}
}


