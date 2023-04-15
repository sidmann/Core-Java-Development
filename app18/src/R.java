class A 
{
	A()
	{
		System.out.println("A()");
	}
}
class R extends A
{
	void test()
	{
		super();
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
