class N
{
	public static void main(String[] args) 
	{
		int i = 0;
		System.out.println(false || (i++ == i++));
		System.out.println(i);
	}
}
