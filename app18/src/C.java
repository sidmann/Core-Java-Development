class A
{
	void test1()
	{
		System.out.println("from test1");
	}
}
class C extends A
{
	void test2()
	{
		System.out.println("from test2");
	}
	public static void main(String[] args) 
	{
		C c1 = new C();
		c1.test1();
		c1.test2();
		System.out.println("main end"); 
	}
}
