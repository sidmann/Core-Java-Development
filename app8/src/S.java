class S
{
	public static void main(String[] args) 
	{
		if (args.length == 0)
		{
			System.out.println("pls supply one int command line argument");
			return;
		}
		String s1 = args[0];
		String s2 = args[1];
		int i = Integer.parseInt(s1);
		int j = Integer.parseInt(s2);
		int min = i < j ? i : j;
		int max = i > j ? i : j;
		System.out.println("min : " + min);
		System.out.println("max : " + max);
	}
}
