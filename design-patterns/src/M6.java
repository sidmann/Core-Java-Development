class A
{
	private static A[] objects = new A[12];
	private static int counter;
	static
	{
		for (int i = 0; i < objects.length; i++)
		{
			objects[i] = new A();
		}
	}

	public static A getObject()
	{
		if (counter == 12)
		{
			counter = 0;
		}
		return objects[counter++];
	}
}
class M6
{
	public static void main(String[] args)
	{
		A a1 = A.getObject();
		A a2 = A.getObject();
		A a3 = A.getObject();
		A a4 = A.getObject();
		A a5 = A.getObject();
		A a6 = A.getObject();
		A a7 = A.getObject();
		A a8 = A.getObject();
		A a9 = A.getObject();
		A a10 = A.getObject();
		A a11 = A.getObject();
		A a12 = A.getObject();
		A a13 = A.getObject();
		A a14 = A.getObject();
		A a15 = A.getObject();
		A a16 = A.getObject();
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a5);
		System.out.println(a6);
		System.out.println(a7);
		System.out.println(a8);
		System.out.println(a9);
		System.out.println(a10);
		System.out.println(a11);
		System.out.println(a12);
		System.out.println(a13);
		System.out.println(a14);
		System.out.println(a15);
		System.out.println(a16);
	}
}
