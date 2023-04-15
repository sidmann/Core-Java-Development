class S
{
	static int i = 200;
	public static void main(String[] args) 
	{
		System.out.println("m1:" + S.i);
		S.i = 300;
		System.out.println("m2:" + S.i);
	}
}
