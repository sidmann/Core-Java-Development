class E
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if (false)
		{
			System.out.println("else");
		}
		else
		{
			int i = 0;
			System.out.println("else");
			System.out.println("else" + i);
			i++;
			System.out.println("else:" + i);
	    }
		System.out.println("main end");
	}
}
