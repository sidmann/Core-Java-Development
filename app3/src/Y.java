class Y
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 10;
		if(++i == i++ && ++i == i++)
		{
		   System.out.println("if-block-stmt1:" + i);
		   i += 5; // i = i + 5;
		}
		System.out.println("main end:" + i);
	}
}
