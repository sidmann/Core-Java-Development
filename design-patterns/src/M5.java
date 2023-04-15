class A
{
	private static A[] objects = new A[2];
	private static int counter;
	static
	{
		objects[0] = new A();
		objects[1] = new A();
	}

	public static A getObject()
	{
		return objects[(counter++) % 2];
	}
}
class M5
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
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a5);
		System.out.println(a6);
		System.out.println(a7);
	}
}
