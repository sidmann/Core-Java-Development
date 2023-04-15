class I
{
	int a;

	public static void main(String[] args)
	{
		I i1 = new I();
		System.out.println(i1.a);
		i1.a = 20;
		System.out.println(i1.a);
		I i2 = new I();
		System.out.println(i2.a);
		i2.a = 30;
		System.out.println(i1.a);
		System.out.println(i2.a);
	}
}
