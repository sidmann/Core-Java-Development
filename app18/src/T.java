class A 
{
	static
	{
		System.out.println("A()");
	}
}
class T extends A
{
	static
	{
		System.out.println("T()");
	}
	public static void main(String[] args) 
	{
		System.out.println("main");
	}
}