class Z16
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		for(int i = 1; System.out.println("init:" + i);
			test(i);
			System.out.println("before changes:" + i); i++;
			System.out.println("after changes:" + i));
		{
			System.out.println("loop body:" + i);
		}
	}
	static boolean test(int i)
		{
		boolean b1 = (i <= 5);
		System.out.println("boolean for " + i + " is " + b1);
		return b1;
	}
}
