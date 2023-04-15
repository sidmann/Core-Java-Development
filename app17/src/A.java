class A 
{
	A()
	{
		System.out.println("A()");
	}

	A(int i)
	{
		System.out.println("A(int)");
	}

	public static void main(String[] args) 
	{
		System.out.println("main begin");
		A a1 = new A();
		System.out.println("----------");
		A a2 = new A(30);
		System.out.println("----------");
		System.out.println("main end");
	}
}
