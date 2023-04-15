class A extends Object
{
	A()
	{
		System.out.println("A()");
	}
}
class I extends A
{
	I()
	{
		super();
		System.out.println("I()");
	}
	public static void main(String[] args) 
	{
		I obj = new I();
		System.out.println("done");
	}
}
