class P
{
	public static void main(String[] args) 
	{
		int i = 5;
		int j =i++ + i++ + i++ + i++ + i++ + i++ + i++ + i++ + i++ + i;
		//       5     6    7     8     9     10    11    12    13   14
		System.out.println(i);  //  14
		System.out.println(j);  //  95
	}
}
