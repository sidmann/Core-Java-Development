class A
{
	static A a1;
	private A() 
	{
		System.out.println("A()");
	}

	static A getObject()
	{
		if (a1 == null)
		{
			a1 = new A();
		}
		return a1;
	}
}
class M2
{
	public static void main(String[] args)
	{
		A a1 = A.getObject();
		A a2 = A.getObject();
		A a3 = A.getObject();
		A a4 = A.getObject();
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
	}
}
