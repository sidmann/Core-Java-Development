class C 
{
	C()
	{
		System.out.println("C()");
	}

	C(int i)
	{
		this();
		System.out.println("C(int)");
	}

	{
		System.out.println("C-IIB1");
	}

	public static void main(String[] args) 
	{
		C c1 = new C();
		System.out.println("------------");
		C c2 = new C(100);
		System.out.println("------------");
		C c3 = new C(200);
	}

	{
		System.out.println("C-IIB2");
	}
}
