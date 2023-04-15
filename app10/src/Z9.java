class Z9
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 5;
		for( ; ; )
		{
			System.out.println("loop begin:" + i);
			System.out.println("loop end  :" + i);
			i++;
		}
		//System.out.println("main end  :" + i);
	}
}

// infinite execution.