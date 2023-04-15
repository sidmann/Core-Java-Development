class A
{
	A()
	{
		System.out.println("A()");
	}
	A(int i)
	{
		System.out.println("A(int)");
	}
	A(int i, int j)
	{
		System.out.println("A(int, int)");
	}
}
class Q extends A
{
	Q()
	{
		super(9);
		System.out.println("Q()");
	}
	Q(int i)
	{
		super();
		System.out.println("Q(int)");
	}
	Q(int i, int j)
	{
		super(10, 20);
		System.out.println("Q(int, int)");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		Q q1 = new Q();
		System.out.println("-----------");
		Q q2 = new Q(100);
		System.out.println("-----------");
		Q q3 = new Q(100, 200);
		System.out.println("main end");
	}
}
