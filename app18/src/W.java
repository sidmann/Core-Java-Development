class A 
{
	int i;
}
class W
{
	int j;
	A a1 = new A();
	void test()
	{
		j = 90;
		a1.i = 200;
	}
	public static void main(String[] args) 
	{
		W w1 = new W();
		w1.test();
		System.out.println("main");
	}
}

// all derived attribute default value is null.