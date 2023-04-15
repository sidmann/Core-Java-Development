class C
{
	int i;

	C()
	{
		i = 10;
	}
	public static void main(String[] args) 
	{
		C c1 = new C();
		System.out.println(c1.i);
		c1.i = 300;
		System.out.println(c1.i);
	}
}
