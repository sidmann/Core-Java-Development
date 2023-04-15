class Z
{
	public static void main(String[] args) 
	{
		int i = 6;
		int j = --i + i + --i + i + --i + i + --i + i;
		//       5    5    4    4    3    3   2     2
		System.out.println(i); // 2
		System.out.println(j); // 28
	}
}
