class O
{
	public static void main(String[] args) 
	{
		int i = 5;
		int j =i-- + i-- + i-- + i-- + i-- + i-- + i-- + i-- + i-- + i;
		//      5    4     3     2     1     0     -1    -2    -3    -4 
		System.out.println(i);  //  -4
		System.out.println(j);  //   5
	}
}
