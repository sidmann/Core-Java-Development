class A 
{
	void test1()
	{
		System.out.println("A-test1");
	}
}
class S extends A
{
	void someThing()
	{
		System.out.println("someThing begin");
		super.test1();
		System.out.println("someThing end");
	}
	public static void main(String[] args) 
	{
		S s1 = new S();
		s1.someThing();
		System.out.println("end");
	}
}
