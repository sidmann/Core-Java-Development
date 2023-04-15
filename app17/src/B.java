class B
{
	B()
	{
		System.out.println("B()");
	}

	B(int i)
	{
		System.out.println("B(int)");
	}

	{
		System.out.println("B-IIB");
	}

	public static void main(String[] args) 
	{
		System.out.println("main begin");
		B b1 = new B();
		System.out.println("----------");
		B b2 = new B(30);
		System.out.println("----------");
		System.out.println("main end");
	}
}
