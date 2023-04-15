class Z21
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 200;
		for(i = 1; i <= 5; i++);
		{
			System.out.println("stmt1:" + i);
			i += 20;
		}
		System.out.println("main end:" + i);
	}
}
