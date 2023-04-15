class Z8
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 5;
		for( ; i <= 10; )
		{
			System.out.println("loop begin:" + i);
			System.out.println("loop end  :" + i);
			i++;
		}
		System.out.println("main end  :" + i);
	}
}
