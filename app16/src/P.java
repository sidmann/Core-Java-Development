class P
{
	P(int i)
	{
		this();
		System.out.println("P(int)");
	}
	P()
	{
		System.out.println("P()");
	}
	P(double i, int j)
	{
		this(j);
		System.out.println("P(double, int)");
	}
	public static void main(String[] args) 
	{
		P p1 = new P(1.5, 100);
		System.out.println("--------");
		P p2 = new P(100);
		System.out.println("--------");
		P p3 = new P();
		System.out.println("--------");
	}
}
