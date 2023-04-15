class D
{
	public static void main(String[] args) 
	{
		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b1 || b2);
		System.out.println(!b1 || b2);
		System.out.println(!b1 || !b2);
		System.out.println(b1 || !b2);
		System.out.println(b1 || true);
		System.out.println(b1 || false);
		System.out.println(b2 || false);
		System.out.println(b2 || true);
		System.out.println(!b1 || true);
		System.out.println(b1 || !false);
		System.out.println(!b2 || false);
		System.out.println(b2 || true);
		
	}
}
