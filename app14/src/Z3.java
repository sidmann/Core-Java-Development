class A
{
	public static void main(String[] args)
	{
		System.out.println("A main");
	}
}
class Z3
{
	public static void main(String[] args)
	{
		System.out.println("Z3-main-begin");
		A.main(args);
		System.out.println("Z3-main-end");
	}
}
