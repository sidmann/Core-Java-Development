class O
{
	public static void main(String[] args) 
	{
		if (args.length == 0)
		{
			System.out.println("pls supply one int command line argument");
			return;
		}
		String s1 = args[0];
		int i = Integer.parseInt(s1);
		switch(i)
		{
			case 1, 3, 5, 7, 9:
				System.out.println("Odd");
				break;
			case 2, 4, 6, 8, 10:
			    System.out.println("Even");
			    break;
			default:
			    System.out.println("Pls enter number between 1 to 10");
			    break;
		}
	}
}
