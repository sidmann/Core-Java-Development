class F
{
	static int i;

	F()
	{
		i++;
	}

	public static void main(String[] args) 
	{
		F f1 = new F();
		F f2 = new F();
		F f3 = new F();
		System.out.println(i);
	}
}
