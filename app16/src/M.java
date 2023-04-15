class M
{
	M()
	{
		this(100); // current class with integer argument constructor
		System.out.println("M()");
	}
	M(int i)
	{
		System.out.println("M(int)");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		M obj1 = new M();
		System.out.println("----------");
		M obj2 = new M(10);
		System.out.println("main end");
	}
}
