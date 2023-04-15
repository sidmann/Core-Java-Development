class N
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
			case 1:
				System.out.println("Monday");
				break;
			case 2:
			    System.out.println("Tuesday");
			    break;
			case 3:
			    System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
			    System.out.println("Friday");
			    break;
			case 6:
			    System.out.println("Saturday");
			    break;
			case 7:
			    System.out.println("Sunday");
			    break;
			default:
			    System.out.println("Pls enter number between 1 to 7");
			    break;
		}
	}
}
