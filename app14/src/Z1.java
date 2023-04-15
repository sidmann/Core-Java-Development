class A
{
	static int i;
	static
	{
		System.out.println("A-sib");
	}
}
class Z1
{
	static
	{
		System.out.println("Z1-sib");
	}
	public static void main(String[] args)
	{
		System.out.println("main begin");
		System.out.println(A.i);
		A.i = 10;
		System.out.println(A.i);
		A.i = 20;
		System.out.println(A.i);
		System.out.println("main end");
	}
}
