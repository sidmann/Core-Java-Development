class D
{
	void test1()
	{
		System.out.println("from test1-D");
	}
	void test2()
	{
		System.out.println("from test2-D");
	}
}
class E extends D
{
	void test3()
	{
		System.out.println("from test3-E");
	}
	void test4()
	{
		System.out.println("from test4-E");
	}

	public static void main(String[] args) 
	{
		E e1 = new E();
		e1.test1();
		e1.test2();
		e1.test3();
		e1.test4();
		System.out.println("done"); 
	}
}
