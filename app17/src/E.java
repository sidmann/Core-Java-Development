class E
{
	static int i;

	E()
	{
		System.out.println("E():" + i);
	}

	{
		System.out.println("E-IIB:" + i);
	}

	public static void main(String[] args) 
	{
		E e1 = new E();
		System.out.println("main:" + i);
		System.out.println("main:" + e1.i);
		System.out.println("main:" + E.i);
	}
}
