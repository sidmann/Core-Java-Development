class X
{
	X()
	{
		System.out.println("from constructor: " + this);
	}
	void test()
	{
		System.out.println("from test: " + this);
	}
	public static void main(String[] args) 
	{
		X obj1 = new X();
		System.out.println("from main: " + obj1);
		obj1.test();
		X obj2 = new X();
		System.out.println("from main: " + obj2);
		obj2.test();
	}
}
