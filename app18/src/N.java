class A
{
	A(int i)
	{
		System.out.println("A(int)");
	}
}
class N extends A
{
	N()
	{
		super(10);
		System.out.println("N()");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		N n1 = new N();
		System.out.println("main end");
	}
}
