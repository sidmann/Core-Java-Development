class A
{
	static int i;
	static
	{
		System.out.println("A-sib");
	}
}
class Z
{
	static
	{
		System.out.println("Z-sib");
	}
	public static void main(String[] args)
	{
		System.out.println("main begin");
		System.out.println(A.i);
		System.out.println("main end");
	}
}
