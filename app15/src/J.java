class J
{
	int a;
	int b;
	public static void main(String[] args)
	{
		J j1 = new J();
		System.out.println(j1.a + ", " + j1.b);
		J j2 = new J();
		System.out.println(j2.a + ", " + j2.b);
		j1.a = 10;
		j1.b = 20;
		j2.a = 30;
		j2.b = 40;
		System.out.println(j1.a + ", " + j1.b);
		System.out.println(j2.a + ", " + j2.b);
	}
}
