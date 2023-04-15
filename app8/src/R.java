class R
{
	public static void main(String[] args) 
	{
		if(args.length == 0)
		{
			System.out.println("pls supply one int command line argument");
			return;
		}
		String s1 = args[0];
		int i = Integer.parseInt(s1);
		double d1 = Math.sqrt(i);
		System.out.println(d1);
	}
}
