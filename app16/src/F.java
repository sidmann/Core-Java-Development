class F
{
	int i, j;

	F(int a, int b)
	{
		i = a;
		j = b;
	}
	public static void main(String[] args) 
	{
		F f1 = new F(10, 20);
		F f2 = new F(120, 290);
		System.out.println(f1.i + ", " + f1.j);
		System.out.println(f2.i + ", " + f2.j);
	}
}
