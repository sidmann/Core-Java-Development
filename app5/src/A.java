class A 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if (true)
		{
			System.out.println("main begin");
		}
		else
		{
			System.out.println("main end");
	    }
		System.out.println("main end");
	}
}
// else block should be immediate after if block,
// without if block else block can't be possible,
// in between if & else we can't develop any statements,
// else is only for executing something whenever if is not executing,
