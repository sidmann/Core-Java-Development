class E 
{
	public static void main(String[] args) 
	{
		boolean b1 = true;
		boolean b2 = !b1;
		System.out.println(b1 || b2);
		System.out.println(b1 || !b2);
		System.out.println(!b1 || b2);
		System.out.println(!b1 || !b2);
		System.out.println(b1);
		System.out.println(b2);
	}
}
