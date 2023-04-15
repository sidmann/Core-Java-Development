class K
{
	static int a = 10;
	static int b;
	static int c = 20;
	public static void main(String[] args) 
	{
		System.out.println(a + ", " + b + ", " + c);
		b = a + b;
		c = a + b;
		a = a + c;
		System.out.println(a + ", " + b + ", " + c);
	}
}
