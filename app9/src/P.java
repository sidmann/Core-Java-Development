class P
{
	public static void main(String[] args) 
	{
		if (args.length == 0)
		{
			System.out.println("pls supply one int command line argument");
			return;
		}
		int i = Integer.parseInt(args[0]);
		int remainder = i % 2;
		switch(remainder)
		{
			case 1:
				System.out.println("Odd");
				break;
			case 0:
			    System.out.println("Even");
			    break;
			default:
			    System.out.println("Pls enter number between 1 to 10");
			    break;
		}
	}
}
