interface A
{
}
class Z15
{
	public static void main(String[] args)
	{
		System.out.println("main begin");
		A c1 = test1();
		System.out.println("main end: " + c1);
	}
	public static A test1()
	{
		System.out.println("from a test1");
		return null;
	}
}
