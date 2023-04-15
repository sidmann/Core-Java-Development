class A
{
	A(int i)
	{
		System.out.println("A(int)");
	}
	A()
	{
		System.out.println("A()");
	}
}
class O extends A
{
	O()
	{
		System.out.println("O()");
	}
	O(int i)
	{
		System.out.println("O(int)");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		O o1 = new O();
		System.out.println("-----------");
		O o2 = new O(100);
		System.out.println("main end");
	}
}
