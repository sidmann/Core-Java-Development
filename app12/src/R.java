class R
{
	public static void main(String[] args)
	{
		System.out.println("main begin");
		if (args.length == 0)
		{
			System.out.println("pls supply one command line arg");
			return;
		}
		String s1 = args[0];
		System.out.println("your command line arg is :" + s1);
		System.out.println("main end");
	}

}
