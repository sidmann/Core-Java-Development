class A
{
	static int i;
	static void test1()
	{
		System.out.println("test1-A");
	}
}
class H extends A
{
	static int j;
	static void test2()
	{
		System.out.println("test2-H");
	}
	public static void main(String[] args) 
	{
		System.out.println(H.i);
		System.out.println(H.j);
		H.test1();
		H.test2();
	}
}
