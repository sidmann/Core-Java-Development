class E
{
	public static void main(String[] args) 
	{
		System.out.println("E-main1");
		D.main(args);
		System.out.println("----------");
		assert false;
		System.out.println("E-main2");
	}
}
