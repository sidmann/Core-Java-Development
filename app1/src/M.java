class M
{
	public static void main(String[] args) 
	{
		int i = 1;
		int j =i++ + i + i++ + i + i++ + i;
		//      1    2   2     3   3     4
		System.out.println(i);  //  4
		System.out.println(j);  //  15
	}
}
