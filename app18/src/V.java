class A 
{
	int i;
}
class V
{
	int j;
	A a1;  //   has-a relation
	void test()
	{
		j = 90;
		a1.i = 200;
	}
	public static void main(String[] args) 
	{
		V v1 = new V();
		v1.test();
		System.out.println("main");
	}
}

// all derived attribute default value is null.