class B
{
	public static void main(String[] args) 
	{
		System.out.println("main1");
		assert false : "some thing went wrong";
		System.out.println("main2");
	}
}
