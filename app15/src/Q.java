class Q
{
	int i;

	static Q test()
	{
		Q q1 = new Q();
		q1.i = 10;
		return q1;
	}
	public static void main(String[] args)
	{
		System.out.println("main begin");
		Q obj = test();
		System.out.println("main end:" + obj.i);

	}
}
