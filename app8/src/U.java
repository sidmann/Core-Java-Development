class U
{
	public static void main(String[] args) 
	{
		if (args.length < 3)
		{
			System.out.println("pls supply one int command line argument");
			return;
		}
		String s1 = args[0];
		String s2 = args[1];
		String s3 = args[2];
		int i = Integer.parseInt(s1);
		int j = Integer.parseInt(s2);
		int k = Integer.parseInt(s3);
		int min = i < j ? (i < k ? i : k) : (j < k ? j : k); // nested ternary
		int max = i > j ? (i > k ? i : k) : (j > k ? j : k); // nested ternary
		System.out.println("min : " + min);
		System.out.println("max : " + max);
	}
}
