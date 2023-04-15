class N
{
	N()
	{
		this(10, 20);
		System.out.println("N()");
	}
	N(int i, int j)
	{
		System.out.println("N(10, 20)");
	}
	public static void main(String[] args) 
	{
		N n1 = new N();
		System.out.println("--------");
		N n2 = new N(90, 600);
	}
}
