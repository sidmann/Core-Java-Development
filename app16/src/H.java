class H
{
	H(int i, int j)
	{
		System.out.println("H(int, int)");
	}
	H(int i, double j)
	{
		System.out.println("H(int, double)");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		H h1 = new H(10, 30);
		System.out.println("----------");
		H h2 = new H(20, 4.5);
		System.out.println("----------");
		System.out.println("main end");
	}
}
