class Z4
{
	public static void main(String[] args) 
	{
		int i = 10;
		final int j;
		j = 10;
		switch(i)
		{
			case 5:
				System.out.println("case 6");
				break;
			case j:
				System.out.println("case 10");
				break;
		}
	}
}
