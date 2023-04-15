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
class P extends A
{
	P()
	{
		System.out.println("P()");
	}
	P(int i)
	{
		System.out.println("P(int)");
	}
	P(int i, int j)
	{
		System.out.println("P(int, int)");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		P p1 = new P();
		System.out.println("-----------");
		P p2 = new P(100);
		System.out.println("-----------");
		P p3 = new P(100, 200);
		System.out.println("main end");
	}
}
