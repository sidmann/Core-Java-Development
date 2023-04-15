class L
{
	L()
	{
		System.out.println("L()");
	}
	L(int i)
	{
		this(); 
		System.out.println("L(int)");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		L obj1 = new L();
		System.out.println("----------");
		L obj2 = new L(10);
		System.out.println("main end");
	}
}
