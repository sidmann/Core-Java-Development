class K
{
	public static void main(String[] args) 
	{
		int i = 5;
		int j =i-- + i;
		//     5     4 
		System.out.println(i);  //  4
		System.out.println(j);  //  9
	}
}
