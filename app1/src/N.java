class N
{
	public static void main(String[] args) 
	{
		int i = 5;
		int j =i-- + i + i-- + i + i-- + i + i-- + i + i-- + i;
		//      5    4    4    3   3     2    2    1    1    0 
		System.out.println(i);  //  0
		System.out.println(j);  //  25
	}
}
