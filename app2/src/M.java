class M
{
	public static void main(String[] args) 
	{
		int i = 0;
		System.out.println(true || (i++ == i++));
		// if any one operant is a true, then second operant not executed.
		System.out.println(i);
	}
}
