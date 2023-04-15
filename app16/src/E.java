class E
{
	int i;
	E(int x)
	{
		i = x;
	}
	public static void main(String[] args) 
	{
		E e1 = new E(10);
		System.out.println(e1.i);
		E e2 = new E(20);
		System.out.println(e2.i);
	}
}
